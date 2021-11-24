package com.AclDemo.AclDemo.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class GenderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String image;

    @ManyToMany(mappedBy = "genres")
    private Set<MoviesModel> movies = new HashSet<>();
}
