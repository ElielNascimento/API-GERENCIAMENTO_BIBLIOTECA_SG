package com.sgtreinamento.biblioteca.exer3.emprestimos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emprestimo")
public class EmprestimoController {

    @Autowired
    private EmprestimoService emprestimoService;


    @GetMapping
    private List<Emprestimo> buscarEmprestimo() {
        return emprestimoService.buscarEmprestimo();
    }

    @GetMapping("/buscar")
    private Emprestimo buscarPeloId(@PathVariable Long id) {
        return emprestimoService.buscarEmprestimoPeloId(id);
    }

    @PostMapping
    private Emprestimo adicionarEmprestimo(@RequestBody Emprestimo emprestimo) {
        return emprestimoService.adicionarEmprestimo(emprestimo);
    }

    @GetMapping({"/{id}"})
    private void verificarAtraso( @PathVariable  Long id) {
        emprestimoService.devolverLivro(id);
    }

}
