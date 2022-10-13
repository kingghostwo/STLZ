package com.STLZ.modules.account.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "type")
@Data
public class Type {

    @Id
    private String typeId;
    @Column(name = "type")
    private String type;

    @Column(name = "createTime")
    private Date createTime;
}
