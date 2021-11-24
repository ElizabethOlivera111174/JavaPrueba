package com.AclDemo.AclDemo.Services;

import com.AclDemo.AclDemo.IServices.IcharactersService;
import com.AclDemo.AclDemo.Mappers.DTOs.CharacterDTO;
import com.AclDemo.AclDemo.Models.CharactersModel;
import com.AclDemo.AclDemo.Models.MoviesModel;
import com.AclDemo.AclDemo.Repository.CharacterRepository;
import com.AclDemo.AclDemo.Repository.MoviesRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Transactional
@Service
public class CharacterService implements IcharactersService {
    private final CharacterRepository characterRepository;
    private final MoviesRepository movieRepository;

    @Override
    public List<CharactersModel>getAll() {
        return characterRepository.findAll();
    }

    @Override
    public CharactersModel findById(Long characterId) {
        return characterRepository.findById(characterId).orElseThrow(() -> new ResourceNotFoundException("No Character with ID : " + characterId));
    }

    @Override
    public List<CharactersModel> findByName(String name) {
        return characterRepository.findByName(name);
    }

    @Override
    public void delete(Long id) {

        characterRepository.delete(findById(id));
    }

    @Override
    public CharactersModel save(CharactersModel charactersModel) {
        return characterRepository.save(charactersModel);
    }

    @Override
    public List<CharactersModel> findByMovieId(Long idMovie) {
        return characterRepository.findByMoviesId(idMovie);
    }
    private boolean checkMoviesExistence(List<Long> moviesIds) {

        return movieRepository.findAll().stream().map(MoviesModel::getId).collect(Collectors.toList()).containsAll(moviesIds);

    }

    @SneakyThrows
    @Override
    public void addMovies(Long characterId, List<Long> moviesIds) {
        CharactersModel character = findById(characterId);
           if(checkMoviesExistence(moviesIds)){
               movieRepository.findAllById(moviesIds).forEach(movie -> character.getMovies().add(movie));
           }else {
               throw new Exception("Error");
           }
    }

    @Override
    public void removeMovies(Long characterId, List<Long> moviesIds) {
        CharactersModel character = findById(characterId);

        character.getMovies().removeIf(movie -> moviesIds.contains(movie.getId()));

        characterRepository.save(character);
    }
}
