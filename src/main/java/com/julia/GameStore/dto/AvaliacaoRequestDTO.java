package com.julia.GameStore.dto;

import jakarta.validation.constraints.NotNull;

public record AvaliacaoRequestDTO(

        @NotNull(message = "Campo obrigatório.")
        Integer nota,

        String comentario,

        @NotNull(message = "Campo obrigatório.")
        Long idJogo
) {
}
