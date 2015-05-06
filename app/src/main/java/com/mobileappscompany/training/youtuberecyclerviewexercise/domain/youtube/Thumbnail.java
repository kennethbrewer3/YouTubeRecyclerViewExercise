package com.mobileappscompany.training.youtuberecyclerviewexercise.domain.youtube;

/**
 * Created by Kenneth Brewer on 4/20/2015.
 */
public class Thumbnail {
    private String sqDefault;
    private String hqDefault;

    private Thumbnail() {}

    private Thumbnail(String sqDefault, String hqDefault) {
        this.sqDefault = sqDefault;
        this.hqDefault = hqDefault;
    }

    public String getSqDefault() {
        return sqDefault;
    }

    public String getHqDefault() {
        return hqDefault;
    }

    private void setSqDefault(String sqDefault) {
        this.sqDefault = sqDefault;
    }

    private void setHqDefault(String hqDefault) {
        this.hqDefault = hqDefault;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Thumbnail{");
        sb.append("sqDefault='").append(sqDefault).append('\'');
        sb.append(", hqDefault='").append(hqDefault).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static class ThumbnailBuilder {
        private String sqDefault;
        private String hqDefault;

        public ThumbnailBuilder() {
            sqDefault = null;
            hqDefault = null;
        }

        public ThumbnailBuilder sqDefault(String sqDefault) {
            this.sqDefault = sqDefault;
            return this;
        }

        public ThumbnailBuilder hqDefault(String hqDefault) {
            this.hqDefault = hqDefault;
            return this;
        }

        public Thumbnail build() {
            Thumbnail thumbnail = new Thumbnail();
            thumbnail.setSqDefault(sqDefault);
            thumbnail.setHqDefault(hqDefault);
            return thumbnail;
        }
    }
}
