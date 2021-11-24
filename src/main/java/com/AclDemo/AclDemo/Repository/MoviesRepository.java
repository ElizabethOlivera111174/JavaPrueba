package com.AclDemo.AclDemo.Repository;

import com.AclDemo.AclDemo.Models.MoviesModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MoviesRepository extends JpaRepository<MoviesModel, Long> {

    Optional<MoviesModel> findById(Long id);

    List<MoviesModel> findByTitle(String title);

    List<MoviesModel> findByGenresId(Long genreId);

    List<MoviesModel> findAllByOrderByCreationDateAsc();

    List<MoviesModel> findAllByOrderByCreationDateDesc();
}
