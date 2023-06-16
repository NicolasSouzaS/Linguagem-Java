package br.com.atividade.tarefas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.atividade.tarefas.domain.Tarefas;
import br.com.atividade.tarefas.repository.TarefasRepository;

@RestController
public class TarefasController {
	
	@Autowired
	private TarefasRepository tr;
	
	@GetMapping("/tarefas/listar")
	public List<Tarefas> listar() {
		return tr.findAll();
	}

}
