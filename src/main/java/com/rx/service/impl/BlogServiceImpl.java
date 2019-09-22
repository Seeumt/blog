package com.rx.service.impl;

import com.rx.dataobject.Blog;
import com.rx.repository.BlogRepository;
import com.rx.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class BlogServiceImpl implements BlogService {

    @Resource
    private BlogRepository repository;

    @Override
    public Blog findOne(String blogId) {


        return repository.findOne(blogId);
    }
}
