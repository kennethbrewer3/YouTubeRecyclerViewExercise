package com.mobileappscompany.training.youtuberecyclerviewexercise.domain.youtube;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Kenneth Brewer on 4/20/2015.
 */
public class Content {
    @SerializedName("1")
    private String one;
    @SerializedName("5")
    private String five;
    @SerializedName("6")
    private String six;

    private Content() {}

    private Content(String one, String five, String six) {
        this.one = one;
        this.five = five;
        this.six = six;
    }

    public String getOne() {
        return one;
    }

    public String getFive() {
        return five;
    }

    public String getSix() {
        return six;
    }

    private void setOne(String one) {
        this.one = one;
    }

    private void setFive(String five) {
        this.five = five;
    }

    private void setSix(String six) {
        this.six = six;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Content{");
        sb.append("one='").append(one).append('\'');
        sb.append(", five='").append(five).append('\'');
        sb.append(", six='").append(six).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static class ContentBuilder {
        private String one;
        private String five;
        private String six;

        public ContentBuilder() {
            one = null;
            five = null;
            six = null;
        }

        public ContentBuilder one(String one) {
            this.one = one;
            return this;
        }

        public ContentBuilder five(String five) {
            this.five = five;
            return this;
        }

        public ContentBuilder six(String six) {
            this.six = six;
            return this;
        }

        public Content build() {
            Content content = new Content();
            content.setOne(this.one);
            content.setFive(this.five);
            content.setSix(this.six);
            return content;
        }
    }
}
