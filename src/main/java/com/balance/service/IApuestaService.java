package com.balance.service;

import com.balance.entities.Apuesta;


import java.util.List;


public interface IApuestaService {
    Apuesta getApuesta(Long id);

    Apuesta crearApuesta (Long idUsuario, Apuesta nuevaApuesta);

    List<Apuesta> getApuestasUsuario(Long idUsuario);

    double calcularGanancia(Apuesta apuesta);

    double calcularPerdida(Apuesta apuesta);

    double calcularBalanceTotal(Long idUsuario);
}
