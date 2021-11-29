package com.AclDemo.AclDemo.Controller;

import com.AclDemo.AclDemo.Mappers.DTOs.MoviesDTOs.MoviesDTO;
import com.AclDemo.AclDemo.Mappers.MappStructMapper;
import com.AclDemo.AclDemo.Models.Movie;
import com.AclDemo.AclDemo.Services.MovieService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@Tag(name = "Movies")
@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;
    private final MappStructMapper mappStructMapper;

    @GetMapping("/AllMovies")
    public ResponseEntity<List<MoviesDTO>> getAllMovies() {

        return new ResponseEntity(mappStructMapper.moviesToMovieDtos(movieService.getAll()), HttpStatus.OK);

    }

    @GetMapping("/OrderAsc-DESC")
    public ResponseEntity<List<MoviesDTO>> getAllMoviesOrderByTitle(String order)
    {
        List<Movie> movies = movieService.findAllOrderByTitle(order);

        if(movies == null) {

            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        } else {

            return new ResponseEntity(mappStructMapper.moviesToMovieDtos(movies), HttpStatus.OK);

        }

    }

    @GetMapping("/findMovieById/{id}")
    public ResponseEntity<MoviesDTO> findMovieById(@PathVariable("id") Long movieId) {

        return new ResponseEntity(mappStructMapper.moviesToMovieDto(movieService.findById(movieId)), HttpStatus.OK);

    }

    @GetMapping("/SearchTitle")
    public ResponseEntity<List<MoviesDTO>> findMovieByTitle(
            @Parameter String title) {

        return new ResponseEntity<>(mappStructMapper.moviesToMovieDtos(movieService.findByTitle(title)), HttpStatus.OK);
    }

    @DeleteMapping("/deleteMovieById/{id}")
    public ResponseEntity<HttpStatus> deleteMovieById(@PathVariable("id") Long id) {

        movieService.delete(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

    @PostMapping("/Save")
    public ResponseEntity<MoviesDTO> saveMovie(@Valid @RequestBody MoviesDTO movie) {

        Movie movieCreated = movieService.save(mappStructMapper.moviesDTOToMovie(movie));

        return new ResponseEntity(mappStructMapper.moviesToMovieDto(movieCreated), HttpStatus.CREATED);

    }
}
