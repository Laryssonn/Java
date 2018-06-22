package br.com.datainfo.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 562);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 524, 523);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnAddUsuario = new JButton("Adicionar Usu\u00E1rio");
		btnAddUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAddUsuario.setBounds(0, 0, 120, 23);
		panel.add(btnAddUsuario);
		
		JButton btaAlterarUsuario = new JButton("Alterar Usu\u00E1rio");
		btaAlterarUsuario.setBounds(0, 35, 120, 23);
		panel.add(btaAlterarUsuario);
		
		JButton btnExcluirUsuario = new JButton("Excluir Usu\u00E1rio");
		btnExcluirUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExcluirUsuario.setBounds(0, 69, 120, 23);
		panel.add(btnExcluirUsuario);
		
		table = new JTable();
		table.setBounds(0, 135, 524, 388);
		panel.add(table);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(146, 2, 31, 19);
		panel.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(183, 1, 341, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(128, 39, 49, 14);
		panel.add(lblEndereo);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(146, 73, 31, 14);
		panel.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(139, 105, 38, 14);
		panel.add(lblSenha);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(183, 39, 341, 22);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(183, 72, 341, 22);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(183, 101, 341, 22);
		panel.add(textField_4);
	}
	
	
	
	
}
