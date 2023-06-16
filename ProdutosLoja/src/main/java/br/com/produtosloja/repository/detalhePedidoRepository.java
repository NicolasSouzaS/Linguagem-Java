package br.com.produtosloja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.produtosloja.model.detalhePedido;

public interface detalhePedidoRepository extends JpaRepository<detalhePedido, Integer> {

}
