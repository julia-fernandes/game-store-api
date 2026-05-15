package com.julia.GameStore.repository;

import com.julia.GameStore.model.Avaliacao;
import com.julia.GameStore.model.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {
    List<Avaliacao> findByJogoAvaliado(Long idJogo);
}