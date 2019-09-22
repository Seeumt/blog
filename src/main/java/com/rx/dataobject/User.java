package com.rx.dataobject;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String password;


}
