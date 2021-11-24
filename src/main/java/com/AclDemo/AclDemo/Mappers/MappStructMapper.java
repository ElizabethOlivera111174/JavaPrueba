package com.AclDemo.AclDemo.Mappers;


import com.AclDemo.AclDemo.Mappers.DTOs.CharacterDTO;
import com.AclDemo.AclDemo.Models.CharactersModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface  MappStructMapper {
    CharacterDTO characterToCharacterDto(CharactersModel characterModel);


    CharactersModel characterModelToCharacterDto(CharacterDTO all);
}
