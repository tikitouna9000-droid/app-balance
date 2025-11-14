package service.impl;

import dto.UsuarioCreateDto;
import entities.Apuesta;
import entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UsuarioRepository;
import service.IUsuarioService;

import java.util.HashMap;
import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private IUsuarioService usuarioService;
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario crearUsuario(UsuarioCreateDto dto) {
        Optional<Usuario> usuarioExistente = usuarioRepository.findByEmail(dto.getEmail());
        if (usuarioExistente.isPresent()){
            throw new RuntimeException("El email ya está registrado");

        }

        return null;
    }
}

