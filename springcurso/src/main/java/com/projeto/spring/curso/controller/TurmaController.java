package com.projeto.spring.curso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.spring.curso.domain.Turma;
import com.projeto.spring.curso.repository.TurmaRepository;

@RestController
public class TurmaController {
	
	@Autowired
	private TurmaRepository tr;
	
	@GetMapping("/turma/listar")
	public List<Turma> listar() {
		
		return tr.findAll();
	}
	
	@GetMapping("/turma/listar/{id}")
	public Optional<Turma> listar(@PathVariable Integer id) {
		
		return tr.findById(id);
	}
	
	@PostMapping("/turma/cadastrar")
	public String cadastro(@RequestBody Turma dados) {
		
		String msg = "Cadastrou!";
		
		Turma descricao = tr.save(dados);
		
		return msg+ " " +descricao.getDescricao();
	}
	
	@PutMapping("/turma/atualizar/{id}")
	public String atualizar(@PathVariable Integer id, @RequestBody Turma turma) {
		String msg = "";
		
		Optional<Turma> t = tr.findById(id);
		
		if(t.isPresent()) {
			turma.setIdcurso(id);
			tr.save(turma);
			msg = "Turma atualizada!";
		}
		else {
			msg = "Turma não encontrada";
		}
		return msg;
		
	}
	
	@DeleteMapping("/turma/apagar/{id}")
	public String apagar(@PathVariable Integer id) {
		String msg = "";
		Optional<Turma> t = tr.findById(id);
		
		if(t.isPresent()) {
			tr.deleteById(id);
			msg = "Turma cancelada!";
			
		}
		else {
			msg = "Turma não encontrada!";
		}
		
		return msg;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
	
	
	
		
	

}
