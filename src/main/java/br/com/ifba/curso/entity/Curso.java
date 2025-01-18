/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import br.com.ifba.infrastructure.entity.PersistenceEntity;
import java.io.Serializable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author sunhe
 */

//Classe padrão de Curso.
@Entity
@Table(name = "cursos")
@NoArgsConstructor
public class Curso extends PersistenceEntity implements Serializable{
    
    //Atributos de Curso e colunas da tabela.
    @Column(name = "nome", nullable = false)
    @Getter @Setter private String nome;
    
    @Column(name = "codigo_curso", nullable = false, unique = true)
    @Getter @Setter private String codCurso;
    
    @Column(name = "ativo")
    @Getter @Setter private boolean ativo;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
   
}
