package com.AclDemo.AclDemo.Mappers.DTOs.CharactersDTOs;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class CharacterInsertDTO {


    private Long id;

    private String name;

    private String image;

    private String history;

}
