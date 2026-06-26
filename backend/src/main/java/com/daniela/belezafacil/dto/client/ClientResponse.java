package com.daniela.belezafacil.dto.client;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientResponse {

    private Long id;

    private String nome;

    private String telefone;

    private String email;

}