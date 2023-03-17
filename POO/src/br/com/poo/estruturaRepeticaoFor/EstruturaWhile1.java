package br.com.poo.estruturaRepeticaoFor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class EstruturaWhile1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtInicial;
	private JTextField txtFinal;

	/**
	 * Launch the application.
	 */
	
	 int i;
	 String dados = "";
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EstruturaWhile1 frame = new EstruturaWhile1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EstruturaWhile1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\nicolas.ssantos15\\Downloads\\images.jfif"));
		setResizable(false);
		setBackground(new Color(0, 255, 255));
		setTitle("Nike contadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 325, 369);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Número Inicial");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Swis721 Hv BT", Font.PLAIN, 11));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 11, 86, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Número Final");
		lblNewLabel_1.setFont(new Font("Swis721 Hv BT", Font.PLAIN, 11));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 44, 86, 23);
		contentPane.add(lblNewLabel_1);
		
		txtInicial = new JTextField();
		txtInicial.setBounds(101, 17, 64, 20);
		contentPane.add(txtInicial);
		txtInicial.setColumns(10);
		
		txtFinal = new JTextField();
		txtFinal.setBounds(101, 45, 64, 20);
		contentPane.add(txtFinal);
		txtFinal.setColumns(10);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 117, 158, 211);
		contentPane.add(scrollPane);
		
		JTextArea txtResultado = new JTextArea();
		scrollPane.setViewportView(txtResultado);
		
		
		JButton btnExecutar = new JButton("Executar");
		btnExecutar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				i = Integer.parseInt(txtInicial.getText());
				
				while(i <= Integer.parseInt(txtFinal.getText())) {
					dados += i+ "\n";
					i++;
				}
				txtResultado.setText(dados);
				txtInicial.setText("");
				txtFinal.setText("");
				dados = "";
				
			}
		});
		btnExecutar.setBackground(new Color(255, 255, 255));
		btnExecutar.setBounds(40, 78, 89, 23);
		contentPane.add(btnExecutar);
		
		
		
		
		
		
	}
}
