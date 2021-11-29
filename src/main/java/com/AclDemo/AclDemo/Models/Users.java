package com.AclDemo.AclDemo.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
    @Getter
    @Setter
    public class Users {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(unique = true, nullable = false,name="id")
        private Long id;

        @Column(name="name")
        private String name;

        @Column(name="email")
        private String email;

        @Getter @Setter @Column(name="password")
        private String password;
    }
