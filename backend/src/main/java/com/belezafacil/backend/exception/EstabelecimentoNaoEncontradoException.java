package com.belezafacil.backend.exception;

public class EstabelecimentoNaoEncontradoException extends RuntimeException {

    public EstabelecimentoNaoEncontradoException(Long id) {
        super("Estabelecimento não encontrado: " + id);
    }
}