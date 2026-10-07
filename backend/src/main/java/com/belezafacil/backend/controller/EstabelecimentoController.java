package com.belezafacil.backend.controller;

import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Estabelecimento> buscarPorId(@PathVariable Long id) {

        Estabelecimento estabelecimento = service.buscarPorId(id);

        if (estabelecimento == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(estabelecimento);
    }
}
