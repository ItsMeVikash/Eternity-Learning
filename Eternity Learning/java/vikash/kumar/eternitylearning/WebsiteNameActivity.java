package vikash.kumar.eternitylearning;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.AppBarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import com.thefinestartist.finestwebview.FinestWebView;

import java.util.ArrayList;
import java.util.List;

public class WebsiteNameActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private WebaiteNameAdapter adapter;
    private List<WebsiteNameBean> websiteNameBeanList;
    private String websiteName;
    private  static String[] returnedUrl;
    private String returnedPicUrl;
    private Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website_name);
        //Get WebsiteName from search fragment
        websiteName=getIntent().getExtras().getString("WebsiteName");

        final Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle(websiteName.toUpperCase());
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        websiteNameBeanList = new ArrayList<>();
        adapter = new WebaiteNameAdapter(getApplicationContext(), websiteNameBeanList);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getApplicationContext(), 1);
        DividerItemDecoration itemDecorator = new DividerItemDecoration(getApplicationContext(), DividerItemDecoration.VERTICAL);
        itemDecorator.setDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.cardview_divider));
        recyclerView.addItemDecoration(itemDecorator);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        prepareWebsiteNames();//change here
        recyclerView.setAdapter(adapter);

        //Collapsable Toolbar
        ImageView expandedImage=findViewById(R.id.expandedImage);
        if (returnedPicUrl!=null)
            Picasso.with(getApplicationContext()).load(returnedPicUrl.trim()).fit().into(expandedImage);
        else
            Toast.makeText(this, "Problem in Loading Image !!", Toast.LENGTH_SHORT).show();

        AppBarLayout mAppBarLayout = (AppBarLayout) findViewById(R.id.app_bar);
        mAppBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {
                    isShow = true;
                    showOption(R.id.report_link);
                } else if (isShow) {
                    isShow = false;
                    hideOption(R.id.report_link);
                }
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        this.menu = menu;
        getMenuInflater().inflate(R.menu.report_link, menu);
        hideOption(R.id.report_link);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }else if (item.getItemId() == R.id.report_link) {
            showDialogMenu();
        }
        return super.onOptionsItemSelected(item);
    }
    private void showDialogMenu(){

        final TextView message = new TextView(WebsiteNameActivity.this);
        message.setText(Html.fromHtml(
                        "<br>Report here for Broken Link if not working. We will make it work ASAP. Have you found any broken link?" +
                                "<br><br><a href=\"mailto:techeternityhub@gmail.com\">Report Here</a> "));
        message.setMovementMethod(LinkMovementMethod.getInstance());
        message.setPadding(70,10,10,10);
        message.setTextColor(Color.parseColor("#000000"));
        message.setTextSize(16);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(WebsiteNameActivity.this);
        alertDialogBuilder.setTitle("REPORT LINK");
        alertDialogBuilder
                .setView(message)
                .setCancelable(true)
                .setPositiveButton("CANCEL",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    private void hideOption(int id) {
        MenuItem item = menu.findItem(id);
        item.setVisible(false);
    }

    private void showOption(int id) {
        MenuItem item = menu.findItem(id);
        item.setVisible(true);
    }
    private void prepareWebsiteNames() {
        Object o[]=WebsiteNameUrlUtil.getWebsiteNames(websiteName);
        String name[]=(String[])o[0];
        if (o[1]!=null)
        returnedUrl=(String[])o[1];
        if (o[2]!=null)
        returnedPicUrl=(String)o[2];

        if (name!=null){
            for (String str : name) {
                WebsiteNameBean  nameBean= new WebsiteNameBean(str);
                websiteNameBeanList.add(nameBean);
            }
        }else{
            Toast.makeText(this, "Oops !! Something Wrong", Toast.LENGTH_SHORT).show();
        }

        adapter.notifyDataSetChanged();

    }
    //saving url to load in webview
    public static String[] websitesurl(){
        return returnedUrl;
    }
}
//Adapter CLass
class WebaiteNameAdapter extends RecyclerView.Adapter<WebaiteNameAdapter.MyViewHolder> {

    private Context mContext;
    private List<WebsiteNameBean> websiteNameList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView website_name;
        private CardView website_name_card;
        private String urls[]=WebsiteNameActivity.websitesurl();
        public MyViewHolder(View view) {
            super(view);
            website_name = (TextView) view.findViewById(R.id.website_name);
            website_name_card = (CardView) view.findViewById(R.id.website_name_card);
            website_name_card.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    new FinestWebView.Builder(mContext).show(urls[getAdapterPosition()]);
                }
            });

        }
    }


    public WebaiteNameAdapter(Context mContext, List<WebsiteNameBean> websiteNameList) {
        this.mContext = mContext;
        this.websiteNameList = websiteNameList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.website_name_card, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        WebsiteNameBean bean = websiteNameList.get(position);
        holder.website_name.setText(bean.getWebsiteName());

    }

    @Override
    public int getItemCount() {
        return websiteNameList.size();
    }
}

