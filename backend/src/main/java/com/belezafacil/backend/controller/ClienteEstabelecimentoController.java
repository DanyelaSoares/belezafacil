
package com.belezafacil.backend.controller;

import com.belezafacil.backend.entity.Cliente;
import com.belezafacil.backend.entity.ClienteEstabelecimento;
import com.belezafacil.backend.entity.Estabelecimento;
import com.belezafacil.backend.service.ClienteEstabelecimentoService;
import com.belezafacil.backend.service.ClienteService;
import com.belezafacil.backend.service.EstabelecimentoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/clientes-estabelecimentos")
public class ClienteEstabelecimentoController {

    private final ClienteEstabelecimentoService vinculoService;
    private final ClienteService clienteService;
    private final EstabelecimentoService estabelecimentoService;

    public ClienteEstabelecimentoController(
            ClienteEstabelecimentoService vinculoService,
            ClienteService clienteService,
            EstabelecimentoService estabelecimentoService) {
        this.vinculoService = vinculoService;
        this.clienteService = clienteService;
        this.estabelecimentoService = estabelecimentoService;
    }

    @PostMapping
    public ClienteEstabelecimento criarVinculo(
            @RequestBody CriarVinculoRequest requisicao) {

        Cliente cliente = clienteService.buscarPorId(requisicao.clienteId());
        Estabelecimento estabelecimento =
                estabelecimentoService.buscarPorId(requisicao.estabelecimentoId());

        if (!Boolean.TRUE.equals(estabelecimento.getAtivo())) {
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    "Não é possível criar um vínculo com um estabelecimento inativo."
            );
        }

        return vinculoService.criarVinculoSeNaoExistir(
                cliente,
                estabelecimento
        );
    }

    public record CriarVinculoRequest(
            Long clienteId,
            Long estabelecimentoId
    ) {
    }
}
