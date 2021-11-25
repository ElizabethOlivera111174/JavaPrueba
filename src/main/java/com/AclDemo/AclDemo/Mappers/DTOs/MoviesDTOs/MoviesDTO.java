package com.AclDemo.AclDemo.Mappers.DTOs.MoviesDTOs;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class MoviesDTO {
    private Long id;
    private String image;
    private String title;
    private LocalDateTime creationDate;
}
