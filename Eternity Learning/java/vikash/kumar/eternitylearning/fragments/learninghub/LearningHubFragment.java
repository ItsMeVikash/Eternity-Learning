package vikash.kumar.eternitylearning.fragments.learninghub;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import vikash.kumar.eternitylearning.R;
import vikash.kumar.eternitylearning.WebsiteNameActivity;


public class LearningHubFragment extends Fragment {

    private RecyclerView recyclerView;
    private CourseListAdapter adapter;
    private List<CourseListPOJO> courseListPOJOS;

    public LearningHubFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static LearningHubFragment newInstance() {
        LearningHubFragment fragment = new LearningHubFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_learning_hub, container, false);
        recyclerView = (RecyclerView)view.findViewById(R.id.recycler_view);

        courseListPOJOS = new ArrayList<>();
        adapter = new CourseListAdapter(getContext(), courseListPOJOS);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(0), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        prepareListItems();


        return view;
    }
    private void prepareListItems() {
        String courseTitle[] = {"Android Development", "Angular JS", "C", "C++", "Current Affairs", "Entrance Exam", "Gate", "GK", " Html/CSS",
                "Interview", "IOS Development", "JEE", "Java", "Javascript", "Job Search", "Junit", " Mysql", "Online Compiler",
                " Photography", "PHP", "Python", "Quiz", "Selenium", "Servlet", "Spring", "TestNG", "UPSC"};
        String coursePicUrl[]={
                "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/android.jpg?raw=true",
                "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/angularjs.jpg?raw=true",
                "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/c.jpg?raw=true",
                "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/cpp.png?raw=true",
                "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/currentaffairs.jpg?raw=true",
                "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/entranceexam.jpg?raw=true",
                "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/gate.jpg?raw=true",
                "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/gk.jpeg?raw=true",
                "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/html.jpg?raw=true",
                "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/interview.jpg?raw=true",
                "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/ios.jpg?raw=true",
                "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/iit.jpg?raw=true",
                "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/java.jpg?raw=true",
                "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/javascript.png?raw=true",
                "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/job.jpg?raw=true",
                "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/junit.png?raw=true",
                "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/mysql.jpg?raw=true",
                "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/compiler.jpg?raw=true",
                "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/photography.jpg?raw=true",
                "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/php.jpg?raw=true",
                "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/python.jpg?raw=true",
                "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/quiz.jpg?raw=true",
                "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/selenium.jpg?raw=true",
                "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/servlet.png?raw=true",
                "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/spring.png?raw=true",
                "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/testng.png?raw=true",
                "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/upsc.jpg?raw=true"
        };

        String courseDescription[]={
                "Want to design the most beloved thing - Android Mobile",
                "What HTML would have been, had it been designed for building web-apps",
                "Let’s Learn how to Code in C",
                "Advance your C abilities by learning deep into CPP",
                "Know what’s going around you",
                "Entry to your dream course",
                "Wanna become a Master!!",
                "Become a human google Guy",
                "Don’t like some websites UI, learn how to create your own",
                "You should be prepared before the Fight. Isn't it ?",
                "Because using iPhone is too mainstream, let’s develop one",
                "JEE itself a whole world. We all know !!",
                "Best coffee, Best and Evergreen Language ",
                "Curious how the backend of your webpage looks – Here is the answer",
                "Get paid for your passion",
                "Get to know how to test your Java code here",
                "Query your database easily by advancing your skills for Back-End",
                "Test your brain child in any language ",
                "Up your Selfie game and Be Oversmart !!",
                "Learn open source general-purpose scripting language",
                "Don’t be afraid Its just a Language ",
                "Exercise your Brain",
                "Let's test the code using Automation Tool",
                "Advance Java at your SERvice",
                "Not a season but a Framework ",
                "If you like finding faults, make it your career",
                "A tough nut to crack, become an example for others"
        };
        for (int i=0;i<courseTitle.length;i++) {
            CourseListPOJO courses = new CourseListPOJO(coursePicUrl[i].trim(),courseTitle[i].trim(),courseDescription[i].trim());
            courseListPOJOS.add(courses);
        }

        adapter.notifyDataSetChanged();

    }
    /**
     * RecyclerView item decoration - give equal margin around grid item
     */
    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view); // item position
            int column = position % spanCount; // item column

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                if (position < spanCount) { // top edge
                    outRect.top = spacing;
                }
                outRect.bottom = spacing; // item bottom
            } else {
                outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing; // item top
                }
            }
        }
    }

    /**
     * Converting dp to pixel
     */
    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
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
//Adapter Class

 class CourseListAdapter extends RecyclerView.Adapter<CourseListAdapter.MyViewHolder> {

    private Context mContext;
    private List<CourseListPOJO> courseList;
    private CardView card_view;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView course_title, course_description;
        public ImageView course_image;

        public MyViewHolder(View view) {
            super(view);
            course_title = (TextView) view.findViewById(R.id.course_title);
            course_description = (TextView) view.findViewById(R.id.course_description);
            course_image = (ImageView) view.findViewById(R.id.course_image);
            card_view = (CardView) view.findViewById(R.id.card_view);
            card_view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    try {
                        Intent intent = new Intent(mContext, WebsiteNameActivity.class);
                        intent.putExtra("WebsiteName", courseList.get(getAdapterPosition()).getCourseTitle().trim());
                        mContext.startActivity(intent);
                    } catch(Exception e) {
                        Toast.makeText(mContext, "Oops !! Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                }
            });

        }
    }


    public CourseListAdapter(Context mContext, List<CourseListPOJO> courseList) {
        this.mContext = mContext;
        this.courseList = courseList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_list_card, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        CourseListPOJO courseListPOJO = courseList.get(position);
        holder.course_title.setText(courseListPOJO.getCourseTitle().trim());
        holder.course_description.setText(courseListPOJO.getCourseDescription().trim());
        Picasso.with(mContext).load(courseListPOJO.getCoursePicUrl().trim()).fit().into(holder.course_image);
    }

    @Override
    public int getItemCount() {
        return courseList.size();
    }
}
