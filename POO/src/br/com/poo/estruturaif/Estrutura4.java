package br.com.poo.estruturaif;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Estrutura4 {

	public static void main(String[] args) {
		double salario, aliquota, novosalario;
		Scanner entradaS = new Scanner(System.in);
		NumberFormat formatter = new DecimalFormat("############.##");
		
		System.out.println("Digite o salario do funcionario:\n");
		salario = entradaS.nextDouble();
		
		if(salario <= 1302.00) {
			aliquota = (7.5 * salario)/100;
			novosalario = (salario - aliquota); 
			System.out.println("O salario será descontado 7,5%. Por final será descontado do salário: " +aliquota);
			System.out.println("\nO salário final será:" + novosalario);
		}
		else if (salario <= 2571.29) {
			aliquota = (9.0 * salario)/100;
			novosalario = (salario - aliquota); 
			System.out.println("O salario será descontado 9,0%. Por final será descontado do salário: " +aliquota);
			System.out.println("\n O salário final será: " + novosalario);
		}
		else if (salario <= 3856.96) {
			aliquota = (12.0 * salario)/100;
			novosalario = (salario - aliquota); 
			System.out.println("O salário será descontado 12,0%. Por final será descontado do salário: " +aliquota);
			System.out.println("\nO salário final será: " + novosalario);
		}
		else if (salario <= 7507.49) {
			aliquota = (14.0 * salario)/100;
			novosalario = (salario - aliquota); 
			System.out.println("O salário será descontado 14,0%. Por final será descontado do salário: " +aliquota);
			System.out.println("\nO salário final será: " + novosalario);
		}
		else {
			System.out.println("Numero não correspondente.");
		}
	}
	
}
