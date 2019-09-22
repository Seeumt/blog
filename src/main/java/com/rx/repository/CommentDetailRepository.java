package com.rx.repository;

import com.rx.dataobject.CommentDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentDetailRepository extends JpaRepository<CommentDetail, Integer> {
    List<CommentDetail> findByContentMasterId(Integer masterId);
}
