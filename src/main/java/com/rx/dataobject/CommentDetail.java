package com.rx.dataobject;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Data
public class CommentDetail {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer userId;
    private String content;
    private Integer contentMasterId;


}
