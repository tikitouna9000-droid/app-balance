package com.balance.service.impl;

import com.balance.entities.Apuesta;
import com.balance.entities.Usuario;
import com.balance.enums.Resultado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.balance.repository.ApuestaRepository;
import com.balance.repository.UsuarioRepository;
import com.balance.service.IApuestaService;

import java.util.List;

@Service
public class ApuestaService implements IApuestaService {


    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ApuestaRepository apuestaRepository;

    @Override
    public Apuesta getApuesta(Long id) {
        return apuestaRepository.findById(id).orElseThrow(()-> new RuntimeException("La apuesta con id " + id + "no existe"));
    }

    @Override
    public Apuesta crearApuesta(Long idUsuario, Apuesta nuevaApuesta) {
        Usuario usuarioEncontrado = usuarioRepository.findById(idUsuario).orElseThrow(() -> new RuntimeException("usuario no encontrado"));
        nuevaApuesta.setUsuario(usuarioEncontrado);
        return apuestaRepository.save(nuevaApuesta);

    }

    @Override
    public List<Apuesta> getApuestasUsuario(Long idUsuario) {
        return apuestaRepository.findByUsuarioId(idUsuario);
    }

    @Override
    public double calcularGanancia(Apuesta apuesta) {
        return apuesta.getMontoApostado() * apuesta.getMultiplier();
    }


    @Override
    public double calcularPerdida(Apuesta apuesta) {
        return apuesta.getMontoApostado();
    }

    @Override
    public double calcularBalanceTotal(Long idUsuario) {
        List<Apuesta> apuestas = getApuestasUsuario(idUsuario);
        double balance = 0.0;

        for (Apuesta apuesta : apuestas){
            if (apuesta.getResultado() == Resultado.GANADA){
                balance += calcularGanancia(apuesta);
            } else if(apuesta.getResultado() == Resultado.PERDIDA){
                    balance -= calcularPerdida(apuesta);
                }
            }
             return balance;
            }
        }
