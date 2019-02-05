package vikash.kumar.eternitylearning.fragments.home.adapter;

import ss.com.bannerslider.adapters.SliderAdapter;
import ss.com.bannerslider.viewholder.ImageSlideViewHolder;

public class MainSliderAdapter extends SliderAdapter {

    @Override
    public int getItemCount() {
        return 11;
    }

    @Override
    public void onBindImageSlide(int position, ImageSlideViewHolder viewHolder) {
        switch (position) {
            case 0:
                viewHolder.bindImageSlide("https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/1st.jpg?raw=true");
                break;
            case 1:
                viewHolder.bindImageSlide("https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/android.jpg?raw=true");
                break;
            case 2:
                viewHolder.bindImageSlide("https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/currentaffairs.jpg?raw=true");
                break;
            case 3:
                viewHolder.bindImageSlide("https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/gate.jpg?raw=true");
                break;
            case 4:
                viewHolder.bindImageSlide("https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/iit.jpg?raw=true");
                break;
            case 5:
                viewHolder.bindImageSlide("https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/interview.jpg?raw=true");
                break;
            case 6:
                viewHolder.bindImageSlide("https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/java.jpg?raw=true");
                break;
            case 7:
                viewHolder.bindImageSlide("https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/job.jpg?raw=true");
                break;
            case 8:
                viewHolder.bindImageSlide("https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/photography.jpg?raw=true");
                break;
            case 9:
                viewHolder.bindImageSlide("https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/upsc.jpg?raw=true");
                break;
            case 10:
                viewHolder.bindImageSlide("https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/python.jpg?raw=true");
                break;


        }
    }

}