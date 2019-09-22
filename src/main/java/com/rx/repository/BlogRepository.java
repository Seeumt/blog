package com.rx.repository;

import com.rx.dataobject.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface BlogRepository extends CrudRepository<Blog,String> {
}
