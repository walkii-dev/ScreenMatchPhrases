package com.exercise.ScreenMatchPhrases.model;

import jakarta.persistence.*;

@Entity
@Table(name = "frases")
public class Frases {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String frase;
    private String personagem;
    private String poster;

    public Frases(Long id, String titulo, String frase, String personagem, String poster) {
        this.id = id;
        this.titulo = titulo;
        this.frase = frase;
        this.personagem = personagem;
        this.poster = poster;
    }

    public Frases() {
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFrase() {
        return frase;
    }

    public String getPersonagem() {
        return personagem;
    }

    public String getPoster() {
        return poster;
    }
}
