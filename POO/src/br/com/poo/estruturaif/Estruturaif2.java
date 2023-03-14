package br.com.poo.estruturaif;

import java.util.Scanner;

/*
 * Este programa calcula as notas dos alunos e obtem a média de
 * cada aluno. Após isso é apresentada uma das mensagens: Aprovado!
 * ou Reprovado!
 */

public class Estruturaif2 {
	
	public static void main(String[] args) {
		double nota1,nota2,nota3,nota4,media;
		Scanner entrada = new Scanner(System.in);
		System.out.println("################# Sistema de Notas ###################");
		System.out.println("\nDigite as notas abaixo");
		System.out.println("Digite a primeira nota: \n");
		nota1 = entrada .nextDouble();
		
		System.out.println("Digite a segunda nota: \n");
		nota2 = entrada .nextDouble();
		
		System.out.println("Digite a terceira nota: \n");
		nota3 = entrada .nextDouble();
		
		System.out.println("Digite a quarta nota \n");
		nota4 = entrada .nextDouble();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		//A média de aprovação da escola é 7
		if(media >= 7) {
			System.out.println("A media do aluno foi: " + media + "O aluno foi aprovado. Parabéns!");
		}
		else {
			System.out.println("A média do aluno foi: " + media + "O aluno infelizmente foi reprovado. Te vejo no próximo no ano.");
		}
	}

}
