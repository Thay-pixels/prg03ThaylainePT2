/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.springapplication;

import br.com.ifba.curso.view.TelaCurso;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @author sunhe
 */

//Classe principal da aplicação Spring.
@SpringBootApplication
public class Prg03springApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context =
                        new SpringApplicationBuilder(Prg03springApplication.class).
                        headless(false).run(args);

                TelaCurso telaCurso = context.getBean(TelaCurso.class);
                telaCurso.setVisible(true);
	}
}