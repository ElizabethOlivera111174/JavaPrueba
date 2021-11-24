package com.AclDemo.AclDemo.Exepcion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ResouceNotFoundException extends RuntimeException{
    private String message;
}
