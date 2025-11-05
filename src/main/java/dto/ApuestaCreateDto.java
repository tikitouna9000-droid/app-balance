package dto;

import enums.Resultado;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApuestaCreateDto {

    private double montoApostado;
    private double multiplier;
    private Resultado resultado;
}
