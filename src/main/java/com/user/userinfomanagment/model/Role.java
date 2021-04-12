package com.user.userinfomanagment.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "role_tbl")
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "role_name")
    private String roleName;
}
