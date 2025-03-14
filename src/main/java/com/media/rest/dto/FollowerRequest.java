package com.media.rest.dto;

import lombok.Data;

@Data
public class FollowerRequest {
    private Long followerId;

    public Long getFollowerId() {
        return followerId;
    }

    public void setFollowerId(Long followerId) {
        this.followerId = followerId;
    }
}
