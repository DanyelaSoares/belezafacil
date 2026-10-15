
package com.belezafacil.backend.repository;

import com.belezafacil.backend.entity.Cliente;
import com.belezafacil.backend.entity.ClienteEstabelecimento;
import com.belezafacil.backend.entity.Estabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteEstabelecimentoRepository
        extends JpaRepository<ClienteEstabelecimento, Long> {

    Optional<ClienteEstabelecimento>
    findByClienteAndEstabelecimento(Cliente cliente,
                                    Estabelecimento estabelecimento);
}
