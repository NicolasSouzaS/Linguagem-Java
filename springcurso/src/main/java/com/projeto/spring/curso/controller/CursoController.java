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

import com.projeto.spring.curso.domain.Curso;
import com.projeto.spring.curso.repository.CursoRepository;

@RestController
public class CursoController {

	@Autowired
	private CursoRepository cr;
	
	@GetMapping("/curso/listar")
	public List<Curso> listar() {
		return cr.findAll();
	}
	@GetMapping("/curso/listar/{id}")
	public Optional<Curso> listar(@PathVariable Integer id) {
		
		return cr.findById(id);
		
	}
	
	@PostMapping("/curso/cadastrar")
	public String cadastro(@RequestBody Curso dados) {
		String msg = "Cadastrou!";
		
		Curso titulo = cr.save(dados);
		return msg +" " +titulo.getTitulo();
	}
	
	@PutMapping("/curso/atualizar/{id}")
	public String atualizar(@PathVariable Integer id, @RequestBody Curso curso) {
		String msg = "";
		Optional<Curso> c = cr.findById(id);
		
			if(c.isPresent()) {
				curso.setIdcurso(id);
				cr.save(curso);
				msg = "Curso atualizado";
			}
			else {
				msg = "Curso não encontrado";
			}
		return msg;
		
	}
	
	@DeleteMapping("/curso/apagar/{id}")
	public String apagar(@PathVariable Integer id) {
		String msg = "";
		Optional<Curso> c = cr.findById(id);
		
		if(c.isPresent()) {
			cr.deleteById(id);
			msg = "Curso apagado!";
		}
		else {
			msg = "Curso não encontrado!";
		}
		return msg;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
