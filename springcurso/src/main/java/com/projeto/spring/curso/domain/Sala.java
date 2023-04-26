package com.projeto.spring.curso.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sala {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idsala;
	
	@Column(nullable = false)
	private Integer numero;
	
	@Column(nullable = false)
	private String tipo;
	
	@Column(nullable = false)
	private String descricao;

	public Sala() {
	}

	public Sala(Integer idsala, Integer numero, String tipo, String descricao) {
		this.idsala = idsala;
		this.numero = numero;
		this.tipo = tipo;
		this.descricao = descricao;
	}

	public Integer getIdsala() {
		return idsala;
	}

	public void setIdsala(Integer idsala) {
		this.idsala = idsala;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
