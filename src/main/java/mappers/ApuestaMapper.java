package mappers;

import dto.ApuestaCreateDto;
import entities.Apuesta;

public class ApuestaMapper {

    public static Apuesta toEntity(ApuestaCreateDto dto){
        Apuesta nuevaApuesta = new Apuesta();
        nuevaApuesta.setMontoApostado(dto.getMontoApostado());
        nuevaApuesta.setMultiplier(dto.getMultiplier());
        nuevaApuesta.setResultado(dto.getResultado());

        return nuevaApuesta;
    }
}
