/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author sunhe
 */
@Entity
public class Curso {
    
    //Atributos de Curso.
    private String nome;
    private String codCurso;
    private boolean ativo;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //Getters e Setters.
    public String getNome() {
        return nome;
    }

    public Long getId() {
        return id;
    }

    public String getCodCurso() {
        return codCurso;
    }

    public boolean isativo() {
        return ativo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodCurso(String codCurso) {
        this.codCurso = codCurso;
    }

    public void setStatus(boolean ativo) {
        this.ativo = ativo;
    }

    //Construtor
    /*public Curso(String nome, int codCurso, boolean status) {
        this.nome = nome;
        this.codCurso = codCurso;
        this.status = status;
    }*/
   
}
