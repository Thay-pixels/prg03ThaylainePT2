/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author sunhe
 */
//Classe padrão de Curso.
@Entity
@Table(name = "cursos")
public class Curso {
    
    //Atributos de Curso e colunas da tabela.
    @Column(name = "nome", nullable = false)
    private String nome;
    
    @Column(name = "codigo_curso", nullable = false)
    private String codCurso;
    
    @Column(name = "ativo")
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

    public boolean isAtivo() {
        return ativo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodCurso(String codCurso) {
        this.codCurso = codCurso;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    //Constutor com todos os atributos.
    public Curso(String nome, String codCurso, boolean ativo, Long id) {
        this.nome = nome;
        this.codCurso = codCurso;
        this.ativo = ativo;
        this.id = id;
    }

    //Construtor vazio.
    public Curso() {
    }
   
}
