package com.sgtreinamento.biblioteca.exer3.emprestimos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprestimoRepo extends JpaRepository <Emprestimo, Long> {
}
