package com.balance.service.impl;

import com.balance.config.SecurityConfig;
import com.balance.dto.UsuarioCreateDto;
import com.balance.entities.Usuario;
import com.balance.mappers.UsuarioMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.balance.repository.UsuarioRepository;
import com.balance.service.IUsuarioService;

@Service
public class UsuarioService implements IUsuarioService {


    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private SecurityConfig passwordEnco;

    @Override
    public Usuario crearUsuario(UsuarioCreateDto dto) {
        if (usuarioRepository.findByEmail(dto.getEmail()).isPresent()){
            throw new RuntimeException("El email ya está registrado");

        }

        String passwordCruda = dto.getPassword();
        String passwordHash = passwordEnco.passwordEncoder().encode(passwordCruda);

        Usuario nuevoUsuario = UsuarioMapper.dtoUsuario(dto, passwordHash);


        return usuarioRepository.save(nuevoUsuario);
    }
}

