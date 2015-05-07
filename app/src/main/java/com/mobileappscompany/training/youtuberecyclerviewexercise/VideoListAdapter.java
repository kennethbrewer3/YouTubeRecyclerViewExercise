package com.mobileappscompany.training.youtuberecyclerviewexercise;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.mobileappscompany.training.youtuberecyclerviewexercise.domain.youtube.Video;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kenneth Brewer on 5/5/2015.
 */
public class VideoListAdapter extends RecyclerView.Adapter<VideoListAdapter.VideoViewHolder> {
    private static final String TAG = "VideoListAdapter";

    List<Video> videos;
    ImageLoader imageLoader;

    public VideoListAdapter(ImageLoader imageLoader) {
        this(imageLoader,new ArrayList<Video>());
    }

    public VideoListAdapter(ImageLoader imageLoader, List<Video> videos) {
        this.imageLoader = imageLoader;
        this.videos = videos;
    }

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
        NetworkImageView imageView = holder.imageviewIcon;
        TextView textviewTitle = holder.textviewTitle;
        TextView textviewDescription = holder.textviewDescription;
        TextView textviewCategory = holder.textviewCategory;

        imageView.setImageUrl(videos.get(position).getThumbnail().getSqDefault(),imageLoader);
        textviewTitle.setText(videos.get(position).getTitle());
        textviewDescription.setText(videos.get(position).getDescription());
        textviewCategory.setText(videos.get(position).getCategory());
    }

    @Override
    public int getItemCount() {
        return videos.size();
    }

    public static class VideoViewHolder extends RecyclerView.ViewHolder {
        private NetworkImageView imageviewIcon;
        private TextView  textviewTitle;
        private TextView  textviewDescription;
        private TextView  textviewCategory;

        public VideoViewHolder(View itemView) {
            super(itemView);
            this.imageviewIcon = (NetworkImageView)itemView.findViewById(R.id.imageView);
            this.textviewTitle = (TextView)itemView.findViewById(R.id.textviewTitle);
            this.textviewDescription = (TextView)itemView.findViewById(R.id.textviewDescription);
            this.textviewCategory = (TextView)itemView.findViewById(R.id.textviewCategory);
        }
    }
}
