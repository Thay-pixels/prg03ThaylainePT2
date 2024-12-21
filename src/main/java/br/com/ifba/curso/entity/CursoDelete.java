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
//Classe para deletar o Curso.
public class CursoDelete {
    
    Curso curso = new Curso();//Objeto para guardar o curso para apagar.
    
    private final static EntityManagerFactory entityManagerFactory = 
            Persistence.createEntityManagerFactory("gerenciamento_curso");
    private final static EntityManager entityManager = entityManagerFactory.createEntityManager();
    
    //Metodo para deletar o curso.
    public Curso delete(Long id){
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
        
        return curso;
    }   
    //Fechando o EntityManagerFactory.
    public static void closeEntityManagerFactory(){
        if(entityManagerFactory.isOpen()){
            entityManagerFactory.close();
        }
    }
    
}
