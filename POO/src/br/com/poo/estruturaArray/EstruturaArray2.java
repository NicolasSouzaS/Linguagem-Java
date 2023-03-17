package br.com.poo.estruturaArray;

public class EstruturaArray2 {

	public static void main(String[] args) {
		
		int[] numeros = {
				10,45,63,88,96,1,32,42,7,4,6,63,74,36,66,69,95
		};
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				System.out.println(numeros[i]);
			}
		}

	}

}
