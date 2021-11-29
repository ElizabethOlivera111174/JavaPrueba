package com.AclDemo.AclDemo.Services;

import com.AclDemo.AclDemo.IServices.IcharactersService;
import com.AclDemo.AclDemo.Models.Character;
import com.AclDemo.AclDemo.Repository.CharacterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class CharacterService implements IcharactersService {

    private final CharacterRepository characterRepository;


    @Override
    public List<Character>getAll() {

        return characterRepository.findAll();
    }

    @Override
    public Character findById(Long characterId) {
        return characterRepository.findById(characterId).orElseThrow(() -> new ResourceNotFoundException("No Character with ID : " + characterId));
    }



    @Override
    public List<Character> findByName(String name) {

        return (List<Character>) characterRepository.findByName(name);
    }



    @Override
    public Character save(Character character){

        return characterRepository.save(character);
    }


    @Override
    public void delete(Long id){

        characterRepository.delete(findById(id));

    }


}
