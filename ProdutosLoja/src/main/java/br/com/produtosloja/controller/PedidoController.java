package br.com.produtosloja.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.produtosloja.model.Pedido;
import br.com.produtosloja.repository.PedidoRepository;

@RestController
@RequestMapping("/api/v1/order")
public class PedidoController {
	
	@Autowired
	private PedidoRepository pr;
	
	@GetMapping("/list")
	public ResponseEntity<Object> list(){
		try {
			return ResponseEntity.status(200).body(pr.findAll());
			
		}
		catch(Exception e) {
			return ResponseEntity.status(500).body("Erro inesperado ->"+e.getMessage());
		}
	}
	
	@PostMapping("/insert")
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseEntity<Object> insert(@RequestBody Pedido pedido){
		
		try {
			pedido.setDatapedido(new Date());
			pr.save(pedido);
			return ResponseEntity.status(201).body("Pedido realizado. IdPedido:" + pedido.getIdpedido());
		}
		catch(Exception e) {
			return ResponseEntity.status(400).body("Pedido não realizado."+e.getMessage());
		}
		
	}
	
}
