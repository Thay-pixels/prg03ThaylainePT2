/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.service;


import br.com.ifba.curso.entity.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.RollbackException;
import br.com.ifba.curso.repository.CursoRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sunhe
 */

//Classe Service para Curso.

@Service
@RequiredArgsConstructor
public class CursoService implements CursoIService{
    
    private final CursoRepository cursoRepository;
    private static final Logger log = LoggerFactory.getLogger(CursoService.class);
    
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
            cursoRepository.save(curso);
            log.info("Salvando o Objeto Curso!");
        }
     
    }
    
    //Método de update do curso.
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
                log.info("deletando o objeto Curso!");
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
        log.info("buscando um objeto curso pelo id!");
        return cursoRepository.findById(id).orElse(null);
        
    }
    
    @Override
    public List<Curso> findByNome(String nome) throws RuntimeException {
        log.info("buscando um objeto curso pelo nome!");
        return cursoRepository.findByNome(nome);
    } 
    
    //Metodo para buscar todos os cursos.
    @Override
    public List<Curso> findAll(){
        log.info("buscando todos os objetos curso!");
        return cursoRepository.findAll();
        
    }
    
}
