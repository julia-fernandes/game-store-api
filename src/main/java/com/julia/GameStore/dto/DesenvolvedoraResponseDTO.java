package com.julia.GameStore.dto;

public record DesenvolvedoraResponseDTO(

        //exibe atributos selecionados ao invés da entidade completa

        String nomeDesenvolvedora,

        String pais,

        Integer anoFundacao
) {
}