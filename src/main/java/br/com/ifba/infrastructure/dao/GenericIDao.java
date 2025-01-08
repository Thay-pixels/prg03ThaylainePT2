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

    //Método abstrato de salvar.
     public abstract void save(Entity obj);

    //Metodo abstrato de update.
    public abstract void update(Entity obj);

    //Metodo abstrato de deletar.
    public abstract void delete(Entity obj);

    //Metodo abstrato de encontrar todos.
    public abstract List<Entity> findAll();
    
    //Metodo abstrato de encontrar pelo ID.
    public abstract Entity findById(Long id);
    
}

