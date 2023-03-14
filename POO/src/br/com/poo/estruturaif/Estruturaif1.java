package br.com.poo.estruturaif;

import java.util.Scanner;

public class Estruturaif1 {
	public static void main(String args[]) {
		System.out.println("=============== Valor Par ou Impar ===============");
		System.out.println("\nEntre com um valor numérico");
		//Declaração de variável numérica
		int numero;
		//Permite a entrada de dados via teclado pelo terminal ao usuário. Resumidamente
		//o comando permitira que o usuário se comunique e digite
		Scanner entrada = new Scanner(System.in);
		numero = entrada.nextInt();
		
		//Vamos testar se o numero digitado é par ou impar
		
		//Comando para dizer que "if = se"
		if(numero % 2 == 0) {
			System.out.println("O número: " + numero + " é Par");
		}
		//Comando para dizer "Else = Senão"
		else {
			System.out.println("O número: " + numero + "é Impar");
		}
	}
}
