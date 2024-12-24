/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.infrastructure.dao;

import br.com.ifba.curso.entity.Curso;
import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.RollbackException;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sunhe
 */
public class GenericDao<Entity extends PersistenceEntity>implements GenericIDao<Entity> {

    protected static EntityManager entityManager;
    static{
        EntityManagerFactory factory = Persistence. createEntityManagerFactory("p_dao");
        entityManager = factory.createEntityManager();
    }

    Curso curso = new Curso();
    
    protected Class<?> getTypeClass () {
        Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return clazz;
    }
    
    /*//Fechando o EntityManagerFactory.
    public static void closeEntityManagerFactory(){
        if(entityManagerFactory.isOpen()){
            entityManagerFactory.close();
        }
    }*/

    //Método para Salvar com uma pequena parte para atualizar o curso.
    @Override
    public Entity save(Entity obj) {
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
        return null;
    }

    @Override
    public Entity update(Entity obj) {
       
        return null;
       
    }

     //Metodo para deletar o curso.
    @Override
    public void delete(Entity obj) {
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
    
    //Metodo para buscar todos os cursos.
    @Override
    public List<Entity> findAll(){
    return entityManager.createQuery("from " + getTypeClass().getName()).getResultList();
    }

    //Metodo para buscar um curso pelo ID.
    @Override
    public Entity findById(Long id) { 
    return (Entity) entityManager.find(getTypeClass(), id);
    }
    
}
