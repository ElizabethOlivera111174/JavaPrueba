package com.AclDemo.AclDemo.Controller;

import com.AclDemo.AclDemo.Exepcion.ErrorDetails;
import com.AclDemo.AclDemo.Mappers.DTOs.CharacterDTO;
import com.AclDemo.AclDemo.Mappers.MappStructMapper;
import com.AclDemo.AclDemo.Services.CharacterService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@Tag(name = "Characters")
@RestController
@RequestMapping("/characters")
public class CharactersController {
    private final MappStructMapper mappStructMapper;
    private final CharacterService characterService;


    @Operation(description = "Finds a character by his ID and shows his details")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Character found", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = CharacterDTO.class)) }),
            @ApiResponse(responseCode = "404", description = "No character have been found", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDetails.class)) })
    })
    @GetMapping("/{id}")
    public ResponseEntity<CharacterDTO> getCharacterById(@PathVariable("id") Long id) {

        return new ResponseEntity<>(mappStructMapper.characterToCharacterDto(characterService.findById(id)), HttpStatus.OK);

    }

}
