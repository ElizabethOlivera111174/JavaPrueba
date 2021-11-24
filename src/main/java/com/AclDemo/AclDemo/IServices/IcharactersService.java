package com.AclDemo.AclDemo.IServices;

import com.AclDemo.AclDemo.Mappers.DTOs.CharacterDTO;
import com.AclDemo.AclDemo.Models.CharactersModel;

import java.util.List;

public interface IcharactersService {

    List<CharactersModel> getAll();

    CharactersModel findById(Long characterId);

    List<CharactersModel> findByName(String name);

    void delete(Long id);

    CharactersModel save(CharactersModel charactersModel);

    List<CharactersModel> findByMovieId(Long idMovie);

    void addMovies(Long characterId, List<Long> moviesIds);

    void removeMovies(Long characterId, List<Long> moviesIds);
}
