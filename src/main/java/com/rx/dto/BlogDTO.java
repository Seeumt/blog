package com.rx.dto;

import com.rx.dataobject.CommentDetail;
import lombok.Data;

import java.util.List;
@Data
public class BlogDTO {
    private String id;
    private String content;
    private Integer ownerId;
    private Integer commentMasterId;
    private List<CommentDetail> commentDetailList;

}
