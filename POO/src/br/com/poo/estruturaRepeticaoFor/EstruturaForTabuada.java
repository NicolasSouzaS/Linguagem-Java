package br.com.poo.estruturaRepeticaoFor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EstruturaForTabuada extends JFrame {

	public static void main(String[] args) {
		/*
		 * Gerando um objeto de janela baseado na classe
		 * JFrame. Abaixo um processo de instância
		 */
		JFrame janela = new JFrame ();
		
		//Tamanho em largura e altura
		janela.setSize(500,400);
		
		//Posicionar a janela no centro da tela
		janela.setLocationRelativeTo(null);
		
		//Aplicar um titulo á janela que será criada
		janela.setTitle("Tabuada");
		
		//Comando para fechar e retirar a janela da memória
		janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		/*
		 * Vamos definir o layout como null. Isso nos ajuda
		 * a posicionar os componentes livremente
		 */
		janela.getContentPane().setLayout(null);
		
		
		
		/*
		 * Vamos adicionar um componente de texto à nossa janela.
		 * Este componente será um rótulo(label -> JLabel)
		 */
		JLabel lblNumero = new JLabel("Digite um número para a tabuada");
		
		
		/*
		 * Para posicionar a label na janela criada será necessário
		 * utilizar as configurações de posição x e y, largura e altura.
		 */
		lblNumero.setBounds(10, 10, 250, 30);
		
		//Vamos adicionar a label (lblNumero) à tela janela
		janela.add(lblNumero);
		
		/*
		 * Vamos adicionar um novo componente chamada JTextArea
		 * para apresentar os resultados da tabuada
		 */
		JTextArea txtResultado = new JTextArea();
		
		//Vamos posicionar e definir a largura e altura da caixa
		txtResultado.setBounds(10,40,463,310);
		
		//Adicionar a caixa de texto à janela
		janela.add(txtResultado);
		
		/*
		 * Para o usuário inserir um número para a tabuada, iremos
		 * adicionar um novo componente chamado JTextField(Campo de
		 * texto)
		 */
		JTextField txtNumero = new JTextField();
		
		txtNumero.setBounds(205,10,30,30);
		janela.add(txtNumero);		
		
		
		JButton btnCalcular = new JButton("Calcular");
		
		btnCalcular.setBounds(250,10,200,30);
		janela.add(btnCalcular);		
		
		
		
		
		
		
		
		
		
		
		
		
		//Comando para vizualizar a janela
		janela.setVisible(true);
		
		
		

	}

}
