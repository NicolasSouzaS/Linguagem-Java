package br.com.atividade.tarefas;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AtividadeOrganizarTarefasApplication {

	/*
	 * Lista de comando para troca de porta dentro do projeto main
	 */
	public static void main(String[] args) {
		SpringApplication app= new SpringApplication(AtividadeOrganizarTarefasApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8095"));
		
		app.run(args);
	}

}
