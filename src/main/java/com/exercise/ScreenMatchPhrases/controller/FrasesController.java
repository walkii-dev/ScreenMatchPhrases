package com.exercise.ScreenMatchPhrases.controller;

import com.exercise.ScreenMatchPhrases.dto.FrasesDTO;
import com.exercise.ScreenMatchPhrases.repository.FrasesRepository;
import com.exercise.ScreenMatchPhrases.service.FrasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FrasesController   {

    @Autowired
    private FrasesService service;

    @GetMapping("/series/frases")
    public FrasesDTO obterFraseAleatoria(){
        return service.obterFraseAleatoria();
    }
}
