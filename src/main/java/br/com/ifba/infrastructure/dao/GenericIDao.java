/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.infrastructure.dao;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import java.util.List;

/**
 *
 * @author sunhe
 */
//Interface GenericIDAO.
public interface GenericIDao<Entity extends PersistenceEntity> {

    //Método de salvar.
    public abstract Entity save(Entity obj);

    //Metodo de update.
    public abstract Entity update(Entity obj);

    //Metodo de deletar.
    public abstract void delete(Entity obj);

    //Metodo de encontrar todos.
    public abstract List<Entity> findAll();
    
    //Metodo de encontrar pelo ID.
    public abstract Entity findById(Long id);
    
}

