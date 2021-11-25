package com.AclDemo.AclDemo.Mappers;


import com.AclDemo.AclDemo.Mappers.DTOs.CharactersDTOs.CharacterDTO;
import com.AclDemo.AclDemo.Mappers.DTOs.CharactersDTOs.CharacterInUpDTO;
import com.AclDemo.AclDemo.Mappers.DTOs.MoviesDTOs.MoviesDTO;
import com.AclDemo.AclDemo.Models.Character;
import com.AclDemo.AclDemo.Models.Movie;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface  MappStructMapper {

    CharacterDTO characterToCharacterDto(Character characterModel);
    Character CharacterInsetDtoToCharacter(CharacterInUpDTO characterInUpDTO);
    List<CharacterDTO> charactersToCharacterDTO(List<Character> characters);

    List<MoviesDTO> moviesToMovieDtos(List<Movie> movies);

    MoviesDTO moviesToMovieDto(Movie movie);

    Movie moviesDTOToMovie(MoviesDTO movie);
}
