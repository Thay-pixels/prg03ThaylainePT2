/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.service;

import br.com.ifba.curso.dao.CursoDao;
import br.com.ifba.curso.dao.CursoIDao;
import br.com.ifba.curso.entity.Curso;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.RollbackException;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sunhe
 */

@Service
public class CursoService implements CursoIService{
    
    private final CursoIDao cursoDao; 
    
    @Autowired 
    public CursoService(CursoIDao cursoDao) {
        this.cursoDao = cursoDao;
    }
    
    protected static EntityManager entityManager;
    static{
        EntityManagerFactory factory = Persistence. createEntityManagerFactory("p_dao");
        entityManager = factory.createEntityManager();
    }

    Curso curso = new Curso();

    //Método para Salvar com uma pequena parte para atualizar o curso.
    @Override
    public void save(Curso curso) {
         if(curso == null){//Verifica se o curso teve dados vazios.
            throw new RuntimeException ("Dados do curso nao preenchidos!");

        //Verifica se o curso já possui um ID, se sim, ele já existe na base de dados.
        } else if(curso.getId() != null){
            throw new RuntimeException ("O curso ja existe no banco de dados!");
        } else {//Se passar pelos dois, então é curso novo.
            cursoDao.save(curso);
        }
     
    }
    
    @Override
    public void update(Curso curso){
        
    }

    //Metodo para deletar o curso.
    @Override
    public void delete(Curso curso) {
        try{
            entityManager.getTransaction().begin();
            curso = entityManager.find(Curso.class, this.curso.getId());
            if(curso != null){
                entityManager.remove(curso);
            }
            entityManager.getTransaction().commit();
        }catch (RollbackException e){
            entityManager.getTransaction().rollback();
            System.err.println("Erro ao deletar o curso: " + e.getMessage());
        }finally{
            entityManager.close();
        }
    }

    //Metodo para buscar um curso pelo ID.
    @Override
    public Curso findById(Long id) { 
        return cursoDao.findById(id);
        
    }
    
    public List<Curso> findByNome(String nome) throws RuntimeException {
        return cursoDao.findByNome(nome);
    } 
    
    //Metodo para buscar todos os cursos.
    @Override
    public List<Curso> findAll(){
        return cursoDao.findAll();
        
    }
    
}
