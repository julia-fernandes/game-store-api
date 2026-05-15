package com.julia.GameStore.repository;

import com.julia.GameStore.model.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JogoRepository extends JpaRepository<Jogo, Long>{
    List<Jogo> findByJogoContainingIgnoreCase(String nomeJogo);
    List<Jogo> findByDesenvolvedoraContainingIgnoreCase(String nomeDesenvolvedora);
    List<Jogo> findByGeneroContainingIgnoreCase(String genero);
    List<Jogo> findByClassificacaoIndicativa(Integer classificacaoIndicativa);
}
