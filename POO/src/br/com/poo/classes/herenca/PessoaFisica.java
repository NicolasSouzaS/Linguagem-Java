package br.com.poo.classes.herenca;

/*
 * A classe PessoaFisica herda as propriedades e métodos
 * da classe Pessoa. Por isso usamos o comando
 * extends(extender) para gerar a herança
 */

public abstract class PessoaFisica extends Pessoa{
	
	private String nome;
	private String cpf;
	
	
	public PessoaFisica() {
		
	}


	public PessoaFisica(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	

}
