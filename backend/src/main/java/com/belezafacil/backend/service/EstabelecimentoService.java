package com.belezafacil.backend.service;

import com.belezafacil.backend.entity.Estabelecimento;
import com.belezafacil.backend.repository.EstabelecimentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstabelecimentoService {

    private final EstabelecimentoRepository repository;

    public EstabelecimentoService(EstabelecimentoRepository repository) {
        this.repository = repository;
    }

    public Estabelecimento salvar(Estabelecimento estabelecimento) {
        return repository.save(estabelecimento);
    }

    public List<Estabelecimento> listarTodos() {
        return repository.findAll();
    }
}