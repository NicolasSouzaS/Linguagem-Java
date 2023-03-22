package br.com.poo.objetos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaBancaria extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaBancaria frame = new JanelaBancaria();
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
	public JanelaBancaria() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(JanelaBancaria.class.getResource("/br/com/poo/images/Bradesco.JPG")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 357, 198);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPoupanca = new JButton("Poupança");
		btnPoupanca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Poupanca po = new Poupanca();
				po.setVisible(true);
				
			}
		});
		btnPoupanca.setBounds(26, 25, 121, 111);
		contentPane.add(btnPoupanca);
		
		JButton btnCorrente = new JButton("Corrente");
		btnCorrente.setBounds(188, 25, 121, 111);
		contentPane.add(btnCorrente);
	}
}
