package com.belezafacil.backend.service;

import com.belezafacil.backend.entity.Cliente;
import com.belezafacil.backend.exception.ClienteNaoEncontradoException;
import com.belezafacil.backend.repository.ClienteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public Cliente salvar(Cliente cliente) {

        if (repository.findByTelefone(cliente.getTelefone()).isPresent()) {
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    "Telefone já cadastrado."
            );
        }

        return repository.save(cliente);
    }

    public List<Cliente> listarTodos() {
        return repository.findAll();
    }

    public Cliente buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ClienteNaoEncontradoException(id));
    }

    public Cliente atualizar(Long id, Cliente dados) {

        Cliente cliente = repository.findById(id)
                .orElseThrow(() -> new ClienteNaoEncontradoException(id));

        var clienteComTelefone = repository.findByTelefone(dados.getTelefone());

        if (clienteComTelefone.isPresent()
                && !clienteComTelefone.get().getId().equals(id)) {

            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    "Telefone já cadastrado."
            );
        }

        cliente.setNome(dados.getNome());
        cliente.setDataNascimento(dados.getDataNascimento());
        cliente.setTelefone(dados.getTelefone());
        cliente.setEmail(dados.getEmail());

        return repository.save(cliente);
    }
}
