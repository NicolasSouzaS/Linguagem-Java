package br.com.ProjetoEscola.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.MaskFormatter;

import br.com.ProjetoEscola.dao.CRUDCurso;
import br.com.ProjetoEscola.domain.Curso;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GerenciarCurso extends JFrame {
	
	MaskFormatter di;
	MaskFormatter dt;
	MaskFormatter hi;
	MaskFormatter ht;
	
	CRUDCurso cc = new CRUDCurso();
	
	private JPanel contentPane;
	private JTextField lblTitulo;
	private JTextField txtTituloCurso;
	private JTextField lblDescricao;
	private JTextField txtDescricao;
	private JTextField lblDataI;
	private JTextField lblDataT;
	private JTextField txtHorrioInicio;
	private JTextField lblHorarioTermino;
	private JFormattedTextField txtHorarioInicio;
	private JFormattedTextField txtHorarioTermino;
	JFormattedTextField txtDataI;
	JFormattedTextField txtDataT;
	private Long id = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GerenciarCurso frame = new GerenciarCurso();
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
	public GerenciarCurso() {
		
		try {
		
		
		setTitle("Gerenciar Cursos");
		setType(Type.POPUP);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1058, 649);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 85, 148));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		carregarTabela();
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(GerenciarCurso.class.getResource("/br/com/ProjetoEscola/imagens/Senac2.PNG")));
		lblNewLabel.setBounds(24, 11, 1008, 265);
		contentPane.add(lblNewLabel);
		
		lblTitulo = new JTextField();
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setBackground(new Color(0, 85, 148));
		lblTitulo.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 30));
		lblTitulo.setText("Titulo do Curso");
		lblTitulo.setBounds(30, 287, 216, 33);
		contentPane.add(lblTitulo);
		lblTitulo.setColumns(10);
		lblTitulo.setBorder(null);
		
		txtTituloCurso = new JTextField();
		txtTituloCurso.setFont(new Font("Verdana", Font.PLAIN, 23));
		txtTituloCurso.setBounds(10, 322, 259, 39);
		contentPane.add(txtTituloCurso);
		txtTituloCurso.setColumns(10);
		
		lblDescricao = new JTextField();
		lblDescricao.setText("Descrição");
		lblDescricao.setForeground(Color.WHITE);
		lblDescricao.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 30));
		lblDescricao.setColumns(10);
		lblDescricao.setBorder(null);
		lblDescricao.setBackground(new Color(0, 85, 148));
		lblDescricao.setBounds(337, 287, 216, 33);
		contentPane.add(lblDescricao);
		
		txtDescricao = new JTextField();
		txtDescricao.setFont(new Font("Verdana", Font.PLAIN, 23));
		txtDescricao.setBounds(279, 322, 263, 76);
		contentPane.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		lblDataI = new JTextField();
		lblDataI.setText("Data de Inicio");
		lblDataI.setForeground(Color.WHITE);
		lblDataI.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 30));
		lblDataI.setColumns(10);
		lblDataI.setBorder(null);
		lblDataI.setBackground(new Color(0, 85, 148));
		lblDataI.setBounds(572, 287, 216, 33);
		contentPane.add(lblDataI);
		
		di = new MaskFormatter("####-##-##");
		di.setPlaceholderCharacter('_');
		
		txtDataI = new JFormattedTextField(di);
		txtDataI.setFont(new Font("Verdana", Font.PLAIN, 23));
		txtDataI.setBounds(548, 322, 248, 39);
		contentPane.add(txtDataI);
		
		lblDataT = new JTextField();
		lblDataT.setText("Data de Termino");
		lblDataT.setForeground(Color.WHITE);
		lblDataT.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 30));
		lblDataT.setColumns(10);
		lblDataT.setBorder(null);
		lblDataT.setBackground(new Color(0, 85, 148));
		lblDataT.setBounds(806, 287, 226, 33);
		contentPane.add(lblDataT);
		
		dt = new MaskFormatter("####-##-##");
		dt.setPlaceholderCharacter('_');
		
		txtDataT = new JFormattedTextField(dt);
		txtDataT.setFont(new Font("Verdana", Font.PLAIN, 23));
		txtDataT.setBounds(806, 322, 226, 39);
		contentPane.add(txtDataT);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		
		btnCadastrar.setBackground(new Color(247, 140, 32));
		btnCadastrar.setForeground(new Color(255, 255, 255));
		btnCadastrar.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnCadastrar.setBounds(24, 449, 169, 33);
		contentPane.add(btnCadastrar);
		
		JButton btnAtualizarCurso = new JButton("Atualizar Curso");
		btnAtualizarCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Curso cadCurso = new Curso();
				if(txtTituloCurso.getText().trim().equals("")
					||txtDescricao.getText().trim().equals("")
					||txtDataI.getText().trim().equals("")
					||txtDataT.getText().trim().equals("")
					||txtHorarioInicio.getText().trim().equals("")
					||txtHorarioTermino.getText().trim().equals("")
					
						) {;
				JOptionPane.showMessageDialog(null, "Precisamos de dados nas linhas para ser atualizados.","Erro",JOptionPane.ERROR_MESSAGE);
				}
				else {
					cadCurso.setTitulo(txtTituloCurso.getText());
					cadCurso.setDescricao(txtDescricao.getText());
					cadCurso.setDatainicio(Date.valueOf(txtDataI.getText()));
					cadCurso.setDatatermino(Date.valueOf(txtDataT.getText()));
					cadCurso.setHorarioinicio(txtHorarioInicio.getText());
					cadCurso.setHorariotermino(txtHorarioTermino.getText());
					cadCurso.setIdCurso(id);
					
					JOptionPane.showMessageDialog(null, cc.atualizar(cadCurso).getTitulo()+ " Foi Atualizado");
					
					carregarTabela();
					
					limparCampos();
				
				
				
				
				
				
				
				
				
				
				
				
				
				}
				
				
				
			}
		});
		btnAtualizarCurso.setForeground(new Color(255, 255, 255));
		btnAtualizarCurso.setBackground(new Color(247, 140, 32));
		btnAtualizarCurso.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnAtualizarCurso.setBounds(294, 449, 169, 33);
		contentPane.add(btnAtualizarCurso);
		
		JButton btnDeletarCurso = new JButton("Deletar Curso");
		btnDeletarCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(id.equals(null)) {
					JOptionPane.showMessageDialog(null, "Selecione um curso para apagar.");
				}
				else {
					
					if(JOptionPane.showConfirmDialog(null, "Você realmente desejá apagar o curso indicado ?","Atenção",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==0) {
						
					
						Curso cr = new Curso();
						cr.setIdCurso(id);
						JOptionPane.showMessageDialog(null, cc.apagar(cr));
						carregarTabela();
						limparCampos();
					}
				}
				
			}
		});
		btnDeletarCurso.setForeground(Color.WHITE);
		btnDeletarCurso.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnDeletarCurso.setBackground(new Color(247, 140, 32));
		btnDeletarCurso.setBounds(572, 449, 169, 33);
		contentPane.add(btnDeletarCurso);
		
		JButton btnAtualizarCurso_1_1 = new JButton("Consultar");
		btnAtualizarCurso_1_1.setForeground(Color.WHITE);
		btnAtualizarCurso_1_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnAtualizarCurso_1_1.setBackground(new Color(247, 140, 32));
		btnAtualizarCurso_1_1.setBounds(840, 449, 169, 33);
		contentPane.add(btnAtualizarCurso_1_1);
		
		txtHorrioInicio = new JTextField();
		txtHorrioInicio.setText("Horário Inicio");
		txtHorrioInicio.setForeground(Color.WHITE);
		txtHorrioInicio.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 20));
		txtHorrioInicio.setColumns(10);
		txtHorrioInicio.setBorder(null);
		txtHorrioInicio.setBackground(new Color(0, 85, 148));
		txtHorrioInicio.setBounds(30, 372, 169, 33);
		contentPane.add(txtHorrioInicio);
		
		lblHorarioTermino = new JTextField();
		lblHorarioTermino.setText("Horario Termino");
		lblHorarioTermino.setForeground(Color.WHITE);
		lblHorarioTermino.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 20));
		lblHorarioTermino.setColumns(10);
		lblHorarioTermino.setBorder(null);
		lblHorarioTermino.setBackground(new Color(0, 85, 148));
		lblHorarioTermino.setBounds(840, 372, 222, 33);
		contentPane.add(lblHorarioTermino);
		
		hi = new MaskFormatter("##:##h");
		hi.setPlaceholderCharacter('_');
		
		txtHorarioInicio = new JFormattedTextField(hi);
		txtHorarioInicio.setFont(new Font("Verdana", Font.PLAIN, 19));
		txtHorarioInicio.setBounds(10, 404, 157, 20);
		contentPane.add(txtHorarioInicio);
		
		ht = new MaskFormatter("##:##h");
		ht.setPlaceholderCharacter('_');
		
		txtHorarioTermino = new JFormattedTextField(ht);
		txtHorarioTermino.setFont(new Font("Verdana", Font.PLAIN, 19));
		txtHorarioTermino.setBounds(833, 404, 157, 20);
		contentPane.add(txtHorarioTermino);
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Curso cadCurso = new Curso();
				if(txtTituloCurso.getText().trim().equals("")
					||txtDescricao.getText().trim().equals("")
					||txtDataI.getText().trim().equals("")
					||txtDataT.getText().trim().equals("")
					||txtHorarioInicio.getText().trim().equals("")
					||txtHorarioTermino.getText().trim().equals("")
					
						) {;
				JOptionPane.showMessageDialog(null, "Precisamos de dados nas linhas para ser cadastrado o curso.","Erro",JOptionPane.ERROR_MESSAGE);
				}
				else {
					cadCurso.setTitulo(txtTituloCurso.getText());
					cadCurso.setDescricao(txtDescricao.getText());
					cadCurso.setDatainicio(Date.valueOf(txtDataI.getText()));
					cadCurso.setDatatermino(Date.valueOf(txtDataT.getText()));
					cadCurso.setHorarioinicio(txtHorarioInicio.getText());
					cadCurso.setHorariotermino(txtHorarioTermino.getText());
					
					JOptionPane.showMessageDialog(null, cc.gravar(cadCurso));
					carregarTabela();
					
					limparCampos();
					
					
			}
			
			}
		
		
		});
	
		
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	private void carregarTabela() {
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 490, 1022, 109);
		contentPane.add(scrollPane);
		
		String[] cabecalho = {
				"Id Curso",
				"Titulo do Curso",
				"Descrição do Curso",
				"Data de inicio",
				"Data de término",
				"Horário de inicio",
				"Horário de término"
		};
		
		
		Object[][] dados = new Object[cc.listar().size()][7];
		
		for(int i = 0; i < dados.length; i++) {
			dados[i][0] = cc.listar().get(i).getIdCurso();
			dados[i][1] = cc.listar().get(i).getTitulo();
			dados[i][2] = cc.listar().get(i).getDescricao();
			dados[i][3] = cc.listar().get(i).getDatainicio();
			dados[i][4] = cc.listar().get(i).getDatatermino();
			dados[i][5] = cc.listar().get(i).getHorarioinicio();
			dados[i][6] = cc.listar().get(i).getHorariotermino();
			}
		
		TableModel model = new DefaultTableModel(dados, cabecalho);
		
		JTable table = new JTable(model);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
						
						txtTituloCurso.setText(String.valueOf(table.getValueAt(table.getSelectedRow(),1)));
						txtDescricao.setText(String.valueOf(table.getValueAt(table.getSelectedRow(),2)));
						txtDataI.setText(String.valueOf(table.getValueAt(table.getSelectedRow(),3)));
						txtDataT.setText(String.valueOf(table.getValueAt(table.getSelectedRow(),4)));
						txtHorarioInicio.setText(String.valueOf(table.getValueAt(table.getSelectedRow(),5)));
						txtHorarioTermino.setText(String.valueOf(table.getValueAt(table.getSelectedRow(),6)));
						
						id =Long.parseLong(String.valueOf(table.getValueAt(table.getSelectedRow(),0)));
						
						
						
				
				
				
			}
		});
		scrollPane.setViewportView(table);
		
		
			
		
	}
	
	private void limparCampos() {
		
		txtTituloCurso.setText("");
		txtDescricao.setText("");
		txtDataI.setText("");
		txtDataT.setText("");
		txtHorarioInicio.setText("");
		txtHorarioTermino.setText("");
	}
	
	
}
