package com.AclDemo.AclDemo.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
    @Getter
    @Setter
    @Table(name="Users")
    public class UserModel {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(unique = true, nullable = false,name="id")
        private Long id;

        @Column(name="name")
        private String name;

        @Column(name="lastName")
        private String lastName;

        @Column(name="email")
        private String email;

        @Getter @Setter @Column(name="password")
        private String password;
    }
