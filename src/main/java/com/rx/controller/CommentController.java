package com.rx.controller;

import com.rx.dataobject.CommentDetail;
import com.rx.form.Comment;
import com.rx.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {



    @Autowired
    private CommentService service;
    @PostMapping("/add")
    public List<CommentDetail> add(Comment comment) {
        CommentDetail commentDetail = service.save(comment);
        List<CommentDetail> commentDetailList = service.findAll(comment.getBlogId());
        return commentDetailList;
    }


}
