package com.AclDemo.AclDemo.Services;

import com.AclDemo.AclDemo.IServices.IMovieService;
import com.AclDemo.AclDemo.Models.Movie;
import com.AclDemo.AclDemo.Repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class MovieService implements IMovieService {

    private final MovieRepository movieRepository;

    @Override
    public List<Movie> getAll() {

        return movieRepository.findAll();

    }

    @Override
    public Movie findById(Long movieId) {

        return movieRepository.findById(movieId).orElseThrow(() -> new ResourceNotFoundException("No Movie with ID : " + movieId));
    }

    @Override
    public List<Movie> findByTitle(String title) {

        return movieRepository.findByTitle(title);
    }

    @Override
    public List<Movie> findAllOrderByTitle(String order) {

        if(order.equalsIgnoreCase("ASC")) {

            return movieRepository.findAllByOrderByTitleAsc();

        } else if (order.equalsIgnoreCase("DESC")) {

            return movieRepository.findAllByOrderByTitleDesc();

        }

        return null;
    }



    @Override
    public void delete(Long id) {
        movieRepository.delete(findById(id));
    }

    @Override
    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }





}
