package com.STLZ.modules.account.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "type")
@Data
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int typeId;

    @Column(name = "type")
    private String type;

    @Column(name = "createTime")
    @JsonFormat(shape = JsonFormat.Shape.STRING , pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

//    @OneToMany(mappedBy = "userId",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
//    private List<User> user;
}
