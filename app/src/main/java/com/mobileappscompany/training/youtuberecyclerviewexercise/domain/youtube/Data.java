package com.mobileappscompany.training.youtuberecyclerviewexercise.domain.youtube;

import java.util.List;

/**
 * Created by Android1 on 4/20/2015.
 */
public class Data {
    private String updated;
    private int totalItems;
    private int startIndex;
    private int itemsPerPage;
    private List<Item> items;

    private Data(){}

    public Data(
            String updated,
            int totalItems,
            int startIndex,
            int itemsPerPage,
            List<Item> items) {
        this.updated = updated;
        this.totalItems = totalItems;
        this.startIndex = startIndex;
        this.itemsPerPage = itemsPerPage;
        this.items = items;
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

    public List<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Data{");
        sb.append("updated='").append(updated).append('\'');
        sb.append(", totalItems=").append(totalItems);
        sb.append(", startIndex=").append(startIndex);
        sb.append(", itemsPerPage=").append(itemsPerPage);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
