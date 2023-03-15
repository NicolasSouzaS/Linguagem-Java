package br.com.poo.estruturaSwitch;

import javax.swing.JOptionPane;

public class estruturaSwitch3 extends JOptionPane {

	public static void main(String[] args) {
		String cargos = JOptionPane.showInputDialog("Digite um cargo");
		String rs;
		
		switch(cargos) {
		case "Diretor","diretor":
			rs = "O salario do diretor possui R$20000";
		break;
		
		case "Gerente","gerente":
			rs = "O salario do gerente possui R$15000";
		break;
		
		case "Secretária","Secretaria","secretaria","secretária":
			rs = "O salario do secretaria possui R$8000";
		break;
		
		case "Analista","analista":
			rs = "O salario do diretor possui R$7000";
		break;
		
		case "Assistente","assistente":
			rs = "O salario do diretor possui R$4000";
		break;
		
		case "Estagiario","estagiario","Estagiário","estagiário":
			rs = "O salario do diretor possui R$1500";
		break;
		
		default:
			rs = "Cargo não existente";
		break;
		}
		JOptionPane.showMessageDialog(null, rs,"Resposta",JOptionPane.INFORMATION_MESSAGE);

	}

}
