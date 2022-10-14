package com.STLZ.modules.account.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
    @Column(name = "tel")
    private String tel;
    @Column(name = "email")
    private String email;

    @Column(name = "headIcon")
    private  String headIcon;
    @Column(name = "createTime")
    @JsonFormat(shape = JsonFormat.Shape.STRING , pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @Column(name = "isMessage")
    private boolean isMessage;

    @Column(name = "typeId")
    private int typeId;

//    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH})
////    @JoinColumn(name="userType")
//    private Type userType;

}
