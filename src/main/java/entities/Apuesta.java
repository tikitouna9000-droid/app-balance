package entities;

import enums.Resultado;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name = "apuesta")
public class Apuesta {
    @Id
    @GeneratedValue
    private Long id;

    private int montoApostado;

    private double multiplier;

    @Enumerated(EnumType.STRING)
    private Resultado resultado;

    private double gananciaCalculada;
}
