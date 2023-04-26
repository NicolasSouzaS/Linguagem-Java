package br.com.projeto.testeInicio.dao.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.projeto.testeInicio.dao.DAOPessoa;
import br.com.projeto.testeInicio.domain.Pessoa;

public class TestDaoPessoa {
	
	@Test
	public void testeSalvar() {
		
		DAOPessoa dp = new DAOPessoa();
		
		Pessoa pe = new Pessoa();
		
		pe.setId(50);
		pe.setNome("Márcia");
		pe.setEmail("marcia@oul.com.br");
		
		
		String rs = dp.salvar(pe);
		
		//Assertions.assertEquals("marcia@oul.com.br", pe.getEmail());
		//Assertions.assertEquals(50, pe.getId());
		Assertions.assertEquals("Seus dados foram recebidos.", rs);
		
		
	}
	@Test
	public void testpessoaAtualizada() {
		
		DAOPessoa dp = new DAOPessoa();
		
		Pessoa pe = new Pessoa(10,"Roberto","roberto@uol.com.br");
		
		String rs = dp.salvar(pe);
		
		System.out.println(pe.getNome());
		
		pe.setNome("Ronilda");
		
		Pessoa rsp = dp.pessoaAtualizada(pe);
		
		Assertions.assertEquals("Ronilda", rsp.getNome());
		
	}

}
