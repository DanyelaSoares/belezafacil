package com.belezafacil.backend.service;
import com.belezafacil.backend.entity.Estabelecimento;
import com.belezafacil.backend.exception.EstabelecimentoNaoEncontradoException;
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

    public Estabelecimento buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EstabelecimentoNaoEncontradoException(id));
    }
    public Estabelecimento atualizar(Long id, Estabelecimento dados) {
        Estabelecimento estabelecimento = repository.findById(id)
                .orElseThrow(() -> new EstabelecimentoNaoEncontradoException(id));

        estabelecimento.setNome(dados.getNome());
        estabelecimento.setNomeFantasia(dados.getNomeFantasia());
        estabelecimento.setLogo(dados.getLogo());
        estabelecimento.setTelefone(dados.getTelefone());
        estabelecimento.setEmail(dados.getEmail());
        estabelecimento.setEndereco(dados.getEndereco());
        estabelecimento.setAtivo(dados.getAtivo());

        return repository.save(estabelecimento);
    }
}