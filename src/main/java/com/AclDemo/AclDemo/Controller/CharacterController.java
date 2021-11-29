package com.AclDemo.AclDemo.Controller;

import com.AclDemo.AclDemo.Mappers.DTOs.CharactersDTOs.CharacterDTO;
import com.AclDemo.AclDemo.Mappers.DTOs.CharactersDTOs.CharacterInUpDTO;
import com.AclDemo.AclDemo.Mappers.MappStructMapper;
import com.AclDemo.AclDemo.Models.Character;
import com.AclDemo.AclDemo.Services.CharacterService;
import io.swagger.v3.oas.annotations.Operation;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@Tag(name = "Characters")
@RestController
@RequestMapping("/characters")
public class CharacterController {
    private final MappStructMapper mappStructMapper;
    private final CharacterService characterService;

    @Operation(description = "Gets all characters")
    @GetMapping("/getAllCharacters")
    public ResponseEntity<List<CharacterDTO>> getAllCharacters() {
        return new ResponseEntity<>(mappStructMapper.charactersToCharacterDTO(characterService.getAll()), HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<CharacterDTO> getCharacterById(@PathVariable("id") Long id) {

        return new ResponseEntity<>(mappStructMapper.characterToCharacterDto(characterService.findById(id)), HttpStatus.OK);

    }

    @GetMapping(params = "name")
    public ResponseEntity<List<CharacterInUpDTO>> findCharacterByName(@Parameter(description = "Filter by name") @RequestParam(value = "name", required = false) String name) {

        return new ResponseEntity(characterService.findByName(name), HttpStatus.OK);

    }

    @PostMapping("/saveCharacter")
    public ResponseEntity<CharacterInUpDTO> saveCharacter(@Valid @RequestBody CharacterInUpDTO character) {

     Character character1= characterService.save(mappStructMapper.CharacterInsetDtoToCharacter(character));

        return new ResponseEntity(mappStructMapper.characterToCharacterDto(character1), HttpStatus.CREATED);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<CharacterInUpDTO> updateCharacter(@Valid @RequestBody CharacterInUpDTO character, @PathVariable("id") Long id) {

        Character characterUpdated = characterService.save(characterService.findById(id));

        return new ResponseEntity(characterUpdated, HttpStatus.OK);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteCharacterById(@PathVariable("id") Long id) {

        characterService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
