package com.balance.entities;

import com.balance.enums.Resultado;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table (name = "apuesta")
public class Apuesta {
    @Id
    @GeneratedValue
    private Long id;

    private double montoApostado;

    private double multiplier;

    @Enumerated(EnumType.STRING)
    private Resultado resultado;

    private double gananciaCalculada;

    private String descripcion;

    @ManyToOne
    @JoinColumn(name ="usuario_id")
    @JsonIgnore
    private Usuario usuario;

}
