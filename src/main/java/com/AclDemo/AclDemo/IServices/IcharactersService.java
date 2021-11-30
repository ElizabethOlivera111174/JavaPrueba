package com.AclDemo.AclDemo.IServices;


import com.AclDemo.AclDemo.Mappers.DTOs.CharactersDTOs.CharacterDTO;
import com.AclDemo.AclDemo.Models.Character;

import java.util.List;

public interface IcharactersService {


    List<Character> getAll();


    Character findById(Long characterId);

    List<Character> findByName(String name);

    Character save(Character character);

    void delete(Long id);


}
