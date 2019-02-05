package vikash.kumar.eternitylearning.fragments.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import ss.com.bannerslider.Slider;
import vikash.kumar.eternitylearning.R;
import vikash.kumar.eternitylearning.WebsiteNameActivity;
import vikash.kumar.eternitylearning.fragments.home.adapter.MainSliderAdapter;
import vikash.kumar.eternitylearning.fragments.home.adapter.PicassoImageLoadingService;

public class HomeFragment extends Fragment {

    private Slider slider;
    private CardView java_card,android_card,python_card,html_card,iit_card,gate_card,jobSearch_card,upsc_card;
    private ImageView java_cardImage,android_cardImage,python_cardImage,html_cardImage,iit_cardImage,gate_cardImage,jobSearch_cardImage,upsc_cardImage;

    public HomeFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Slider.init(new PicassoImageLoadingService(getContext()));
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);
        slider = view.findViewById(R.id.banner_slider1);
        slider.setAdapter(new MainSliderAdapter());
        //animating Textview
        TextView animating_textview=view.findViewById(R.id.animating_textview);
        TranslateAnimation animation = new TranslateAnimation(0.0f, 1500.0f, 0.0f, 0.0f); // new TranslateAnimation (float fromXDelta,float toXDelta, float fromYDelta, float toYDelta)
        animation.setDuration(5000); // animation duration, change accordingly
        animation.setRepeatCount(4); // animation repeat count
        animation.setRepeatMode(2);
        animation.setFillAfter(false);
        animating_textview .startAnimation(animation);

        //finding all cardview
        java_card=view.findViewById(R.id.java_card);
        java_cardImage=view.findViewById(R.id.java_cardImage);
        Picasso.with(getContext())
                .load("https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/java.jpg?raw=true")
                .fit().into(java_cardImage);
        java_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(getContext(), WebsiteNameActivity.class);
                    intent.putExtra("WebsiteName", "Java");
                    getContext().startActivity(intent);
                } catch(Exception e) {
                    Toast.makeText(getContext(), "Oops !! Something Wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        android_card=view.findViewById(R.id.android_card);
        android_cardImage=view.findViewById(R.id.android_cardImage);
        Picasso.with(getContext())
                .load("https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/android.jpg?raw=true")
                .fit().into(android_cardImage);
        android_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(getContext(), WebsiteNameActivity.class);
                    intent.putExtra("WebsiteName", "Android Development");
                    getContext().startActivity(intent);
                } catch(Exception e) {
                    Toast.makeText(getContext(), "Oops !! Something Wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        python_card=view.findViewById(R.id.python_card);
        python_cardImage=view.findViewById(R.id.python_cardImage);
        Picasso.with(getContext())
                .load("https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/python.jpg?raw=true")
                .fit().into(python_cardImage);
        python_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(getContext(), WebsiteNameActivity.class);
                    intent.putExtra("WebsiteName", "Python");
                    getContext().startActivity(intent);
                } catch(Exception e) {
                    Toast.makeText(getContext(), "Oops !! Something Wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });


        html_card=view.findViewById(R.id.html_card);
        html_cardImage=view.findViewById(R.id.html_cardImage);
        Picasso.with(getContext())
                .load("https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/html.jpg?raw=true")
                .fit().into(html_cardImage);
        html_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(getContext(), WebsiteNameActivity.class);
                    intent.putExtra("WebsiteName", "Html/CSS");
                    getContext().startActivity(intent);
                } catch(Exception e) {
                    Toast.makeText(getContext(), "Oops !! Something Wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        iit_card=view.findViewById(R.id.iit_card);
        iit_cardImage=view.findViewById(R.id.iit_cardImage);
        Picasso.with(getContext())
                .load("https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/iit.jpg?raw=true")
                .fit().into(iit_cardImage);
        iit_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(getContext(), WebsiteNameActivity.class);
                    intent.putExtra("WebsiteName", "JEE");
                    getContext().startActivity(intent);
                } catch(Exception e) {
                    Toast.makeText(getContext(), "Oops !! Something Wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        gate_card=view.findViewById(R.id.gate_card);
        gate_cardImage=view.findViewById(R.id.gate_cardImage);
        Picasso.with(getContext())
                .load("https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/gate.jpg?raw=true")
                .fit().into(gate_cardImage);
        gate_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(getContext(), WebsiteNameActivity.class);
                    intent.putExtra("WebsiteName", "Gate");
                    getContext().startActivity(intent);
                } catch(Exception e) {
                    Toast.makeText(getContext(), "Oops !! Something Wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        jobSearch_card=view.findViewById(R.id.jobSearch_card);
        jobSearch_cardImage=view.findViewById(R.id.jobSearch_cardImage);
        Picasso.with(getContext())
                .load("https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/job.jpg?raw=true")
                .fit().into(jobSearch_cardImage);
        jobSearch_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(getContext(), WebsiteNameActivity.class);
                    intent.putExtra("WebsiteName", "Job Search");
                    getContext().startActivity(intent);
                } catch(Exception e) {
                    Toast.makeText(getContext(), "Oops !! Something Wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        upsc_card=view.findViewById(R.id.upsc_card);
        upsc_cardImage=view.findViewById(R.id.upsc_cardImage);
        Picasso.with(getContext())
                .load("https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/upsc.jpg?raw=true")
                .fit().into(upsc_cardImage);
        upsc_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(getContext(), WebsiteNameActivity.class);
                    intent.putExtra("WebsiteName", "UPSC");
                    getContext().startActivity(intent);
                } catch(Exception e) {
                    Toast.makeText(getContext(), "Oops !! Something Wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }
}
