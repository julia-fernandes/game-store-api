package com.julia.GameStore.dto;

import jakarta.validation.constraints.*;

public record JogoRequestDTO(

        @NotBlank(message = "Campo obrigatório.")
        String nomeJogo,

        @NotBlank(message = "Campo obrigatório.")
        String genero,

        @NotNull(message = "Campo obrigatório.")
        @Positive(message = "O valor do produto deve ser maior que zero.")
        Double preco,

        @NotNull(message = "Campo obrigatório.")
        @Min(value = 0, message = "Classificação mínima permitida é 0.")
        @Max(value = 18, message = "Classificação máxima permitida é 18.")
        Integer classificacaoIndicativa,

        @NotBlank(message = "Faça uma breve descrição sobre o jogo.")
        String descricao
) {
}
