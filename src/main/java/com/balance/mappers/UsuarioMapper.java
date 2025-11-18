package com.balance.mappers;

import com.balance.dto.UsuarioCreateDto;
import com.balance.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import com.balance.service.impl.UsuarioService;

public class UsuarioMapper {

    @Autowired
    UsuarioService usuarioService;

    public static Usuario dtoUsuario(UsuarioCreateDto dto, String passwordHash){
        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setNombre(dto.getNombre());
        nuevoUsuario.setEmail(dto.getEmail());
        nuevoUsuario.setPassword(passwordHash);

        return nuevoUsuario;
    }
}
