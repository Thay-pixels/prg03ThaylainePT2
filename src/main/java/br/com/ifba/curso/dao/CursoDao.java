/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.dao;

import br.com.ifba.curso.entity.Curso;
import br.com.ifba.infrastructure.dao.GenericIDao;
import java.util.List;

/**
 *
 * @author sunhe
 */
public class CursoDao implements CursoIDao{

    @Override
    public Curso save(Curso obj) {
        
        return null;
        
    }

    @Override
    public Curso update(Curso obj) {
        
        return null;
        
    }

    @Override
    public void delete(Curso obj) {
       
    }

    @Override
    public List<Curso> findAll() {
        
        return null;
        
    }

    @Override
    public Curso findById(Long id) {
        
        return null;
        
    }
    
    public List<Curso> findByNome(String nome){
        
       return null;
    }

}
