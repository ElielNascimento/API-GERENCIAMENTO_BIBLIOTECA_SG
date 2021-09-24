package com.sgtreinamento.biblioteca.exer3.livro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livro")
public class livroController {

    @Autowired
    private LivroService livroService;


    @GetMapping
    private List<Livro> buscarLivro() {
        return livroService.buscarLivro();
    }

    @GetMapping("{id}")
    private Livro buscarLivroPeloId(@PathVariable Long id) {
        return livroService.buscarLivroPeloId(id);
    }

    @PostMapping
    private Livro adiconarLivro(@RequestBody Livro livro) {
        return livroService.adicionarLivro(livro);
    }

}
