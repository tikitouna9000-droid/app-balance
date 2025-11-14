package repository;

import entities.Apuesta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface ApuestaRepository extends JpaRepository <Apuesta, Long> {

    List<Apuesta> findByUsuarioId(Long usuarioId);
}
