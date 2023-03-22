package br.com.poo.objetos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private int calculo;
	private int zero = 0;
	private int um;
	private int dois;
	private int tres;
	private int quatro;
	private int cinto;
	private int seis;
	private int sete;
	private int oito;
	private int nove;
	private int igual;
	private int multi;
	private double soma;
	private int menos;
	private JTextArea txtResultado;
	private String resultado;
	private	double soma2;
	private String guardar;
	private double valor;
	
	

	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		
		guardar = "0";
		soma2 = 0;
		resultado = "0";
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Calculadora.class.getResource("/br/com/poo/images/Wineass-Ios7-Redesign-Calculator.512.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 448);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 64));
		contentPane.setForeground(new Color(0, 0, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setForeground(new Color(255, 255, 255));
		lblResultado.setBackground(new Color(0, 0, 64));
		lblResultado.setBounds(10, 11, 578, 97);
		contentPane.add(lblResultado);
		
		
		
		
		JButton btnMenos = new JButton("-");
		btnMenos.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 34));
		btnMenos.setBounds(424, 301, 93, 38);
		contentPane.add(btnMenos);
		
		JButton btnMais = new JButton("+");
		btnMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				soma = Double.parseDouble(txtResultado.getText());
				txtResultado.setText(resultado);
				resultado = "";
				
				soma2 = Double.parseDouble(txtResultado.getText());
				valor += (soma + soma2);
				
				
				
				
				
				
				
				
				
			}
		});
		btnMais.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 34));
		btnMais.setBounds(424, 245, 93, 45);
		contentPane.add(btnMais);
		
		JButton btnMutiplicacao = new JButton("*");
		btnMutiplicacao.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 34));
		btnMutiplicacao.setBounds(424, 196, 93, 38);
		contentPane.add(btnMutiplicacao);
		
		JButton btnDivisao = new JButton("/");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDivisao.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 34));
		btnDivisao.setBounds(424, 147, 93, 38);
		contentPane.add(btnDivisao);
		
		JButton btnZero = new JButton("0");
		btnZero.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
			if(txtResultado.getText().equals("0")) {
				resultado = "0";
				txtResultado.setText(resultado);}
				
				else	{
					resultado += "0";
					txtResultado.setText(resultado);
			}
			}
		});
		
		
		btnZero.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 34));
		btnZero.setBounds(20, 338, 360, 61);
		contentPane.add(btnZero);
		
		JButton btnUm = new JButton("1");
		
			
		
		btnUm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtResultado.getText().equals("0")) {
					resultado = "1";
					txtResultado.setText(resultado);}
					
					else	{
						resultado += "1";
						txtResultado.setText(resultado);
					}
			
				
			}
		});
		btnUm.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 34));
		btnUm.setBounds(20, 270, 120, 61);
		contentPane.add(btnUm);
		
		JButton btnDois = new JButton("2");
		btnDois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtResultado.getText().equals("0")) {
					resultado = "2";
					txtResultado.setText(resultado);}
					
					else	{
						resultado += "2";
						txtResultado.setText(resultado);
					}
				
			}
		});
		
		btnDois.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 34));
		btnDois.setBounds(150, 270, 120, 61);
		contentPane.add(btnDois);
		
		JButton btnTres = new JButton("3");
		btnTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtResultado.getText().equals("0")) {
					resultado = "3";
					txtResultado.setText(resultado);}
					
					else	{
						resultado += "3";
						txtResultado.setText(resultado);
					}
				
			}
		});
		btnTres.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 34));
		btnTres.setBounds(280, 270, 120, 61);
		contentPane.add(btnTres);
		
		JButton btnQuatro = new JButton("4");
		btnQuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				if(txtResultado.getText().equals("0")) {
					resultado = "4";
					txtResultado.setText(resultado);}
					
					else	{
						resultado += "4";
						txtResultado.setText(resultado);
					}
				
			}
		});
		btnQuatro.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 34));
		btnQuatro.setBounds(20, 195, 120, 61);
		contentPane.add(btnQuatro);
		
		JButton btnCinco = new JButton("5");
		
		btnCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.getText().equals("0")) {
					resultado = "5";
					txtResultado.setText(resultado);}
					
					else	{
						resultado += "5";
						txtResultado.setText(resultado);
					}
			}
		});
		btnCinco.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 34));
		btnCinco.setBounds(150, 195, 120, 61);
		contentPane.add(btnCinco);
		
		JButton btnSeis = new JButton("6");
		btnSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtResultado.getText().equals("0")) {
					resultado = "6";
					txtResultado.setText(resultado);}
					
					else	{
						resultado += "6";
						txtResultado.setText(resultado);
					}
			}
		});
		btnSeis.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 34));
		btnSeis.setBounds(280, 194, 120, 61);
		contentPane.add(btnSeis);
		
		JButton btnSete = new JButton("7");
		btnSete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtResultado.getText().equals("0")) {
					resultado = "7";
					txtResultado.setText(resultado);}
					
					else	{
						resultado += "7";
						txtResultado.setText(resultado);
					}	
			}
			
		});
		btnSete.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 34));
		btnSete.setBounds(20, 123, 120, 61);
		contentPane.add(btnSete);
		
		JButton btnOito = new JButton("8");
		btnOito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(txtResultado.getText().equals("0")) {
					resultado = "8";
					txtResultado.setText(resultado);}
					
					else	{
						resultado += "8";
						txtResultado.setText(resultado);
					}
			}
		});
		btnOito.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 34));
		btnOito.setBounds(150, 123, 120, 61);
		contentPane.add(btnOito);
		
		JButton btnNove = new JButton("9");
		btnNove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtResultado.getText().equals("0")) {
					resultado = "9";
					txtResultado.setText(resultado);}
					
					else	{
						resultado += "9";
						txtResultado.setText(resultado);
					}
				
			}
		});
		btnNove.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 34));
		btnNove.setBounds(280, 123, 120, 61);
		contentPane.add(btnNove);
		
		
		JButton btnIgual = new JButton("=");
		btnIgual.setBounds(424, 350, 93, 45);
		contentPane.add(btnIgual);
		btnIgual.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 34));
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtResultado.setText("" + valor);
				
			}
		});
		
		
		
		txtResultado = new JTextArea();
		txtResultado.setFont(new Font("Swis721 Hv BT", Font.PLAIN, 25));
		txtResultado.setForeground(new Color(255, 255, 255));
		txtResultado.setBackground(new Color(0, 0, 64));
		txtResultado.setBounds(375, 22, 213, 78);
		contentPane.add(txtResultado);
		txtResultado.setText(resultado);
		
	}
}
