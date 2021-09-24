package com.sgtreinamento.biblioteca.exer3.periodicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeriodicoService {

    @Autowired
    public PeriodicoRepository periodicoRepository;

    public List<Periodico> buscarPeriodico() {
        return periodicoRepository.findAll();
    }

    public Periodico buscarPeloId(Long id) {
        return periodicoRepository.findById(id).orElseThrow(() -> new RuntimeException("usuario nao encontrado"));
    }

    public Periodico adicionarPeriodico(Periodico periodico) {
        return periodicoRepository.save(periodico);
    }
}
