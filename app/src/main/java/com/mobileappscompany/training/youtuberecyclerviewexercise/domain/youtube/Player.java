package com.mobileappscompany.training.youtuberecyclerviewexercise.domain.youtube;

/**
 * Created by Android1 on 4/20/2015.
 */
public class Player {
    private String defaultPlayer;
    private String mobile;

    public Player(String defaultPlayer, String mobile) {
        this.defaultPlayer = defaultPlayer;
        this.mobile = mobile;
    }

    public String getDefaultPlayer() {
        return defaultPlayer;
    }

    public String getMobile() {
        return mobile;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Player{");
        sb.append("defaultPlayer='").append(defaultPlayer).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
