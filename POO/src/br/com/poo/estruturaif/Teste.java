package br.com.poo.estruturaif;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		DecimalFormat formatter = new DecimalFormat("#0.00");
	    double d; 
	    Scanner entrada = new Scanner(System.in);
	    System.out.println(formatter.format(entrada));
	   
	    
	    System.out.println("Numero que vc digitou é: " + entrada );
	    
	    
	}
}