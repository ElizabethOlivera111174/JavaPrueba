package com.AclDemo.AclDemo.Repository;

import com.AclDemo.AclDemo.Models.CharactersModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CharacterRepository extends JpaRepository<CharactersModel, Long> {

    Optional<CharactersModel> findById(Long id);

    List<CharactersModel> findByName(String name);


    List<CharactersModel> findByMoviesId(Long id);

    void delete(Optional<CharactersModel> byId);
}
