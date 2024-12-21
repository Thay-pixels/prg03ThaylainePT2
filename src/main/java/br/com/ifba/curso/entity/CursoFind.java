/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.entity;

import br.com.ifba.curso.entity.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

/**
 *
 * @author sunhe
 */
public class CursoFind {
    
    private final static EntityManagerFactory entityManagerFactory = 
            Persistence.createEntityManagerFactory("gerenciamento_curso");
    
    //Metodo para buscar um curso pelo ID
    public static Curso findById(Long id) {
        EntityManager em = entityManagerFactory.createEntityManager();
        try {
            return em.find(Curso.class, id);
        } catch (Exception e) {
            System.err.println("Erro ao buscar o curso por ID: " + e.getMessage());
            return null;
        } finally {
            em.close();
        }
    }
    
    //Metodo para buscar todos os cursos
    public static List<Curso> findAll(){
        EntityManager em = entityManagerFactory.createEntityManager();
        try{
            return em.createQuery("SELECT c FROM Curso c", Curso.class).getResultList();
        }catch(Exception e){
            System.err.println("Erro ao buscar todos os cursos: " + e.getMessage());
            return null;
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
