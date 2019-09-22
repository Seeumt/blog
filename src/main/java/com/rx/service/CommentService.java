package com.rx.service;

import com.rx.dataobject.CommentDetail;
import com.rx.form.Comment;

import java.util.List;

public interface CommentService {
    CommentDetail save(Comment comment);

    List<CommentDetail> findAll(String blogId);

}
