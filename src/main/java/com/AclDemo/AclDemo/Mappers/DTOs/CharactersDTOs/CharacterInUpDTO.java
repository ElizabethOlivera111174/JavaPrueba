package com.AclDemo.AclDemo.Mappers.DTOs.CharactersDTOs;

import com.AclDemo.AclDemo.Models.Movie;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
public class CharacterInUpDTO {


    private Long id;

    private String name;

    private String image;

    private String history;

}
