package com.belezafacil.backend.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EstabelecimentoNaoEncontradoException.class)
    public ResponseEntity<Void> tratarEstabelecimentoNaoEncontrado(
            EstabelecimentoNaoEncontradoException exception) {

        return ResponseEntity.notFound().build();
    }
}