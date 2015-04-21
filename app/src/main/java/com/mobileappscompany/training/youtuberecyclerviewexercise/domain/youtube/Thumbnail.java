package com.mobileappscompany.training.youtuberecyclerviewexercise.domain.youtube;

/**
 * Created by Android1 on 4/20/2015.
 */
public class Thumbnail {
    private String sqDefault;
    private String hqDefault;

    public Thumbnail(String sqDefault, String hqDefault) {
        this.sqDefault = sqDefault;
        this.hqDefault = hqDefault;
    }

    public String getSqDefault() {
        return sqDefault;
    }

    public String getHqDefault() {
        return hqDefault;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Thumbnail{");
        sb.append("sqDefault='").append(sqDefault).append('\'');
        sb.append(", hqDefault='").append(hqDefault).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
