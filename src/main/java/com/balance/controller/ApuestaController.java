package com.balance.controller;

import com.balance.dto.ApuestaCreateDto;
import com.balance.entities.Apuesta;
import com.balance.mappers.ApuestaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.balance.repository.ApuestaRepository;
import com.balance.service.IApuestaService;

@RestController
@RequestMapping ("/api")
public class ApuestaController {

    @Autowired
    private IApuestaService apuestaService;
    @Autowired
    private ApuestaRepository apuestaRepository;

    @GetMapping ("/usuarios/{idUsuario}/balance")
    public double getBalanceTotal(@PathVariable("idUsuario") Long idUsuario){
        return apuestaService.calcularBalanceTotal(idUsuario);
    }

    @PostMapping("/usuarios/{idUsuario}/apuestas")
    public Apuesta crearApuesta(@PathVariable("idUsuario") Long idUsuario, @RequestBody ApuestaCreateDto apuestaDto){
        Apuesta apuestaNormal = ApuestaMapper.dtoApuesta(apuestaDto);
        return apuestaService.crearApuesta(idUsuario, apuestaNormal);
    }
}
