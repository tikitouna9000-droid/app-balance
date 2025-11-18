package com.balance.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioCreateDto {

    private String nombre;

    private String email;

    private String password;
}
