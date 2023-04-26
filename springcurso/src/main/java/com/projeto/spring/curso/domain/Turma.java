package com.projeto.spring.curso.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Turma {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idturma;
	
	@Column(nullable = false)
	private String descricao;
	
	@Column(nullable = false)
	private Integer idcurso;
	
	@Column(nullable = false)
	private Integer idsala;
	
	@Column(nullable = false)
	private String horario;

	public Turma() {
	}

	public Turma(Integer idturma, String descricao, Integer idcurso, Integer idsala, String horario) {
		this.idturma = idturma;
		this.descricao = descricao;
		this.idcurso = idcurso;
		this.idsala = idsala;
		this.horario = horario;
	}

	public Integer getIdturma() {
		return idturma;
	}

	public void setIdturma(Integer idturma) {
		this.idturma = idturma;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(Integer idcurso) {
		this.idcurso = idcurso;
	}

	public Integer getIdsala() {
		return idsala;
	}

	public void setIdsala(Integer idsala) {
		this.idsala = idsala;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

}
