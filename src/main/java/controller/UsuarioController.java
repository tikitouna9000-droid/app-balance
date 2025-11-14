package controller;

import dto.ApuestaCreateDto;
import entities.Apuesta;
import mappers.ApuestaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.UsuarioRepository;
import service.IUsuarioService;

@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;
    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/usuarios/{idUsuario}/apuestas")
    public Apuesta crearApuesta(@PathVariable("idUsuario") Long idUsuario, @RequestBody ApuestaCreateDto apuestaDto){
        Apuesta apuestaNormal = ApuestaMapper.toEntity(apuestaDto);
        return usuarioService.crearUsuario(idUsuario, apuestaNormal);
    }
}
