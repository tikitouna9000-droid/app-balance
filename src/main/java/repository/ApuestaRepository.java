package repository;

import entities.Apuesta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApuestaRepository extends JpaRepository <Apuesta, Long> {
}
