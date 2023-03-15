package br.com.poo.estruturaSwitch;

import java.util.Scanner;

public class estruturaSwitch1 {

	public static void main(String[] args) {
		
		int numSemana;
		Scanner inputEntrada = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro do dia da semana");
		numSemana = inputEntrada.nextInt();
		
		switch(numSemana) {
			case 1:
				System.out.println("Domingo!");
			break;
				
			case 2:
				System.out.println("Segunda-feira!");
			break;
			
			case 3:
				System.out.println("Terça-feira!");
			break;
			
			case 4:
				System.out.println("Quarta-feira!");
			break;
			
			case 5:
				System.out.println("Quinta-feira!");
			break;
			
			case 6:
				System.out.println("Sexta-feira!");
			break;
			
			case 7:
				System.out.println("Sabado!");
			break;
			
			default:
				System.out.println("Este dia da semana não exite.");
			break;
		}
	}
}
