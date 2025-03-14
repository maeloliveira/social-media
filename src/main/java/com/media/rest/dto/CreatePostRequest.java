package com.media.rest.dto;

import lombok.Data;


@Data
public class CreatePostRequest {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}