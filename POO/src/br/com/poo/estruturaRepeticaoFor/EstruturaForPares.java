package br.com.poo.estruturaRepeticaoFor;

import javax.swing.JOptionPane;

public class EstruturaForPares extends JOptionPane {

	public static void main(String[] args) {
		
		String inicio,termino,resultado = "";
		
		inicio = JOptionPane.showInputDialog("Entre com um número");
		
		termino = JOptionPane.showInputDialog("Entre com outro número");
		
		/*
		 *Os valores que entrarão em inicio e termino veem do elemento
		 *JOptionPane.showInputDialog no formato de texto. Como íremos
		 *realizar uma contagem com os valores será necessário converte-los
		 *para números inteiros. Assim, usuamos a classe Integer com a função
		 *parseInt e convertemos para números as variaveis inicio, termino
		 */
	
		int in = Integer.parseInt(inicio);
		int ter = Integer.parseInt(termino);
		
		for(int i = in; i <= ter; i++) {
			if(i % 2 == 0) {
				resultado += "\n" +i;
			}
		}
		
		JOptionPane.showMessageDialog(null, resultado,"Números pares",JOptionPane.INFORMATION_MESSAGE);

	}

}
