/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.curso.controller;

import br.com.ifba.curso.entity.Curso;
import java.util.List;

/**
 *
 * @author sunhe
 */
public interface CursoIController {
    
    public abstract void save(Curso curso);
    public abstract void update(Curso curso);
    public abstract void delete(Curso curso);
    public abstract Curso findById(Long id);
    public abstract List <Curso> findByNome(String nome);
    public abstract List <Curso> findAll();
    
}
