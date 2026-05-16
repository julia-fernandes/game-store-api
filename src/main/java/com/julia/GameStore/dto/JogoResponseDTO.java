package com.julia.GameStore.dto;

public record JogoResponseDTO(

        String nomeJogo,

        String genero,

        Double preco,

        Integer classificacaoIndicativa,

        String descricao,

        Long idDesenvolvedora
) {
}
