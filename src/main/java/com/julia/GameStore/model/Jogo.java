package com.julia.GameStore.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name ="TBJOGO")
public class Jogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idJogo;

    private String nomeJogo;

    private String genero;

    private Double preco;

    private Integer classificacaoIndicativa;

    private String descricao;


    @ManyToOne //muitos jogos podem ser de uma desenvolvedora
    @JoinColumn(name = "idDesenvolvedora") //define a chave estrangeira
    private Desenvolvedora desenvolvedora;

}