package com.mobileappscompany.training.youtuberecyclerviewexercise.domain.youtube;

/**
 * Created by Android1 on 4/20/2015.
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

    public AccessControl (
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
}
