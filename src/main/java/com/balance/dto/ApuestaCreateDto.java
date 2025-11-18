package com.balance.dto;

import com.balance.enums.Resultado;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApuestaCreateDto {

    private double montoApostado;
    private double multiplier;
    private Resultado resultado;
    private String descripcion;
}
