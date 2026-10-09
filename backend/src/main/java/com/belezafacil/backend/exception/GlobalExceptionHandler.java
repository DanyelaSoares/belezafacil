
package com.belezafacil.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EstabelecimentoNaoEncontradoException.class)
    public ResponseEntity<ErroResposta> tratarEstabelecimentoNaoEncontrado(
            EstabelecimentoNaoEncontradoException exception) {

        ErroResposta erro = new ErroResposta(
                HttpStatus.NOT_FOUND.value(),
                exception.getMessage()
        );

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
    }

    @ExceptionHandler(ClienteNaoEncontradoException.class)
    public ResponseEntity<ErroResposta> tratarClienteNaoEncontrado(
            ClienteNaoEncontradoException exception) {

        ErroResposta erro = new ErroResposta(
                HttpStatus.NOT_FOUND.value(),
                exception.getMessage()
        );

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
    }
    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<ErroResposta> tratarErroDeRequisicao(
            ResponseStatusException exception) {

        ErroResposta erro = new ErroResposta(
                exception.getStatusCode().value(),
                exception.getReason()
        );

        return ResponseEntity
                .status(exception.getStatusCode())
                .body(erro);
    }
}
