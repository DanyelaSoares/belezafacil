package com.daniela.belezafacil.dto.client;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
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
public class ClientRegisterRequest {

    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @NotBlank(message = "O telefone é obrigatório")
    private String telefone;

    @Email(message = "E-mail inválido")
    private String email;

    @NotBlank(message = "A senha é obrigatória")
    private String senha;
}