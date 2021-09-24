package com.sgtreinamento.biblioteca.exer3.periodicos;

import javax.persistence.*;

@Entity
@Table(name = "periodico")
public class Periodico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String tipo; // jornal ou revista

    public Periodico(){
    }

    public Periodico(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


}
