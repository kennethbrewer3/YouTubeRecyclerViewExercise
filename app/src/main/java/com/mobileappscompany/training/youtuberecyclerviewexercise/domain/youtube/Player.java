package com.mobileappscompany.training.youtuberecyclerviewexercise.domain.youtube;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Kenneth Brewer on 4/20/2015.
 */
public class Player {
    @SerializedName("default")
    private String defaultPlayer;
    private String mobile;

    private Player() {}
    
    private Player(String defaultPlayer, String mobile) {
        this.defaultPlayer = defaultPlayer;
        this.mobile = mobile;
    }

    public String getDefaultPlayer() {
        return defaultPlayer;
    }

    public String getMobile() {
        return mobile;
    }

    private void setDefaultPlayer(String defaultPlayer) {
        this.defaultPlayer = defaultPlayer;
    }

    private void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Player{");
        sb.append("defaultPlayer='").append(defaultPlayer).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static class PlayerBuilder {
        private String defaultPlayer;
        private String mobile;

        public PlayerBuilder() {
            defaultPlayer = null;
            mobile = null;
        }

        public PlayerBuilder defaultPlayer(String defaultPlayer) {
            this.defaultPlayer = defaultPlayer;
            return this;
        }

        public PlayerBuilder mobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public Player build() {
            Player player = new Player();
            player.setDefaultPlayer(defaultPlayer);
            player.setMobile(mobile);
            return player;
        }
    }
}
