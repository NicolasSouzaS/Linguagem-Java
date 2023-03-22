package br.com.poo.objetos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextField;

public class Poupanca extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumeroBanco;
	private JTextField txtAgencia;
	private JTextField txtNumeroConta;
	private JTextField txtNomeTitular;
	private JTextField txtSaldoInicial;
	private JTextField txtRendimento;
	private JTextField txtDeposito;
	private int saldo;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	
	
	
	public Poupanca() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Poupanca.class.getResource("/br/com/poo/images/logob.JPG")));
		setTitle("Conta Poupança");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 756, 616);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(210, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("POUPANÇA");
		lblNewLabel.setIcon(new ImageIcon(Poupanca.class.getResource("/br/com/poo/images/bradescoh.JPG")));
		lblNewLabel.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 15));
		lblNewLabel.setBackground(new Color(255, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(-7, -1, 747, 178);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CONTA POUPANÇA");
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(136, 188, 463, 47);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Número do Banco");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblNewLabel_1_1.setBackground(Color.BLACK);
		lblNewLabel_1_1.setBounds(21, 225, 201, 32);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Agência");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblNewLabel_1_1_1.setBackground(Color.BLACK);
		lblNewLabel_1_1_1.setBounds(266, 225, 201, 32);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Número da Conta");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblNewLabel_1_1_1_1.setBackground(Color.BLACK);
		lblNewLabel_1_1_1_1.setBounds(512, 226, 201, 32);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Nome do Titular");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblNewLabel_1_2.setBackground(Color.BLACK);
		lblNewLabel_1_2.setBounds(125, 292, 463, 47);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Saldo Inicial");
		lblNewLabel_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblNewLabel_1_1_1_2.setBackground(Color.BLACK);
		lblNewLabel_1_1_1_2.setBounds(64, 381, 201, 32);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("Rendimento");
		lblNewLabel_1_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblNewLabel_1_1_1_2_1.setBackground(Color.BLACK);
		lblNewLabel_1_1_1_2_1.setBounds(474, 381, 201, 32);
		contentPane.add(lblNewLabel_1_1_1_2_1);
		
		JButton btnDepositar = new JButton("DEPOSITAR");
		btnDepositar.setForeground(new Color(255, 0, 0));
		btnDepositar.setFont(new Font("Verdana", Font.PLAIN, 19));
		btnDepositar.setBounds(270, 470, 177, 42);
		contentPane.add(btnDepositar);
		btnDepositar.setEnabled(false);
		
		JButton btnSacar = new JButton("SACAR");
		btnSacar.setForeground(new Color(255, 0, 0));
		btnSacar.setFont(new Font("Verdana", Font.PLAIN, 19));
		btnSacar.setBounds(270, 524, 177, 42);
		contentPane.add(btnSacar);
		btnSacar.setEnabled(false);
		
		JButton btnVerificarSaldo = new JButton("VERIFICAR SALDO");
		btnVerificarSaldo.setForeground(new Color(255, 0, 0));
		btnVerificarSaldo.setBackground(new Color(255, 255, 255));
		btnVerificarSaldo.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnVerificarSaldo.setBounds(30, 481, 197, 75);
		contentPane.add(btnVerificarSaldo);
		btnVerificarSaldo.setEnabled(false);
		
		JLabel lblNewLabel_1_1_1_2_1_1 = new JLabel("Valor de Depósito");
		lblNewLabel_1_1_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2_1_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblNewLabel_1_1_1_2_1_1.setBackground(Color.BLACK);
		lblNewLabel_1_1_1_2_1_1.setBounds(487, 450, 201, 32);
		contentPane.add(lblNewLabel_1_1_1_2_1_1);
		
		txtNumeroBanco = new JTextField();
		txtNumeroBanco.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				if(txtNumeroBanco.getText().equals("") || txtNumeroBanco.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "Número banco obrigatório");
					txtNumeroBanco.requestFocus();
				}
				
			}
		});
		txtNumeroBanco.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 25));
		txtNumeroBanco.setBounds(31, 261, 194, 32);
		contentPane.add(txtNumeroBanco);
		txtNumeroBanco.setColumns(10);
		
		txtAgencia = new JTextField();
		txtAgencia.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				if(txtAgencia.getText().equals("") || txtAgencia.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "Numero de agencia obrigatório");
					txtAgencia.requestFocus();
				}
				
			}
		});
		txtAgencia.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 25));
		txtAgencia.setColumns(10);
		txtAgencia.setBounds(266, 261, 194, 32);
		contentPane.add(txtAgencia);
		
		txtNumeroConta = new JTextField();
		txtNumeroConta.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				if(txtNumeroConta.getText().equals("") || txtNumeroConta.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "Numero de conta obrigatório");
					txtNumeroConta.requestFocus();
				}
				
			}
		});
		txtNumeroConta.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 25));
		txtNumeroConta.setColumns(10);
		txtNumeroConta.setBounds(518, 261, 194, 32);
		contentPane.add(txtNumeroConta);
		
		txtNomeTitular = new JTextField();
		txtNomeTitular.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				if(txtNomeTitular.getText().equals("") || txtNomeTitular.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "Nome do titular é obrigatório");
					txtNomeTitular.requestFocus();
				}
				
			}
		});
		txtNomeTitular.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 25));
		txtNomeTitular.setColumns(10);
		txtNomeTitular.setBounds(28, 339, 684, 32);
		contentPane.add(txtNomeTitular);
		
		txtSaldoInicial = new JTextField();
		txtSaldoInicial.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				if(txtSaldoInicial.getText().equals("") || txtSaldoInicial.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "Saldo da conta é obrigatório ser dito");
					txtSaldoInicial.requestFocus();
				}
				
			}
		});
		txtSaldoInicial.setBounds(28, 415, 286, 32);
		contentPane.add(txtSaldoInicial);
		txtSaldoInicial.setColumns(10);
		
		txtRendimento = new JTextField();
		txtRendimento.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				if(txtRendimento.getText().equals("") || txtRendimento.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "O rendimento precisa ser dito!");
				}
				btnVerificarSaldo.setText("ABRIR CONTA");
				btnVerificarSaldo.setEnabled(true);
				
			}
		});
		txtRendimento.setBounds(429, 415, 286, 32);
		contentPane.add(txtRendimento);
		txtRendimento.setColumns(10);
		
		txtDeposito = new JTextField();
		txtDeposito.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtDeposito.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				if(txtDeposito.getText().equals("") || txtDeposito.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "O valor do deposito é obrigatório!");
				}
				btnDepositar.setEnabled(true);
				
			}
		});
		txtDeposito.setBounds(467, 485, 246, 75);
		contentPane.add(txtDeposito);
		txtDeposito.setColumns(10);
	}
}
