package br.com.projeto.testeInicio;

import br.com.projeto.testeInicio.dao.DAOPessoa;
import br.com.projeto.testeInicio.domain.Pessoa;

public class Cliente {

	public static void main(String[] args) {
		
		Pessoa cli = new Pessoa();
		DAOPessoa.salvar(cli);
		

	}

}
