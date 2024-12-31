/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.curso.service;

import br.com.ifba.curso.entity.Curso;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;

/**
 *
 * @author sunhe
 */
public interface CursoIService {
    
    public abstract void save(Curso curso) throws RuntimeException;
    public abstract void delete(Curso curso) throws RuntimeException;
    public abstract Curso findById(Long id) throws RuntimeException;
    public abstract List<Curso> findByNome(String nome) throws RuntimeException;
    public abstract List<Curso> findAll() throws RuntimeException;
    
}
