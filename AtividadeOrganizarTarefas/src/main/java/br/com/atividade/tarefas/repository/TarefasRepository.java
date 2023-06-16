package br.com.atividade.tarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.atividade.tarefas.domain.Tarefas;

public interface TarefasRepository extends JpaRepository<Tarefas, Integer>{

}
