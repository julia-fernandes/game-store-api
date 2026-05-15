package com.julia.GameStore.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "TBDESENVOLVEDORA")
public class Desenvolvedora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDesenvolvedora;

    private String nome;

    private String pais;

    private Integer anoFundacao;

    //uma desenvolvedora pode ter muitos jogos
    @OneToMany(mappedBy = "desenvolvedora")
    private List<Jogo> jogos = new ArrayList();

}