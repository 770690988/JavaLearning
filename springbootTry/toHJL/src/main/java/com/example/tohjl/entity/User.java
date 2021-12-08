package com.example.tohjl.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "staff_id")
    public String staff_id;

    @Column(name = "staff_type")
    public String staff_type;

    @Column(name = "password")
    public String password;

}
