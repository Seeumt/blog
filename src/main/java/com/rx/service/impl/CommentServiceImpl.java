package com.rx.service.impl;

import com.rx.dataobject.Blog;
import com.rx.dataobject.CommentDetail;
import com.rx.form.Comment;
import com.rx.repository.BlogRepository;
import com.rx.repository.CommentDetailRepository;
import com.rx.service.CommentService;
import com.rx.utils.KeyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentDetailRepository commentDetailRepository;
    @Autowired
    private BlogRepository blogRepository;
    @Override
    public CommentDetail save(Comment comment) {
        Blog blog = blogRepository.findOne(comment.getBlogId());
        CommentDetail commentDetail = new CommentDetail();
        commentDetail.setContentMasterId(blog.getCommentMasterId());
        BeanUtils.copyProperties(comment, commentDetail);
        return commentDetailRepository.save(commentDetail);
    }

    @Override
    public List<CommentDetail> findAll(String blogId) {
        Blog blog = blogRepository.findOne(blogId);
        List<CommentDetail> commentDetailList = commentDetailRepository.findByContentMasterId(blog.getCommentMasterId());
        return commentDetailList;
    }

}
