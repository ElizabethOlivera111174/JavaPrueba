package com.AclDemo.AclDemo.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String image;

    private String Records;

    private String Awards;

    private LocalDateTime creationDate;

    private Integer rating;

    @ManyToMany(mappedBy = "movies")
    private Set<Character> characters = new HashSet<>();

    @JoinTable(name = "movie_gender",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "gender_id"))
    @ManyToMany
    private Set<Gender> gender = new HashSet<>();
}
