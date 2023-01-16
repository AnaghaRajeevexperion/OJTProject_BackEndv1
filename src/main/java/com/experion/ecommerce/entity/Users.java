package com.experion.ecommerce.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="users")
@Data
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private int user_id;

    @Column(name="user_name")
    private String user_name;

    @Column(name="email")
    private String email;

    @Column(name="picture")
    private String picture;

}
