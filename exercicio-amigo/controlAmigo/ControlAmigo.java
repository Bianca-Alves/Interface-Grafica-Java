package controlAmigo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlAmigo.ControlAmigo;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class ControlAmigo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControlAmigo frame = new ControlAmigo();
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
	public ControlAmigo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.decode("#EEBF50"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBackground(SystemColor.controlHighlight);
		btnCadastrar.setToolTipText("");
		btnCadastrar.setForeground(Color.BLACK);
		btnCadastrar.setFont(new Font("Arial", Font.BOLD, 12));
		btnCadastrar.setBounds(37, 216, 130, 30);
		contentPane.add(btnCadastrar);
		
		
		
		JLabel lblNome = new JLabel("");
		lblNome.setIcon(new ImageIcon(ControlAmigo.class.getResource("../img/photo.png")));
		lblNome.setBounds(153, 66, 128, 121);
		contentPane.add(lblNome);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setToolTipText("");
		btnListar.setForeground(Color.BLACK);
		btnListar.setFont(new Font("Arial", Font.BOLD, 12));
		btnListar.setBackground(SystemColor.controlHighlight);
		btnListar.setBounds(272, 216, 130, 30);
		contentPane.add(btnListar);
		
		JLabel lblC = new JLabel("Controle de Amigos");
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setFont(new Font("Arial", Font.BOLD, 25));
		lblC.setBounds(70, 11, 297, 35);
		contentPane.add(lblC);
	}
}
