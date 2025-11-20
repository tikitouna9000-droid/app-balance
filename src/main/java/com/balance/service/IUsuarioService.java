package com.balance.service;

import com.balance.dto.UsuarioCreateDto;
import com.balance.dto.UsuarioLoginDto;
import com.balance.entities.Usuario;

public interface IUsuarioService {

    Usuario crearUsuario(UsuarioCreateDto dto);

    Usuario login(UsuarioLoginDto dto);
}
