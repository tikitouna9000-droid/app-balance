package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.IApuestaService;

@RestController
@RequestMapping ("/api")
public class ApuestaController {

    @Autowired
    private IApuestaService apuestaService;

    @GetMapping ("/usuarios/{idUsuario}/balance")
    public double getBalanceTotal(@PathVariable("id") Long idUsuario){
        return apuestaService.calcularBalanceTotal(idUsuario);
    }
}
