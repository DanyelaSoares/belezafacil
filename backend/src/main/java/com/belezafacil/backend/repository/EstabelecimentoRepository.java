
package com.belezafacil.backend.repository;

import com.belezafacil.backend.entity.Estabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EstabelecimentoRepository
        extends JpaRepository<Estabelecimento, Long> {

    Optional<Estabelecimento> findByCnpj(String cnpj);
}
