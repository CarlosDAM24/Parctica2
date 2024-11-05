package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class JFramePrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNombre;
	private JTextField tfFechaNac;
	private JTextField tfDepart;
	private JTextField tfSalario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFramePrincipal frame = new JFramePrincipal();
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
	public JFramePrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		setTitle("Practica 2- Carlos y Paula");
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JMenuBar menuPaneles = new JMenuBar();
		contentPane.add(menuPaneles, BorderLayout.NORTH);
		
		JMenuItem mntmVer = new JMenuItem("Ver Empleados");
		menuPaneles.add(mntmVer);
		
		JMenuItem mntmAlta = new JMenuItem("Alta Empleados");
		menuPaneles.add(mntmAlta);
		
		JMenuItem mntmAcerca = new JMenuItem("Acerca de");
		menuPaneles.add(mntmAcerca);
		
		JPanel panBotones = new JPanel();
		contentPane.add(panBotones, BorderLayout.SOUTH);
		panBotones.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnPrimero = new JButton("PRIMERO");
		panBotones.add(btnPrimero);
		
		JButton btnRetroceder = new JButton("RETROCEDER");
		panBotones.add(btnRetroceder);
		
		JButton btnAvanzar = new JButton("AVANZAR");
		panBotones.add(btnAvanzar);
		
		JButton btnUltimo = new JButton("ÚLTIMO");
		panBotones.add(btnUltimo);
		
		JPanel panDatos = new JPanel();
		contentPane.add(panDatos, BorderLayout.CENTER);
		panDatos.setLayout(new GridLayout(4, 2, 0, 0));
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		panDatos.add(lblNombre);
		
		tfNombre = new JTextField();
		panDatos.add(tfNombre);
		tfNombre.setColumns(10);
		
		JLabel lblFechaNac = new JLabel("Fecha de Nacimiento");
		lblFechaNac.setHorizontalAlignment(SwingConstants.CENTER);
		panDatos.add(lblFechaNac);
		
		tfFechaNac = new JTextField();
		panDatos.add(tfFechaNac);
		tfFechaNac.setColumns(10);
		
		JLabel lblDepart = new JLabel("Departamento");
		lblDepart.setHorizontalAlignment(SwingConstants.CENTER);
		panDatos.add(lblDepart);
		
		tfDepart = new JTextField();
		panDatos.add(tfDepart);
		tfDepart.setColumns(10);
		
		JLabel lblSalario = new JLabel("Salario");
		lblSalario.setHorizontalAlignment(SwingConstants.CENTER);
		panDatos.add(lblSalario);
		
		tfSalario = new JTextField();
		panDatos.add(tfSalario);
		tfSalario.setColumns(10);
	}
	
	

}
