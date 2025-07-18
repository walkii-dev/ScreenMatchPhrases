package com.exercise.ScreenMatchPhrases.repository;

import com.exercise.ScreenMatchPhrases.model.Frases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface FrasesRepository extends JpaRepository <Frases,Long> {

    @Query("SELECT f FROM Frase f order by function('RANDOM') LIMIT 1")
    public String retornarFraseDoTitulo();
}
