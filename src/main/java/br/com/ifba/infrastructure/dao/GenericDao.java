/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.infrastructure.dao;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sunhe
 */
//Classe GenericDAO
@SuppressWarnings("unchecked")
@Repository
@Transactional
public class GenericDao<Entity extends PersistenceEntity> implements GenericIDao<Entity>{
    
    @PersistenceContext
    protected EntityManager entityManager;
    
    protected static EntityManager em;
    private final static EntityManagerFactory entityManagerFactory = 
            Persistence.createEntityManagerFactory("p_dao");
    private final Class<Entity> entityClass = null;
    
    
    private Class<?> getTypeClass() {
        Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];

        return clazz; //Retorna o tipo da classe.
    }

    //Método para salvar.
    @Override
    public void save(PersistenceEntity obj) {
        EntityManager entityManager = null;
        EntityTransaction transaction = null;

        try {
            entityManager = entityManagerFactory.createEntityManager();
            transaction = entityManager.getTransaction();
            transaction.begin();

            entityManager.persist(obj);

            transaction.commit();

        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
            throw new RuntimeException("Erro ao salvar o curso!", e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
       
    }

    //Método para dar update.
    @Override
    public void update(PersistenceEntity obj) {
        EntityManager entityManager = null;
        EntityTransaction transaction = null;

        try {
            entityManager = entityManagerFactory.createEntityManager();
            transaction = entityManager.getTransaction();
            transaction.begin();

            PersistenceEntity updatedEntity = entityManager.merge(obj);

            transaction.commit();

        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
            throw new RuntimeException("Erro ao atualizar curso!", e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        
    }

    //Método para deletar.
    @Override
    public void delete(PersistenceEntity obj) {
        EntityManager entityManager = null;
        EntityTransaction transaction = null;

        try {
            entityManager = entityManagerFactory.createEntityManager();
            transaction = entityManager.getTransaction();
            transaction.begin();

            PersistenceEntity managedEntity = entityManager.merge(obj);
            entityManager.remove(managedEntity);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
            throw new RuntimeException("Erro ao deletar o curso! ", e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        
    }

    //Método para busca todos.
    @Override
    public List findAll() {
        List<Entity> entity = null;
        try {
            entity = em.createQuery("from Curso").getResultList();
        } catch(Exception e) {
             System.out.println("Erro ao encontrar.");   
        }if(entity == null) {
            entity = new ArrayList<>();
        }

        return entity;
        
    }

    //Método para buscar por ID.
    @Override
    public Entity findById(Long id) {
        try {
            return em.find(entityClass, id);
        } catch (Exception e) {
            System.out.println("Erro ao buscar entidade por ID." + e.getMessage());
            return null;
        }
    }
        
}
