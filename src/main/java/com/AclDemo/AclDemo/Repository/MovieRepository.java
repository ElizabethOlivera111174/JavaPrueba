package com.AclDemo.AclDemo.Repository;

import com.AclDemo.AclDemo.Models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    Optional<Movie> findById(Long id);


    List<Movie> findByTitle(String title);


    List<Movie> findAllByOrderByTitleAsc();

    List<Movie> findAllByOrderByTitleDesc();

}
