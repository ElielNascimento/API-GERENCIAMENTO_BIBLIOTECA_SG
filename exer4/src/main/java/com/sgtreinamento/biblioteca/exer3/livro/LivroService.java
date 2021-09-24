package com.sgtreinamento.biblioteca.exer3.livro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {


    @Autowired
    public LivroRepository livroRepository;

    public List<Livro> buscarLivro() {
        return livroRepository.findAll();
    }

    public Livro buscarLivroPeloId(Long id) {
        return livroRepository.findById(id).orElseThrow(()
                -> new RuntimeException("Usuario nao encontrado"));
    }

    public Livro adicionarLivro(Livro livro) {
        return livroRepository.save(livro);
    }


}
