package vikash.kumar.eternitylearning.fragments.search;


import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import vikash.kumar.eternitylearning.R;
import vikash.kumar.eternitylearning.WebsiteNameActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {

    private RecyclerView recyclerView;
    private CourseItemAdapter adapter;
    private List<Search_Item> courseNameList;

    public SearchFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static SearchFragment newInstance() {
        SearchFragment fragment = new SearchFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        courseNameList = new ArrayList<>();
        adapter = new CourseItemAdapter(getContext(), courseNameList);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getContext(), 1);
        DividerItemDecoration itemDecorator = new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL);
        itemDecorator.setDrawable(ContextCompat.getDrawable(getContext(), R.drawable.cardview_divider));
        recyclerView.addItemDecoration(itemDecorator);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        prepareCourses();
        recyclerView.setAdapter(adapter);

        //Search List
        SearchView searchView=view.findViewById(R.id.searchView);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                filter(s);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                filter(s);
                return true;
            }
        });


        return view;

    }
    private void filter(String text) {
        ArrayList<Search_Item> filteredList = new ArrayList<>();

        for (Search_Item item : courseNameList) {
            if (item.getCourse_name().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
        }

        adapter.filterList(filteredList);
    }

    private void prepareCourses() {
        String courses[] = {"Android Development", "Angular JS", "C", "C++", "Current Affairs", "Entrance Exam", "Gate", "GK", " Html/CSS",
                "Interview", "IOS Development", "JEE", "Java", "Javascript", "Job Search", "Junit", " Mysql", "Online Compiler",
                " Photography", "PHP", "Python", "Quiz", "Selenium", "Servlet", "Spring", "TestNG", "UPSC"};
        for (String str : courses) {
            Search_Item search_item = new Search_Item(str);
            courseNameList.add(search_item);
        }
        adapter.notifyDataSetChanged();

    }
    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().hide();
    }
    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity)getActivity()).getSupportActionBar().show();
    }
}
//Adapter CLass
 class CourseItemAdapter extends RecyclerView.Adapter<CourseItemAdapter.MyViewHolder> {

    private Context mContext;
    private List<Search_Item> courseList;
    private CardView course_name_card;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView course_name;

        public MyViewHolder(View view) {
            super(view);
            course_name = (TextView) view.findViewById(R.id.course_name);
            course_name_card = (CardView) view.findViewById(R.id.course_name_card);
            course_name_card.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    try {
                        Intent intent = new Intent(mContext, WebsiteNameActivity.class);
                        intent.putExtra("WebsiteName", courseList.get(getAdapterPosition()).getCourse_name().trim());
                        mContext.startActivity(intent);
                    } catch(Exception e) {
                        Toast.makeText(mContext, "Oops !! Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                }
            });

        }
    }


    public CourseItemAdapter(Context mContext, List<Search_Item> courseList) {
        this.mContext = mContext;
        this.courseList = courseList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.search_item_card, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        Search_Item course = courseList.get(position);
        holder.course_name.setText(course.getCourse_name());

    }

    @Override
    public int getItemCount() {
        return courseList.size();
    }
    public void filterList(ArrayList<Search_Item> filteredList) {
        courseList = filteredList;
        notifyDataSetChanged();
    }
}
