
package com.belezafacil.backend.service;

import com.belezafacil.backend.entity.Estabelecimento;
import com.belezafacil.backend.exception.EstabelecimentoNaoEncontradoException;
import com.belezafacil.backend.repository.EstabelecimentoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EstabelecimentoService {

    private final EstabelecimentoRepository repository;

    public EstabelecimentoService(EstabelecimentoRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Estabelecimento salvar(Estabelecimento estabelecimento) {
        String cnpj = normalizarCnpj(estabelecimento.getCnpj());
        estabelecimento.setCnpj(cnpj);

        if (repository.findByCnpj(cnpj).isPresent()) {
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    "CNPJ já cadastrado."
            );
        }

        if (estabelecimento.getAtivo() == null) {
            estabelecimento.setAtivo(true);
        }

        return repository.save(estabelecimento);
    }

    public List<Estabelecimento> listarTodos() {
        return repository.findAll();
    }

    public Estabelecimento buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EstabelecimentoNaoEncontradoException(id));
    }

    @Transactional
    public Estabelecimento atualizar(Long id, Estabelecimento dados) {
        Estabelecimento estabelecimento = buscarPorId(id);

        String cnpj = normalizarCnpj(dados.getCnpj());

        var estabelecimentoComCnpj = repository.findByCnpj(cnpj);

        if (estabelecimentoComCnpj.isPresent()
                && !estabelecimentoComCnpj.get().getId().equals(id)) {
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    "CNPJ já cadastrado em outro estabelecimento."
            );
        }

        estabelecimento.setNome(dados.getNome());
        estabelecimento.setNomeFantasia(dados.getNomeFantasia());
        estabelecimento.setCnpj(cnpj);
        estabelecimento.setLogo(dados.getLogo());
        estabelecimento.setTelefone(dados.getTelefone());
        estabelecimento.setEmail(dados.getEmail());
        estabelecimento.setEndereco(dados.getEndereco());

        if (dados.getAtivo() != null) {
            estabelecimento.setAtivo(dados.getAtivo());
        }

        return repository.save(estabelecimento);
    }

    @Transactional
    public Estabelecimento inativar(Long id) {
        Estabelecimento estabelecimento = buscarPorId(id);
        estabelecimento.setAtivo(false);
        return repository.save(estabelecimento);
    }

    @Transactional
    public Estabelecimento ativar(Long id) {
        Estabelecimento estabelecimento = buscarPorId(id);
        estabelecimento.setAtivo(true);
        return repository.save(estabelecimento);
    }

    private String normalizarCnpj(String cnpj) {
        if (cnpj == null || cnpj.isBlank()) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "CNPJ é obrigatório."
            );
        }

        String cnpjNormalizado = cnpj.replaceAll("[./-]", "");

        if (!cnpjNormalizado.matches("[0-9]{14}")) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "CNPJ deve conter 14 dígitos numéricos."
            );
        }

        return cnpjNormalizado;
    }
}
