/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.dao;
import br.com.ifba.curso.entity.Curso;
import br.com.ifba.infrastructure.dao.GenericDao;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sunhe
 */

//Classe CursoDao.
@Repository
public class CursoDao extends GenericDao<Curso> implements CursoIDao{

    public List<Curso> findByNome(String nome) {
        
        return null;
    }

}
