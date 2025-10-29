package service.impl;

import entities.Apuesta;
import enums.Resultado;
import service.IApuestaService;

import java.util.List;

public class ApuestaService implements IApuestaService {



    @Override
    public Apuesta getApuesta(Long id) {
        return null;
    }

    @Override
    public List<Apuesta> getApuestasUsuario(Long idUsuario) {
        return List.of();
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
