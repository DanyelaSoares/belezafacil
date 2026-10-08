package com.belezafacil.backend.controller;

import com.belezafacil.backend.entity.Cliente;
import com.belezafacil.backend.service.ClienteService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

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
}