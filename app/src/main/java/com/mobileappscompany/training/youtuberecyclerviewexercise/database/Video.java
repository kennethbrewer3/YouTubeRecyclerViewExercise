package com.mobileappscompany.training.youtuberecyclerviewexercise.database;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table VIDEO.
 */
public class Video {

    private Long id;
    private String category;
    private String title;
    private String description;
    private String sqDefault;
    private String hqDefault;
    private String player;

    public Video() {
    }

    public Video(Long id) {
        this.id = id;
    }

    public Video(Long id, String category, String title, String description, String sqDefault, String hqDefault, String player) {
        this.id = id;
        this.category = category;
        this.title = title;
        this.description = description;
        this.sqDefault = sqDefault;
        this.hqDefault = hqDefault;
        this.player = player;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSqDefault() {
        return sqDefault;
    }

    public void setSqDefault(String sqDefault) {
        this.sqDefault = sqDefault;
    }

    public String getHqDefault() {
        return hqDefault;
    }

    public void setHqDefault(String hqDefault) {
        this.hqDefault = hqDefault;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

}