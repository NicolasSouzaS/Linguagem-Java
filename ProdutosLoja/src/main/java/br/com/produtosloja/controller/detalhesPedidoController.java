package br.com.produtosloja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.produtosloja.model.detalhePedido;
import br.com.produtosloja.repository.detalhePedidoRepository;

@RestController
@RequestMapping("/api/v1/orderdetail")
public class detalhesPedidoController {
	
	@Autowired
	private detalhePedidoRepository dpr;
	
	
	@GetMapping("/list")
	public ResponseEntity<Object> list(){
		try {
			return ResponseEntity.status(200).body(dpr.findAll());
		}
		catch(Exception e) {
			return ResponseEntity.status(500).body("Erro ao carregar dados ->"+e.getMessage());
		}
	}
	
	@PostMapping("/insert")
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseEntity<Object> insert(@RequestBody detalhePedido detalhes){
		
		try {
			dpr.save(detalhes);
			return ResponseEntity.status(201).body("Quantidade de produtos."+detalhes.getQuantidade()+"Código do produto"+detalhes.getIdproduto()+"Código de pedido"+detalhes.getIdpedido());
		}
		catch(Exception e) {
			return ResponseEntity.status(400).body("O pedido não foi cadastrado ->"+e.getMessage());
		}
	}
	
}
