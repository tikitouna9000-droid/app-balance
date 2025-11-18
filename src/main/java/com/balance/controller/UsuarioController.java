package com.balance.controller;

import com.balance.dto.UsuarioCreateDto;
import com.balance.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.balance.repository.UsuarioRepository;
import com.balance.service.IUsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;
    @Autowired
    private UsuarioRepository usuarioRepository;



    @PostMapping("/registro")
    public Usuario crearUsuario(@RequestBody UsuarioCreateDto usarioDto){
        return usuarioService.crearUsuario(usarioDto);
    }
}
