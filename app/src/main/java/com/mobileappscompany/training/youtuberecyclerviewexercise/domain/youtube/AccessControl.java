package com.mobileappscompany.training.youtuberecyclerviewexercise.domain.youtube;

/**
 * Created by Kenneth Brewer on 4/20/2015.
 */
public class AccessControl {
    private String comment;
    private String commentVote;
    private String videoRespond;
    private String rate;
    private String embed;
    private String list;
    private String autoPlay;
    private String syndicate;

    private AccessControl() {}

    private AccessControl (
            String comment,
            String commentVote,
            String videoRespond,
            String rate,
            String embed,
            String list,
            String autoPlay,
            String syndicate) {
        this.comment = comment;
        this.commentVote = commentVote;
        this.videoRespond = videoRespond;
        this.rate = rate;
        this.embed = embed;
        this.list = list;
        this.autoPlay = autoPlay;
        this.syndicate = syndicate;
    }

    public String getComment() {
        return comment;
    }

    public String getCommentVote() {
        return commentVote;
    }

    public String getVideoRespond() {
        return videoRespond;
    }

    public String getRate() {
        return rate;
    }

    public String getEmbed() {
        return embed;
    }

    public String getList() {
        return list;
    }

    public String getAutoPlay() {
        return autoPlay;
    }

    public String getSyndicate() {
        return syndicate;
    }

    private void setComment(String comment) {
        this.comment = comment;
    }

    private void setCommentVote(String commentVote) {
        this.commentVote = commentVote;
    }

    private void setVideoRespond(String videoRespond) {
        this.videoRespond = videoRespond;
    }

    private void setRate(String rate) {
        this.rate = rate;
    }

    private void setEmbed(String embed) {
        this.embed = embed;
    }

    private void setList(String list) {
        this.list = list;
    }

    private void setAutoPlay(String autoPlay) {
        this.autoPlay = autoPlay;
    }

    private void setSyndicate(String syndicate) {
        this.syndicate = syndicate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AccessControl{");
        sb.append("comment='").append(comment).append('\'');
        sb.append(", commentVote='").append(commentVote).append('\'');
        sb.append(", videoRespond='").append(videoRespond).append('\'');
        sb.append(", rate='").append(rate).append('\'');
        sb.append(", embed='").append(embed).append('\'');
        sb.append(", list='").append(list).append('\'');
        sb.append(", autoPlay='").append(autoPlay).append('\'');
        sb.append(", syndicate='").append(syndicate).append('\'');
        sb.append('}');
        return sb.toString();
    }
    
    public static class AccessControlBuilder {
        private String comment;
        private String commentVote;
        private String videoRespond;
        private String rate;
        private String embed;
        private String list;
        private String autoPlay;
        private String syndicate;

        public AccessControlBuilder() {
            comment = null;
            commentVote = null;
            videoRespond = null;
            rate = null;
            embed = null;
            list = null;
            autoPlay = null;
            syndicate = null;
        }

        public AccessControlBuilder comment(String comment) {
            this.comment = comment;
            return this;
        }

        public AccessControlBuilder commentVote(String commentVote) {
            this.commentVote = commentVote;
            return this;
        }

        public AccessControlBuilder videoRespond(String videoRespond) {
            this.videoRespond = videoRespond;
            return this;
        }

        public AccessControlBuilder rate(String rate) {
            this.rate = rate;
            return this;
        }

        public AccessControlBuilder embed(String embed) {
            this.embed = embed;
            return this;
        }

        public AccessControlBuilder list(String list) {
            this.list = list;
            return this;
        }

        public AccessControlBuilder autoPlay(String autoPlay) {
            this.autoPlay = autoPlay;
            return this;
        }

        public AccessControlBuilder syndicate(String syndicate) {
            this.syndicate = syndicate;
            return this;
        }

        public AccessControl build() {
            AccessControl accessControl = new AccessControl();

            accessControl.setComment(this.comment);
            accessControl.setCommentVote(this.commentVote);
            accessControl.setVideoRespond(this.videoRespond);
            accessControl.setRate(this.rate);
            accessControl.setEmbed(this.embed);
            accessControl.setList(this.list);
            accessControl.setAutoPlay(this.autoPlay);
            accessControl.setSyndicate(this.syndicate);

            return accessControl;
        }
    }
}
