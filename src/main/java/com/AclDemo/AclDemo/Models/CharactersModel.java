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
public class CharactersModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String lastName;

    private String image;

    private String Awards;

    private LocalDateTime AwardsDate;

    private String history;

    @JoinTable(name = "character_movie",
            joinColumns = @JoinColumn(name = "character_id"),
            inverseJoinColumns = @JoinColumn(name = "movie_id"))
    @ManyToMany
    private Set<MoviesModel> movies = new HashSet<>();
}
