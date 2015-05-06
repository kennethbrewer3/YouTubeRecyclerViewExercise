package com.mobileappscompany.training.youtuberecyclerviewexercise.domain.youtube;

/**
 * Created by Kenneth Brewer on 4/20/2015.
 */
public class Video {
    private Long id;
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

    private Video() {}

    private Video(
            Long id,
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

    public Long getId() {
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

    private void setId(Long id) {
        this.id = id;
    }

    private void setUploaded(String uploaded) {
        this.uploaded = uploaded;
    }

    private void setUpdated(String updated) {
        this.updated = updated;
    }

    private void setUploader(String uploader) {
        this.uploader = uploader;
    }

    private void setCategory(String category) {
        this.category = category;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    private void setPlayer(Player player) {
        this.player = player;
    }

    private void setContent(Content content) {
        this.content = content;
    }

    private void setDuration(int duration) {
        this.duration = duration;
    }

    private void setRating(double rating) {
        this.rating = rating;
    }

    private void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    private void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }

    private void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    private void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    private void setFavoriteCount(int favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    private void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    private void setAccessControl(AccessControl accessControl) {
        this.accessControl = accessControl;
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

    public static class VideoBuilder {
        private Long id;
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
        
        public VideoBuilder() {
            id = null;
            uploaded = null;
            updated = null;
            uploader = null;
            category = null;
            title = null;
            description = null;
            thumbnail = null;
            player = null;
            content = null;
            duration = 0;
            rating = 0;
            likeCount = 0;
            ratingCount = 0;
            aspectRatio = null;
            viewCount = 0;
            favoriteCount = 0;
            commentCount = 0;
            accessControl = null;
        }

        public VideoBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public VideoBuilder uploaded(String uploaded) {
            this.uploaded = uploaded;
            return this;
        }

        public VideoBuilder updated(String updated) {
            this.updated = updated;
            return this;
        }

        public VideoBuilder uploader(String uploader) {
            this.uploader = uploader;
            return this;
        }

        public VideoBuilder category(String category) {
            this.category = category;
            return this;
        }

        public VideoBuilder title(String title) {
            this.title = title;
            return this;
        }

        public VideoBuilder description(String description) {
            this.description = description;
            return this;
        }

        public VideoBuilder thumbnail(Thumbnail thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        
        public VideoBuilder player(Player player) {
            this.player = player;
            return this;
        }
        
        public VideoBuilder content(Content content) {
            this.content = content;
            return this;
        }
        
        public VideoBuilder duration(int duration) {
            this.duration = duration;
            return this;
        }
        
        public VideoBuilder rating(double rating) {
            this.rating = rating;
            return this;
        }

        public VideoBuilder likeCount(int likeCount) {
            this.likeCount = likeCount;
            return this;
        }
        
        public VideoBuilder ratingCount(int ratingCount) {
            this.ratingCount = ratingCount;
            return this;
        }
        
        public VideoBuilder aspectRatio(String aspectRatio) {
            this.aspectRatio = aspectRatio;
            return this;
        }

        public VideoBuilder viewCount(int viewCount) {
            this.viewCount = viewCount;
            return this;
        }
        
        public VideoBuilder favoriteCount(int favoriteCount) {
            this.favoriteCount = favoriteCount;
            return this;
        }

        public VideoBuilder commentCount(int commentCount) {
            this.commentCount = commentCount;
            return this;
        }
        
        public VideoBuilder accessControl(AccessControl accessControl) {
            this.accessControl = accessControl;
            return this;
        }

        public Video build() {
            Video video = new Video();
            video.setId(this.id);
            video.setUploaded(this.uploaded);
            video.setUpdated(this.updated);
            video.setUploader(this.uploader);
            video.setCategory(this.category);
            video.setTitle(this.title);
            video.setDescription(this.description);
            video.setThumbnail(this.thumbnail);
            video.setPlayer(this.player);
            video.setContent(this.content);
            video.setDuration(this.duration);
            video.setRating(this.rating);
            video.setLikeCount(this.likeCount);
            video.setRatingCount(this.ratingCount);
            video.setAspectRatio(this.aspectRatio);
            video.setViewCount(this.viewCount);
            video.setFavoriteCount(this.favoriteCount);
            video.setCommentCount(this.commentCount);
            video.setAccessControl(this.accessControl);
            return video;
        }
    }
}

