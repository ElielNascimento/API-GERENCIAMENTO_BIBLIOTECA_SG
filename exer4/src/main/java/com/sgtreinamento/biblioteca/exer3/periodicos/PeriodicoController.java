package com.sgtreinamento.biblioteca.exer3.periodicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/periodico")
public class PeriodicoController {

    @Autowired
    private PeriodicoService periodicoService;

    @GetMapping
    private List<Periodico> buscarPeriodico() {
        return periodicoService.buscarPeriodico();
    }

    @GetMapping("/{id}")
    private Periodico buscarPeloId(@PathVariable Long id) {
        return periodicoService.buscarPeloId(id);
    }

    @PostMapping
    private Periodico adicionarPeriodico(@RequestBody Periodico periodico) {
        return periodicoService.adicionarPeriodico(periodico);
    }
}
