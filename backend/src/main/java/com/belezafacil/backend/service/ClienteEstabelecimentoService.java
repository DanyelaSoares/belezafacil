package com.belezafacil.backend.service;

import com.belezafacil.backend.entity.Cliente;
import com.belezafacil.backend.entity.ClienteEstabelecimento;
import com.belezafacil.backend.entity.Estabelecimento;
import com.belezafacil.backend.entity.TipoVinculo;
import com.belezafacil.backend.repository.ClienteEstabelecimentoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Service
public class ClienteEstabelecimentoService {

    private final ClienteEstabelecimentoRepository repository;

    public ClienteEstabelecimentoService(
            ClienteEstabelecimentoRepository repository) {
        this.repository = repository;
    }

    // Cria o vínculo como LEAD, caso ainda não exista
    @Transactional
    public ClienteEstabelecimento criarVinculoSeNaoExistir(
            Cliente cliente,
            Estabelecimento estabelecimento) {

        return repository.findByClienteAndEstabelecimento(
                        cliente, estabelecimento)
                .orElseGet(() -> {
                    ClienteEstabelecimento vinculo =
                            new ClienteEstabelecimento();

                    vinculo.setCliente(cliente);
                    vinculo.setEstabelecimento(estabelecimento);
                    vinculo.setTipoVinculo(TipoVinculo.LEAD);
                    vinculo.setAtivo(true);

                    return repository.save(vinculo);
                });
    }

    // Registra um atendimento realmente concluído
    @Transactional
    public ClienteEstabelecimento registrarAtendimentoConcluido(
            Cliente cliente,
            Estabelecimento estabelecimento,
            LocalDate dataAtendimento) {

        ClienteEstabelecimento vinculo =
                criarVinculoSeNaoExistir(cliente, estabelecimento);

        vinculo.setTipoVinculo(TipoVinculo.CLIENTE);
        vinculo.setAtivo(true);
        vinculo.setDataUltimoAtendimento(dataAtendimento);

        return repository.save(vinculo);
    }
}
