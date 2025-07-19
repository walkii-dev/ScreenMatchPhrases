package com.exercise.ScreenMatchPhrases.service;

import com.exercise.ScreenMatchPhrases.dto.FrasesDTO;
import com.exercise.ScreenMatchPhrases.model.Frases;
import com.exercise.ScreenMatchPhrases.repository.FrasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FrasesService {

    @Autowired
    private FrasesRepository repository;

    public FrasesDTO obterFraseAleatoria(){
        Frases frase  = repository.findById(4L).get();
       return new FrasesDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
