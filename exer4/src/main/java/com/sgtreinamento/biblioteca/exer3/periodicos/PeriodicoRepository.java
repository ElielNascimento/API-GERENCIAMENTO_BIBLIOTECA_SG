package com.sgtreinamento.biblioteca.exer3.periodicos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriodicoRepository extends JpaRepository <Periodico, Long> {
}
