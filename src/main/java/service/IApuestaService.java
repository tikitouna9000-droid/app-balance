package service;

import entities.Apuesta;


import java.util.List;


public interface IApuestaService {
    Apuesta getApuesta(Long id);

    List<Apuesta> getApuestasUsuario(Long idUsuario);

    double calcularGanancia(Apuesta apuesta);

    double calcularPerdida(Apuesta apuesta);

    double calcularBalanceTotal(Long idUsuario);
}
