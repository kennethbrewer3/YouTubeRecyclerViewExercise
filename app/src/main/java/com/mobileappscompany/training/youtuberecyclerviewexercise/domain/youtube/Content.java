package com.mobileappscompany.training.youtuberecyclerviewexercise.domain.youtube;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Android1 on 4/20/2015.
 */
public class Content {
    @SerializedName("1")
    private String one;
    @SerializedName("5")
    private String five;
    @SerializedName("6")
    private String six;

    private Content() {}

    public Content(String one, String five, String six) {
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Content{");
        sb.append("one='").append(one).append('\'');
        sb.append(", five='").append(five).append('\'');
        sb.append(", six='").append(six).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
