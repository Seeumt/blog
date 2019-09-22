package com.rx.dataobject;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Blog {
    @Id
    @GeneratedValue
    private String id;
    private String content;
    private Integer ownerId;
    private Integer commentMasterId;



}
