/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.entity;

import br.com.ifba.curso.entity.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sunhe
 */
//Classe para procurar o Curso.
public class CursoFind {
    
    private final static EntityManagerFactory entityManagerFactory = 
            Persistence.createEntityManagerFactory("gerenciamento_curso");
    private final static EntityManager entityManager = entityManagerFactory.createEntityManager();
    
    //Metodo para buscar um curso pelo ID.
    public Curso findById(Long id) {
        //EntityManager em = new ConnectionFactory().getConnection();
        Curso curso= null;
        
        try {
            curso = entityManager.find(Curso.class, id);
        } catch(Exception e) {
            System.out.println("Erro: ");
        }finally{
             entityManager.close();
        }
        
        return curso;
    }
    
    //Metodo para buscar todos os cursos.
    public List<Curso> findAll(){
       //EntityManager em = new ConnectionFactory().getConnection();
       List<Curso> cursos = null;

        try {
            cursos = entityManager.createQuery("from Tarefa").getResultList();
        } catch(Exception e) {
             System.out.println("Erro: ");
            
        }finally{
            entityManager.close();
        }
        if (cursos == null) {
            cursos = new ArrayList<>();
        }

        return cursos;
    }
    
    //Fechando o EntityManagerFactory.
    public static void closeEntityManagerFactory(){
        if(entityManagerFactory.isOpen()){
            entityManagerFactory.close();
        }
    }
    
}
