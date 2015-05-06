package com.mobileappscompany.training.youtuberecyclerviewexercise.domain.youtube;

import java.util.List;

/**
 * Created by Kenneth Brewer on 4/20/2015.
 */
public class Data {
    private String updated;
    private int totalItems;
    private int startIndex;
    private int itemsPerPage;
    private List<Video> videos;

    private Data(){}

    private Data(
            String updated,
            int totalItems,
            int startIndex,
            int itemsPerPage,
            List<Video> videos) {
        this.updated = updated;
        this.totalItems = totalItems;
        this.startIndex = startIndex;
        this.itemsPerPage = itemsPerPage;
        this.videos = videos;
    }

    public String getUpdated() {
        return updated;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public int getItemsPerPage() {
        return itemsPerPage;
    }

    public List<Video> getVideos() {
        return videos;
    }

    private void setUpdated(String updated) {
        this.updated = updated;
    }

    private void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    private void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    private void setItemsPerPage(int itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }

    private void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Data{");
        sb.append("updated='").append(updated).append('\'');
        sb.append(", totalItems=").append(totalItems);
        sb.append(", startIndex=").append(startIndex);
        sb.append(", itemsPerPage=").append(itemsPerPage);
        sb.append(", items=").append(videos);
        sb.append('}');
        return sb.toString();
    }

    public static class DataBuilder {
        private String updated;
        private int totalItems;
        private int startIndex;
        private int itemsPerPage;
        private List<Video> videos;

        public DataBuilder() {
            updated = null;
            totalItems = 0;
            startIndex = 0;
            itemsPerPage = 0;
            videos = null;
        }

        public DataBuilder updated(String updated) {
            this.updated = updated;
            return this;
        }

        public DataBuilder totalItems(int totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        public DataBuilder startIndex(int startIndex) {
            this.startIndex = startIndex;
            return this;
        }

        public DataBuilder itemsPerPage(int itemsPerPage) {
            this.itemsPerPage = itemsPerPage;
            return this;
        }

        public DataBuilder videos(List<Video> videos) {
            this.videos = videos;
            return this;
        }

        public Data build() {
            Data data = new Data();
            data.setUpdated(this.updated);
            data.setTotalItems(this.totalItems);
            data.setStartIndex(this.startIndex);
            data.setItemsPerPage(this.itemsPerPage);
            data.setVideos(this.videos);
            return data;
        }
    }
}
