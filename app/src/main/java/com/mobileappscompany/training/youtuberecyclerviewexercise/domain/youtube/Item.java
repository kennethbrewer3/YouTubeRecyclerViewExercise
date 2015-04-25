package com.mobileappscompany.training.youtuberecyclerviewexercise.domain.youtube;

/**
 * Created by Android1 on 4/20/2015.
 */
public class Item {
    private String id;
    private String uploaded;
    private String updated;
    private String uploader;
    private String category;
    private String title;
    private String description;
    private Thumbnail thumbnail;
    private Player player;
    private Content content;
    private int duration;
    private double rating;
    private int likeCount;
    private int ratingCount;
    private String aspectRatio;
    private int viewCount;
    private int favoriteCount;
    private int commentCount;
    private AccessControl accessControl;

    private Item() {}

    public Item(
            String id,
            String uploaded,
            String updated,
            String uploader,
            String category,
            String title,
            String description,
            Thumbnail thumbnail,
            Player player,
            Content content,
            int duration,
            double rating,
            int likeCount,
            int ratingCount,
            String aspectRatio,
            int viewCount,
            int favoriteCount,
            int commentCount,
            AccessControl accessControl) {
        this.id = id;
        this.uploaded = uploaded;
        this.updated = updated;
        this.uploader = uploader;
        this.category = category;
        this.title = title;
        this.description = description;
        this.thumbnail = thumbnail;
        this.player = player;
        this.content = content;
        this.duration = duration;
        this.rating = rating;
        this.likeCount = likeCount;
        this.ratingCount = ratingCount;
        this.aspectRatio = aspectRatio;
        this.viewCount = viewCount;
        this.favoriteCount = favoriteCount;
        this.commentCount = commentCount;
        this.accessControl = accessControl;
    }

    public String getId() {
        return id;
    }

    public String getUploaded() {
        return uploaded;
    }

    public String getUpdated() {
        return updated;
    }

    public String getUploader() {
        return uploader;
    }

    public String getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public Player getPlayer() {
        return player;
    }

    public Content getContent() {
        return content;
    }

    public int getDuration() {
        return duration;
    }

    public double getRating() {
        return rating;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public int getRatingCount() {
        return ratingCount;
    }

    public String getAspectRatio() {
        return aspectRatio;
    }

    public int getViewCount() {
        return viewCount;
    }

    public int getFavoriteCount() {
        return favoriteCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public AccessControl getAccessControl() {
        return accessControl;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Item{");
        sb.append("id='").append(id).append('\'');
        sb.append(", uploaded='").append(uploaded).append('\'');
        sb.append(", updated='").append(updated).append('\'');
        sb.append(", uploader='").append(uploader).append('\'');
        sb.append(", category='").append(category).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", thumbnail=").append(thumbnail);
        sb.append(", player=").append(player);
        sb.append(", content=").append(content);
        sb.append(", duration=").append(duration);
        sb.append(", rating=").append(rating);
        sb.append(", likeCount=").append(likeCount);
        sb.append(", ratingCount=").append(ratingCount);
        sb.append(", aspectRatio='").append(aspectRatio).append('\'');
        sb.append(", viewCount=").append(viewCount);
        sb.append(", favoriteCount=").append(favoriteCount);
        sb.append(", commentCount=").append(commentCount);
        sb.append(", accessControl=").append(accessControl);
        sb.append('}');
        return sb.toString();
    }
}
