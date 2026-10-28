package com.seduc2.pet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
@Entity

public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String nome;
    private String especie;
    private String raca;
    private String sexo;
    private LocalDate dataNascimento;
    private Double peso;
    private String cor;
    private boolean castrado;
    private String vacinacao;
    private String observacoes;

    public Animal() {
    }

    public Animal(int id, String nome, String especie, String raca, String sexo, LocalDate dataNascimento, Double peso, String cor, boolean castrado, String vacinacao, String observacoes) {
        Id = id;
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.peso = peso;
        this.cor = cor;
        this.castrado = castrado;
        this.vacinacao = vacinacao;
        this.observacoes = observacoes;
    }

    public Animal(String observacoes, String vacinacao, boolean castrado, String cor, Double peso, LocalDate dataNascimento, String sexo, String raca, String especie, String nome) {
        this.observacoes = observacoes;
        this.vacinacao = vacinacao;
        this.castrado = castrado;
        this.cor = cor;
        this.peso = peso;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.raca = raca;
        this.especie = especie;
        this.nome = nome;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

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

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public String getVacinacao() {
        return vacinacao;
    }

    public void setVacinacao(String vacinacao) {
        this.vacinacao = vacinacao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
