

package com.example.demo.model;

public class Personagem {

    private String nome;
    private String especie;
    private String ocupacao;

    public Personagem(String nome, String especie, String ocupacao) {
        this.nome = nome;
        this.especie = especie;
        this.ocupacao = ocupacao;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }
}