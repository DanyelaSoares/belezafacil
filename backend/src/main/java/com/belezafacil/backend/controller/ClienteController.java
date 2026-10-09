package com.belezafacil.backend.controller;

import com.belezafacil.backend.entity.Cliente;
import com.belezafacil.backend.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @PostMapping
    public Cliente salvar(@Valid @RequestBody Cliente cliente) {
        return service.salvar(cliente);
    }

    @GetMapping
    public List<Cliente> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Cliente atualizar(
            @PathVariable Long id,
            @Valid @RequestBody Cliente dados) {

        return service.atualizar(id, dados);
    }
}
