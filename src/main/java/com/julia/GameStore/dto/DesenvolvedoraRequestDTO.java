package com.julia.GameStore.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DesenvolvedoraRequestDTO(

        //o que é solicitado para registrar as informações e
        //valida a entrada antes de chegar ao banco

        @NotBlank(message = "Campo obrigatório.")
        String nomeDesenvolvedora,

        @NotBlank(message = "Campo obrigatório.")
        String pais,

        @NotNull(message = "Campo obrigatório.")
        @Max(value = 2026, message = "Ano informado maior que o atual.")
        Integer anoFundacao
) {
}