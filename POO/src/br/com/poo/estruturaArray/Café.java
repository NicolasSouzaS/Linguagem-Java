package br.com.poo.estruturaArray;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Café extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigoProduto;
	private JTextField txtBarras;
	private JTextField txtDescricao;
	private JTextField txtValorUnitario;
	private JTextField txtQuantidade;
	private JTextField txtTotalUnitario;
	private JTextField txtSubtotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Café frame = new Café();
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
	public Café() {
		
		String[][] produtos = {
				
				{"2023","Pão Francês","13.00","17032023"},
				{"2024","Pão Leite","15.00","17032024"},
				{"2025","Torta de Frango","50.00","17032025"},
				{"2026","Leite Integral","5.00","17032026"},
				{"2027","Manteiga","5.00","17032027"},
				{"2028","Bolo","20.00","170302028"},
				{"2029","Bauru","12.00","17032029"},
				{"2030","Suco Laranja","7.00","17032030"}
			

				
		};
					
		
		
		
		
		
		
		
		setResizable(false);
		setTitle("Janela Café");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlEsquerdo = new JPanel();
		pnlEsquerdo.setForeground(new Color(255, 255, 255));
		pnlEsquerdo.setBackground(new Color(0, 0, 64));
		pnlEsquerdo.setBounds(0, 0, 800, 700);
		contentPane.add(pnlEsquerdo);
		pnlEsquerdo.setLayout(null);
		
		JLabel lblCodigoProd = new JLabel("Código do Produto:");
		lblCodigoProd.setForeground(new Color(255, 255, 255));
		lblCodigoProd.setFont(new Font("Swis721 Hv BT", Font.PLAIN, 18));
		lblCodigoProd.setBounds(10, 300, 261, 68);
		pnlEsquerdo.add(lblCodigoProd);
		
		JLabel lblCodigoBarras = new JLabel("Código de Barras:");
		lblCodigoBarras.setForeground(Color.WHITE);
		lblCodigoBarras.setFont(new Font("Swis721 Hv BT", Font.PLAIN, 18));
		lblCodigoBarras.setBounds(480, 299, 261, 68);
		pnlEsquerdo.add(lblCodigoBarras);
		
		txtCodigoProduto = new JTextField();
		txtCodigoProduto.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				for(int linha = 0; linha < produtos.length; linha ++) {
					for(int coluna = 0; coluna < produtos[0].length; coluna++) {
						if(txtCodigoProduto.getText().equals(produtos[linha][0])) {
							txtBarras.setText(produtos[linha][3]);
							txtDescricao.setText(produtos[linha][1]);
							txtValorUnitario.setText(produtos[linha][2]);
							break;
							
						}
					}
				}
				
			
				
			}
		});
		txtCodigoProduto.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtCodigoProduto.setForeground(new Color(255, 255, 255));
		txtCodigoProduto.setBackground(new Color(0, 0, 64));
		txtCodigoProduto.setBounds(10, 353, 202, 37);
		pnlEsquerdo.add(txtCodigoProduto);
		txtCodigoProduto.setColumns(10);
		txtCodigoProduto.setBorder(null);
		
		txtBarras = new JTextField();
		txtBarras.setForeground(Color.WHITE);
		txtBarras.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtBarras.setColumns(10);
		txtBarras.setBackground(new Color(0, 0, 64));
		txtBarras.setBounds(480, 352, 202, 37);
		txtBarras.setBorder(null);
		pnlEsquerdo.add(txtBarras);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(5, 394, 788, 2);
		pnlEsquerdo.add(separator);
		
		JLabel lblDescricao = new JLabel("Descrição:");
		lblDescricao.setForeground(Color.WHITE);
		lblDescricao.setFont(new Font("Swis721 Hv BT", Font.PLAIN, 18));
		lblDescricao.setBounds(5, 379, 261, 68);
		pnlEsquerdo.add(lblDescricao);
		
		txtDescricao = new JTextField();
		txtDescricao.setForeground(Color.WHITE);
		txtDescricao.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtDescricao.setColumns(10);
		txtDescricao.setBackground(new Color(0, 0, 64));
		txtDescricao.setBounds(5, 431, 780, 54);
		txtDescricao.setBorder(null);
		pnlEsquerdo.add(txtDescricao);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(5, 497, 788, 2);
		pnlEsquerdo.add(separator_1);
		
		JLabel lblValorUnitario = new JLabel("Valor Unitário:");
		lblValorUnitario.setForeground(Color.WHITE);
		lblValorUnitario.setFont(new Font("Swis721 Hv BT", Font.PLAIN, 18));
		lblValorUnitario.setBounds(12, 491, 261, 68);
		pnlEsquerdo.add(lblValorUnitario);
		
		txtValorUnitario = new JTextField();
		txtValorUnitario.setForeground(Color.WHITE);
		txtValorUnitario.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtValorUnitario.setColumns(10);
		txtValorUnitario.setBackground(new Color(0, 0, 64));
		txtValorUnitario.setBounds(10, 538, 202, 37);
		txtValorUnitario.setBorder(null);
		pnlEsquerdo.add(txtValorUnitario);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setForeground(Color.WHITE);
		lblQuantidade.setFont(new Font("Swis721 Hv BT", Font.PLAIN, 18));
		lblQuantidade.setBounds(263, 491, 261, 68);
		pnlEsquerdo.add(lblQuantidade);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setForeground(Color.WHITE);
		txtQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtQuantidade.setColumns(10);
		txtQuantidade.setBackground(new Color(0, 0, 64));
		txtQuantidade.setBounds(263, 538, 202, 37);
		txtQuantidade.setBorder(null);
		pnlEsquerdo.add(txtQuantidade);
		
		JLabel lblTotal = new JLabel("Total Unitário:");
		lblTotal.setForeground(Color.WHITE);
		lblTotal.setFont(new Font("Swis721 Hv BT", Font.PLAIN, 18));
		lblTotal.setBounds(541, 491, 261, 68);
		pnlEsquerdo.add(lblTotal);
		
		txtTotalUnitario = new JTextField();
		txtTotalUnitario.setForeground(Color.WHITE);
		txtTotalUnitario.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtTotalUnitario.setColumns(10);
		txtTotalUnitario.setBackground(new Color(0, 0, 64));
		txtTotalUnitario.setBounds(534, 538, 202, 37);
		txtTotalUnitario.setBorder(null);
		pnlEsquerdo.add(txtTotalUnitario);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(5, 598, 788, 2);
		pnlEsquerdo.add(separator_1_1);
		
		txtSubtotal = new JTextField();
		txtSubtotal.setForeground(Color.WHITE);
		txtSubtotal.setFont(new Font("Swis721 Hv BT", Font.PLAIN, 20));
		txtSubtotal.setColumns(10);
		txtSubtotal.setBackground(new Color(0, 0, 64));
		txtSubtotal.setBounds(263, 628, 217, 61);
		txtSubtotal.setBorder(null);
		pnlEsquerdo.add(txtSubtotal);
		
		JLabel lblSubtotal = new JLabel("Subtotal:");
		lblSubtotal.setForeground(Color.WHITE);
		lblSubtotal.setFont(new Font("Swis721 Hv BT", Font.PLAIN, 24));
		lblSubtotal.setBounds(10, 586, 261, 68);
		pnlEsquerdo.add(lblSubtotal);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.setBounds(551, 636, 149, 52);
		pnlEsquerdo.add(btnIncluir);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(0, 0, 800, 302);
		lblLogo.setIcon(new ImageIcon(new ImageIcon(Café.class.getResource("/br/com/poo/images/logopadariaazul.jpg")).getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH)));
		pnlEsquerdo.add(lblLogo);
		
		JPanel pnlDireito = new JPanel();
		pnlDireito.setBackground(new Color(200, 196, 185));
		pnlDireito.setBounds(810, 0, 790, 700);
		contentPane.add(pnlDireito);
		
		JPanel pnlBase = new JPanel();
		pnlBase.setBackground(new Color(200, 196, 185));
		pnlBase.setBounds(5, 707, 1570, 150);
		contentPane.add(pnlBase);
	}
}
