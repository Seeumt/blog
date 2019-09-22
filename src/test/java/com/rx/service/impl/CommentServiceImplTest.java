package com.rx.service.impl;

import com.rx.dataobject.CommentDetail;
import com.rx.form.Comment;
import com.rx.repository.CommentDetailRepository;
import com.rx.service.CommentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CommentServiceImplTest {
    @Autowired
    private CommentService service;
    @Test
    public void save() {
        Comment comment = new Comment(998, "2", "wonderful");
        CommentDetail save = service.save(comment);
    }
}