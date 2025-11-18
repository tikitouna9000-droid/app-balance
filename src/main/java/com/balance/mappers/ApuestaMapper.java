package com.balance.mappers;

import com.balance.dto.ApuestaCreateDto;
import com.balance.entities.Apuesta;

public class ApuestaMapper {

    public static Apuesta dtoApuesta(ApuestaCreateDto dto){
        Apuesta nuevaApuesta = new Apuesta();
        nuevaApuesta.setMontoApostado(dto.getMontoApostado());
        nuevaApuesta.setMultiplier(dto.getMultiplier());
        nuevaApuesta.setResultado(dto.getResultado());
        nuevaApuesta.setDescripcion(dto.getDescripcion());

        return nuevaApuesta;
    }
}
