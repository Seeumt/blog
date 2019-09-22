package com.rx.service;

import com.rx.dataobject.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogService{

    Blog findOne(String blogId);


}
