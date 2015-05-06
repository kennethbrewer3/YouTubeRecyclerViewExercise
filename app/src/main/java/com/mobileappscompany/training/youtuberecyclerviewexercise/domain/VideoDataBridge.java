package com.mobileappscompany.training.youtuberecyclerviewexercise.domain;

import com.mobileappscompany.training.youtuberecyclerviewexercise.domain.youtube.Player;
import com.mobileappscompany.training.youtuberecyclerviewexercise.domain.youtube.Thumbnail;

/**
 * Bridge between the GreenDao generated class named Video and the Video class as defined
 * by the YouTube JSon data.
 *
 * Created by Kenneth Brewer on 5/5/2015.
 */
public class VideoDataBridge {
    public static VideoDataBridge instance;

    private VideoDataBridge() {}

    public static VideoDataBridge getInstance() {
        if(instance == null) {
            instance = new VideoDataBridge();
        }
        return instance;
    }

    public com.mobileappscompany.training.youtuberecyclerviewexercise.domain.youtube.Video
        fromYouTube(com.mobileappscompany.training.youtuberecyclerviewexercise.database.Video video){

        Thumbnail thumbnail = new Thumbnail.ThumbnailBuilder().
                hqDefault(video.getHqDefault()).
                sqDefault(video.getSqDefault()).
                build();

        Player player = new Player.PlayerBuilder().defaultPlayer(video.getPlayer()).build();

        com.mobileappscompany.training.youtuberecyclerviewexercise.domain.youtube.Video value =
                new com.mobileappscompany.training.
                        youtuberecyclerviewexercise.domain.youtube.Video.VideoBuilder().
                        id(video.getId()).
                        category(video.getCategory()).
                        title(video.getTitle()).
                        description(video.getDescription()).
                        thumbnail(thumbnail).
                        player(player).
                        build();

        return value;
    }

    public com.mobileappscompany.training.youtuberecyclerviewexercise.database.Video
    fromDatabase(com.mobileappscompany.training.youtuberecyclerviewexercise.domain.youtube.Video video){


        com.mobileappscompany.training.youtuberecyclerviewexercise.database.Video value =
                new com.mobileappscompany.training.youtuberecyclerviewexercise.database.Video();

        value.setId(video.getId());
        value.setCategory(video.getCategory());
        value.setTitle(video.getTitle());
        value.setDescription(video.getDescription());
        value.setHqDefault(video.getThumbnail().getHqDefault());
        value.setSqDefault(video.getThumbnail().getSqDefault());
        value.setPlayer(video.getPlayer().getDefaultPlayer());

        return value;
    }
}
