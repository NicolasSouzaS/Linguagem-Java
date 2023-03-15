package br.com.poo.estruturaSwitch;

import javax.swing.JOptionPane;

public class estruturaSwitch2 extends JOptionPane {

	public static void main(String[] args) {
		
		 JOptionPane.showMessageDialog(null, "Olá! Bom dia","Sistema",JOptionPane.INFORMATION_MESSAGE);
		 
		 String estacao = JOptionPane.showInputDialog("Digite uma estação do ano e lhe diremos os meses");
		 String rs;
		 switch(estacao) {
		 case "Verão","Verao","verao","verão":
			 rs = "Dezembro - Janeiro - Fevereiro";
			 break;
			 
		 case "Outono","outono":
		 	rs = "Março - Abril - Maio";
		 	break;
		 case "Inverno","inverno":
			 rs = "Junho - Julho - Agosto";
		 	break;
		 case "Primavera","primavera":
			 rs = "Setembro - Outubro - Novembro";
		 	break;
		 default:
			 rs = "Está estação não existe";
			 break;
		 }
		 JOptionPane.showMessageDialog(null, rs,"Resposta",JOptionPane.INFORMATION_MESSAGE);

	}

}

