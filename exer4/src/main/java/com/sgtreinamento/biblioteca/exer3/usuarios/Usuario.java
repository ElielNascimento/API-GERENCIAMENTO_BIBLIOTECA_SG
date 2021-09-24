package com.sgtreinamento.biblioteca.exer3.usuarios;

import com.sgtreinamento.biblioteca.exer3.emprestimos.Emprestimo;
import com.sgtreinamento.biblioteca.exer3.livro.Livro;
import com.sgtreinamento.biblioteca.exer3.periodicos.Periodico;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;

    @JoinColumn(name = "usuario_id")
    @OneToMany
    private List<Livro> livroList; // 1 USUARIO PODE PEGAR N LIVROS

    @OneToMany
    private List<Periodico> periodicoList; // 1 USUARIO PODE PEGAR N PERIODICOS

    @OneToMany
    private List<Emprestimo> emprestimoList; // 1 USUARIO PODE REALIZAR  N EMPRESTIMOS

    public Usuario() {
    }

    public Usuario(String nome, String cpf, List<Livro> livroList, List<Periodico> periodicoList) {
        this.nome = nome;
        this.cpf = cpf;
        this.livroList = livroList;
        this.periodicoList = periodicoList;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Livro> getLivroList() {
        return livroList;
    }

    public void setLivroList(List<Livro> livroList) {
        this.livroList = livroList;
    }

    public List<Periodico> getPeriodicoList() {
        return periodicoList;
    }

    public void setPeriodicoList(List<Periodico> periodicoList) {
        this.periodicoList = periodicoList;
    }

    public List<Emprestimo> getEmprestimoList() {
        return emprestimoList;
    }

    public void setEmprestimoList(List<Emprestimo> emprestimoList) {
        this.emprestimoList = emprestimoList;
    }
}
