package br.com.projeto.testeInicio.dao;

import br.com.projeto.testeInicio.domain.Pessoa;

public class DAOPessoa {

	public String salvar(Pessoa pessoa) {
		String msg = "";
		
		if(pessoa.getId()<1 || pessoa.getNome().equals("")||pessoa.getEmail().equals("")) {
			
			msg = "Os campos precisam ser preenchidos.";
			
		}
		else {
			msg = "Seus dados foram recebidos.";
		}
		
		return msg;
	}
	
	public Pessoa pessoaAtualizada(Pessoa pessoa) {
		
		Pessoa pe = pessoa;
		if(pe.getId()<1 || pe.getNome().equals("")|| pe.getEmail().equals("")) {
			new Exception("Preencha todos os campos por obséquio.");
		}
		return pe;
		
		
	}
	
}
