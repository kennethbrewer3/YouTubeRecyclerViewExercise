package com.mobileappscompany.training.youtuberecyclerviewexercise.domain.youtube;

/**
 * Created by Kenneth Brewer on 4/20/2015.
 */
public class Response {
    private String apiVersion;
    private Data data;

    private Response() {}

    private Response(String apiVersion, Data data) {
        this.apiVersion = apiVersion;
        this.data = data;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public Data getData() {
        return data;
    }

    private void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    private void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Response{");
        sb.append("apiVersion='").append(apiVersion).append('\'');
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }

    public static class ResponseBuilder {
        private String apiVersion;
        private Data data;

        public ResponseBuilder() {
            this.apiVersion = null;
            this.data = null;
        }

        public ResponseBuilder apiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public ResponseBuilder data(Data data) {
            this.data = data;
            return this;
        }

        public Response build() {
            Response response = new Response();

            response.setApiVersion(this.apiVersion);
            response.setData(data);

            return response;
        }
    }
}
