package br.com.poo.objetos;

import java.util.Scanner;

public class CalculoDesconto {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in); 
		    
		    System.out.print("Digite o valor do produto: ");
		    double valorProduto = scanner.nextDouble(); 
		   
		    System.out.print("Digite o percentual de desconto: "); 
		    double percDesconto = scanner.nextDouble(); 
		   
		    double desconto = valorProduto * (percDesconto/100); 
		   
		     double valorFinal = valorProduto - desconto ;
		    
		     System.out.println("Valor Final: " + valorFinal); 

		    scanner.close(); 

	}

}
