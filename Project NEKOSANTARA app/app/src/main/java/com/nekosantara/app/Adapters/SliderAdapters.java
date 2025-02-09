package com.nekosantara.app.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.bumptech.glide.request.RequestOptions;
import com.nekosantara.app.Domian.SliderItem;
import com.nekosantara.app.R;

import java.util.List;

public class SliderAdapters extends RecyclerView.Adapter<SliderAdapters.SliderViewHolder> {
    private List<SliderItem> sliderItems;
    private ViewPager2 viewPager2;
    private Context context;

    public SliderAdapters(List<SliderItem> sliderItems, ViewPager2 viewPager2) {
        this.sliderItems = sliderItems;
        this.viewPager2 = viewPager2;
    }

    @NonNull
    @Override
    public SliderAdapters.SliderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context=parent.getContext()
        return new SliderViewHolder(LayoutInflater.from(parent.getContext()).inflate(
                R.layout.slider_item_container,parent,false
        ));
    }

    @Override
    public void onBindViewHolder(@NonNull SliderAdapters.SliderViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class SliderViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        public SliderViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageSlide)
        }
        void setImage(SliderItem sliderItem){
            RequestOptions requestOptions=new RequestOptions();
            requestOptions=requestOptions.transform()
        }
    }
}
