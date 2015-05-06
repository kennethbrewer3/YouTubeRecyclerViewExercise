package com.mobileappscompany.training.youtuberecyclerviewexercise;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mobileappscompany.training.youtuberecyclerviewexercise.domain.youtube.Video;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Android1 on 5/5/2015.
 */
public class VideoListAdapter extends RecyclerView.Adapter<VideoListAdapter.VideoViewHolder> {

    List<Video> videos;

    @Override
    public VideoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_layout, parent, false);

//        view.setOnClickListener(MainActivity.myOnClickListener);

        VideoViewHolder videoViewHolder = new VideoViewHolder(view);
        return videoViewHolder;
    }

    @Override
    public void onBindViewHolder(VideoViewHolder holder, int position) {
        ImageView imageView = holder.imageviewIcon;
        TextView textviewTitle = holder.textviewTitle;
        TextView textviewDescription = holder.textviewDescription;
        TextView textviewCategory = holder.textviewCategory;

//        imageView.setImageResource(videos.get(position).getImage());
//
//        textViewName.setText(peopleDataSet.get(listPosition).getName());
//        textViewEmail.setText(peopleDataSet.get(listPosition).getEmail());
//        imageView.setImageResource(peopleDataSet.get(listPosition).getImage());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public VideoListAdapter(ArrayList<Video> videos) {
        this.videos = videos;
    }

    public static class VideoViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageviewIcon;
        private TextView  textviewTitle;
        private TextView  textviewDescription;
        private TextView  textviewCategory;

        public VideoViewHolder(View itemView) {
            super(itemView);
            this.imageviewIcon = (ImageView)itemView.findViewById(R.id.imageView);
            this.textviewTitle = (TextView)itemView.findViewById(R.id.textviewTitle);
            this.textviewDescription = (TextView)itemView.findViewById(R.id.textviewDescription);
            this.textviewCategory = (TextView)itemView.findViewById(R.id.textviewCategory);
        }
    }
}
