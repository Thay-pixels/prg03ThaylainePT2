/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.curso.dao;

import br.com.ifba.curso.entity.Curso;
import br.com.ifba.infrastructure.dao.GenericIDao;
import br.com.ifba.infrastructure.entity.PersistenceEntity;
import java.util.List;

/**
 *
 * @author sunhe
 */
public interface CursoIDao extends GenericIDao<Curso>{

    public List<Curso> findByNome(String nome);

}