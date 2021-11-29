package com.AclDemo.AclDemo.Mappers;


import com.AclDemo.AclDemo.Mappers.DTOs.CharactersDTOs.CharacterDTO;
import com.AclDemo.AclDemo.Mappers.DTOs.CharactersDTOs.CharacterInUpDTO;
import com.AclDemo.AclDemo.Mappers.DTOs.CharactersDTOs.CharacterInsertDTO;
import com.AclDemo.AclDemo.Mappers.DTOs.MoviesDTOs.MoviesDTO;
import com.AclDemo.AclDemo.Models.Character;
import com.AclDemo.AclDemo.Models.Movie;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface  MappStructMapper {

    Character characterToCharacterDto(Character characterModel);
    Character CharacterInsetDtoToCharacter(CharacterInUpDTO characterInUpDTO);
    Character CharacterInsertDtoToCharacter(CharacterInsertDTO character);
    List<CharacterDTO> charactersToCharacterDTO(List<Character> characters);

    List<MoviesDTO> moviesToMovieDtos(List<Movie> movies);

    MoviesDTO moviesToMovieDto(Movie movie);

    Movie moviesDTOToMovie(MoviesDTO movie);







    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
            nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
    Character updateCharacterFromDto(CharacterInUpDTO characterDto, @MappingTarget Character character);
}
