package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class ViewSites extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfId;
	private JTextField tfDep;
	private JTextField tfUrl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewSites frame = new ViewSites();
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
	public ViewSites() {
		setTitle("Gerenciar Sites");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 253);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 434, 214);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(10, 32, 111, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID Deputado");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(10, 57, 111, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("URL");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setBounds(10, 82, 111, 14);
		panel.add(lblNewLabel_1_1);
		
		tfId = new JTextField();
		tfId.setBounds(131, 29, 253, 20);
		panel.add(tfId);
		tfId.setColumns(10);
		
		tfDep = new JTextField();
		tfDep.setColumns(10);
		tfDep.setBounds(131, 54, 253, 20);
		panel.add(tfDep);
		
		tfUrl = new JTextField();
		tfUrl.setColumns(10);
		tfUrl.setBounds(131, 79, 253, 20);
		panel.add(tfUrl);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.setBounds(53, 133, 167, 23);
		panel.add(btnNewButton);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBounds(230, 133, 154, 23);
		panel.add(btnAtualizar);
		
		JButton btnNewButton_1_1 = new JButton("Deletar");
		btnNewButton_1_1.setBounds(230, 167, 154, 23);
		panel.add(btnNewButton_1_1);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(53, 167, 167, 23);
		panel.add(btnBuscar);
	}
}