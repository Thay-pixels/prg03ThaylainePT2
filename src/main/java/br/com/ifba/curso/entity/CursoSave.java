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
public class CursoSave {
    
    private final static EntityManagerFactory entityManagerFactory = 
            Persistence.createEntityManagerFactory("gerenciamento_curso");
    private final static EntityManager entityManager = entityManagerFactory.createEntityManager();

    Curso curso = new Curso();

    //Construtor vazio.
    public CursoSave() {
    }
 
    //Método para Salvar com uma pequena parte para atualizar o curso.
    public Curso save(Curso curso){
        try{
            entityManager.getTransaction().begin();
            if(this.curso.getId() == null){
               entityManager.persist(this);
            }else{
                entityManager.merge(this);
            }
            entityManager.getTransaction().commit();
        }catch(RollbackException e){
            entityManager.getTransaction().rollback();
            System.err.println("Erro ao salvar o curso " + e.getMessage());
        }finally{
            entityManager.close();
        }
        
        return curso;
    }
    
    //Fechando o EntityManagerFactory.
    public static void closeEntityManagerFactory(){
        if(entityManagerFactory.isOpen()){
            entityManagerFactory.close();
        }
    }
    
}
