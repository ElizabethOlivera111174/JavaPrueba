package com.AclDemo.AclDemo.IServices;

import com.AclDemo.AclDemo.Models.Movie;

import java.util.List;

public interface IMovieService {

    List<Movie> getAll();

    Movie findById(Long movieId);

    List<Movie> findByTitle(String title);


    List<Movie> findAllOrderByTitle(String order);


    void delete(Long id);

    Movie save(Movie movie);


}
