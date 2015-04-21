package com.mobileappscompany.training.youtuberecyclerviewexercise.domain.youtube;

/**
 * Created by Android1 on 4/20/2015.
 */
public class Response {
    private String apiVersion;
    private Data data;

    public Response(String apiVersion, Data data) {
        this.apiVersion = apiVersion;
        this.data = data;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public Data getData() {
        return data;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Response{");
        sb.append("apiVersion='").append(apiVersion).append('\'');
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
