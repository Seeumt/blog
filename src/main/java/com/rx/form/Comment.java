package com.rx.form;

import lombok.Data;

@Data
public class Comment {

    private Integer userId;

    private String blogId;

    private String content;

    public Comment() {
    }

    public Comment(Integer userId, String blogId, String content) {
        this.userId = userId;
        this.blogId = blogId;
        this.content = content;
    }
}
