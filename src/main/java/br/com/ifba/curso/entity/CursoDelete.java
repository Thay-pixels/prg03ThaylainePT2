/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.entity;

import br.com.ifba.curso.entity.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.RollbackException;

/**
 *
 * @author sunhe
 */
public class CursoDelete {
    
    Curso curso = new Curso();
    
    private final static EntityManagerFactory entityManagerFactory = 
            Persistence.createEntityManagerFactory("gerenciamento_curso");
    
    //Metodo para deletar o curso.
    public void delete(){
        EntityManager em = entityManagerFactory.createEntityManager();
        try{
            em.getTransaction().begin();
            curso = em.find(Curso.class, this.curso.getId());
            if(curso != null){
                em.remove(curso);
            }
            em.getTransaction().commit();
        }catch (RollbackException e){
            em.getTransaction().rollback();
            System.err.println("Erro ao deletar o curso: " + e.getMessage());
        }finally{
            em.close();
        }
    }   
    //Fechando o EntityManagerFactory
    public static void closeEntityManagerFactory(){
        if(entityManagerFactory.isOpen()){
            entityManagerFactory.close();
        }
    }
    
}
