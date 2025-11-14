package service;

import dto.UsuarioCreateDto;
import entities.Usuario;

public interface IUsuarioService {

    Usuario crearUsuario(UsuarioCreateDto dto);
}
