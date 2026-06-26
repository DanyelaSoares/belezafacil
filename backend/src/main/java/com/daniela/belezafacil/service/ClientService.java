package com.daniela.belezafacil.service;

import com.daniela.belezafacil.dto.client.ClientRegisterRequest;
import com.daniela.belezafacil.dto.client.ClientResponse;
import com.daniela.belezafacil.entity.Client;
import com.daniela.belezafacil.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientResponse register(ClientRegisterRequest request) {

        if (clientRepository.existsByTelefone(request.getTelefone())) {
            throw new RuntimeException("Telefone já cadastrado");
        }

        Client client = Client.builder()
                .nome(request.getNome())
                .telefone(request.getTelefone())
                .email(request.getEmail())
                .senha(request.getSenha())
                .ativo(true)
                .build();

        Client savedClient = clientRepository.save(client);

        return ClientResponse.builder()
                .id(savedClient.getId())
                .nome(savedClient.getNome())
                .telefone(savedClient.getTelefone())
                .email(savedClient.getEmail())
                .build();
    }
}