package com.spacery.booked.core.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String nome;
    private String editora;
    private int ano;
    private String autor;
    private String genero;
    private String sinopse;
    private String ISBN;

    @Override
    public String toString() {
        return String.format("[%s] %s (%d) - %s - %s",
                ISBN, nome, ano, autor, genero);
    }
}
