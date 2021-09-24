package com.sgtreinamento.biblioteca.exer3.usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    private List<Usuario> buscarTodosUsuarios() {
        return usuarioService.buscarUsuarios();
    }

    @GetMapping("/{id}")
    private Usuario buscarUsuarioPeloId(@PathVariable Long id) {
        return usuarioService.buscarUsuarioPeloId(id);
    }

    @PostMapping
    private Usuario adicionarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.adicionarUsuario(usuario);
    }

}
