package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ViewProfissao extends JFrame {

	private JPanel contentPane;
	private JTextField tfId;
	private JTextField tfProf;
	private JTextField tfTitle;
	private JTextField tfDep;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewProfissao frame = new ViewProfissao();
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
	public ViewProfissao() {
		setTitle("Gerenciar Profissões");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 45, 110, 14);
		panel.add(lblNewLabel);
		
		JLabel lblIdTipoProfisso = new JLabel("ID tipo Profissão");
		lblIdTipoProfisso.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdTipoProfisso.setForeground(Color.WHITE);
		lblIdTipoProfisso.setBounds(10, 70, 110, 14);
		panel.add(lblIdTipoProfisso);
		
		JLabel lblTtulo = new JLabel("Título");
		lblTtulo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTtulo.setForeground(Color.WHITE);
		lblTtulo.setBounds(10, 95, 110, 14);
		panel.add(lblTtulo);
		
		JLabel lblIdDdeputado = new JLabel("ID Deputado");
		lblIdDdeputado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdDdeputado.setForeground(Color.WHITE);
		lblIdDdeputado.setBounds(10, 120, 110, 14);
		panel.add(lblIdDdeputado);
		
		tfId = new JTextField();
		tfId.setBounds(130, 42, 270, 20);
		panel.add(tfId);
		tfId.setColumns(10);
		
		tfProf = new JTextField();
		tfProf.setColumns(10);
		tfProf.setBounds(130, 67, 270, 20);
		panel.add(tfProf);
		
		tfTitle = new JTextField();
		tfTitle.setColumns(10);
		tfTitle.setBounds(130, 92, 270, 20);
		panel.add(tfTitle);
		
		tfDep = new JTextField();
		tfDep.setColumns(10);
		tfDep.setBounds(130, 117, 270, 20);
		panel.add(tfDep);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.setBounds(43, 169, 167, 23);
		panel.add(btnNewButton);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBounds(233, 169, 167, 23);
		panel.add(btnAtualizar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(43, 203, 167, 23);
		panel.add(btnBuscar);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(233, 203, 167, 23);
		panel.add(btnDelete);
	}

}
