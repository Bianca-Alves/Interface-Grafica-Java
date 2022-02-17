package cadAmigo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;

public class CadAmigo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadAmigo frame = new CadAmigo();
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
	public CadAmigo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.decode("#EEBF50"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastrarAmigos = new JLabel("Cadastrar Amigos");
		lblCadastrarAmigos.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastrarAmigos.setFont(new Font("Arial", Font.BOLD, 20));
		lblCadastrarAmigos.setBounds(144, 25, 245, 45);
		contentPane.add(lblCadastrarAmigos);
		
		JLabel lblNewLabel = new JLabel("Nome: ");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(25, 91, 70, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblApelido = new JLabel("Apelido: ");
		lblApelido.setFont(new Font("Arial", Font.BOLD, 14));
		lblApelido.setBounds(25, 122, 70, 14);
		contentPane.add(lblApelido);
		
		JLabel lblTelefone = new JLabel("Telefone: ");
		lblTelefone.setFont(new Font("Arial", Font.BOLD, 14));
		lblTelefone.setBounds(25, 153, 70, 14);
		contentPane.add(lblTelefone);
		
		textField = new JTextField();
		textField.setBounds(144, 89, 360, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(144, 120, 360, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(144, 151, 360, 20);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.setBackground(SystemColor.controlHighlight);
		btnNewButton.setBounds(80, 210, 130, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_1.setBackground(SystemColor.controlHighlight);
		btnNewButton_1.setBounds(322, 210, 130, 25);
		contentPane.add(btnNewButton_1);
	}
}
