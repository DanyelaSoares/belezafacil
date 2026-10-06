package com.belezafacil.backend.repository;

import com.belezafacil.backend.entity.Estabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Long> {
}