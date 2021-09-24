package com.sgtreinamento.biblioteca.exer3.usuarios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository  extends JpaRepository <Usuario, Long> {
}
