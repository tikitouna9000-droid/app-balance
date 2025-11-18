package com.balance.repository;

import com.balance.entities.Apuesta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ApuestaRepository extends JpaRepository <Apuesta, Long> {

    List<Apuesta> findByUsuarioId(Long usuarioId);
}
