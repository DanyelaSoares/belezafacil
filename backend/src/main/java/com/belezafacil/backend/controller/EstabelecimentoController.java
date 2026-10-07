package com.belezafacil.backend.controller;

import com.belezafacil.backend.entity.Estabelecimento;
import com.belezafacil.backend.service.EstabelecimentoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/estabelecimentos")
public class EstabelecimentoController {

    private final EstabelecimentoService service;

    public EstabelecimentoController(EstabelecimentoService service) {
        this.service = service;
    }

    @PostMapping
    public Estabelecimento salvar(@RequestBody Estabelecimento estabelecimento) {
        return service.salvar(estabelecimento);
    }

    @GetMapping
    public List<Estabelecimento> listarTodos() {
        return service.listarTodos();
    }
    @GetMapping("/{id}")
    public Estabelecimento buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

}
