package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.PanelDatos;

public class JFramePrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	
	// CREACIÓN PANELES
	private JPanel panPrincipal, panVer, panDatosVer, panBotones, panAlta, panDatosAlta, panBotonesAlta, panAcerca ;
	
	//Creación JLabel	
	private JLabel lblAcerca;
	
	// Creación Botones
	private JButton btnPrimero, btnRetroceder, btnAvanzar, btnUltimo, btnCancelar, btnAceptar;
	
	// Creación menu y opciones
	private JMenuBar menuPaneles;
	private JMenuItem mntmVer, mntmAlta, mntmAcerca;
	
	
	
	

	public JFramePrincipal() {
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		setTitle("Practica 2- Carlos y Paula");
		setLocationRelativeTo(null);
		setResizable(false);
		panPrincipal = new JPanel();
		panPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panPrincipal);
		panPrincipal.setLayout(new BorderLayout(0, 0));
		
		addComponents();
		
		addListeners();
		
			
		
	}

	private void addListeners() {
		
		 // Acciones de menú
        mntmAlta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar "Alta Empleados" y ocultar "Ver Empleados"
                panPrincipal.remove(panVer);
                panPrincipal.remove(panAcerca);
                panPrincipal.add(panAlta, BorderLayout.CENTER);
                revalidate();
                repaint();
            }
        });

        mntmVer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar "Ver Empleados" y ocultar "Alta Empleados"
                panPrincipal.remove(panAlta);
                panPrincipal.remove(panAcerca);
                panPrincipal.add(panVer, BorderLayout.CENTER);
                revalidate();
                repaint();
            }
        });
        
        mntmAcerca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar el panel "Acerca de"
                panPrincipal.remove(panVer);
                panPrincipal.remove(panAlta);
                panPrincipal.add(panAcerca, BorderLayout.CENTER);
                revalidate();
                repaint();
            }
        });
		
	}

	private void addComponents() {
		
		
		menuPaneles = new JMenuBar();
		panPrincipal.add(menuPaneles, BorderLayout.NORTH);
		
		mntmVer = new JMenuItem("Ver Empleados");
		menuPaneles.add(mntmVer);
		
		mntmAlta = new JMenuItem("Alta Empleados");
		menuPaneles.add(mntmAlta);
		
		mntmAcerca = new JMenuItem("Acerca de");
		menuPaneles.add(mntmAcerca);
		
		// Paneles
		
		// Panel VER (Panel Datos + Panel Botones
		panVer = new JPanel();
		panVer.setLayout(new BorderLayout(0,0));
		
		
		
		
		panDatosVer = new PanelDatos(false);
		
		panVer.add(panDatosVer, BorderLayout.CENTER);
		
		
		
		panBotones = new JPanel();
		panVer.add(panBotones, BorderLayout.SOUTH);
		panBotones.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnPrimero = new JButton("PRIMERO");
		panBotones.add(btnPrimero);
		
		btnRetroceder = new JButton("RETROCEDER");
		panBotones.add(btnRetroceder);
		
		btnAvanzar = new JButton("AVANZAR");
		panBotones.add(btnAvanzar);
		
		btnUltimo = new JButton("ÚLTIMO");
		panBotones.add(btnUltimo);
		
		
		panPrincipal.add(panVer, BorderLayout.CENTER);
		
		panAlta = new JPanel();
		panAlta.setLayout(new BorderLayout(0, 0));
		
		panDatosAlta = new PanelDatos(true);
		
		panBotonesAlta = new JPanel();
		panBotonesAlta.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnCancelar = new JButton("CANCELAR");
		panBotonesAlta.add(btnCancelar);
		
		btnAceptar = new JButton("ACEPTAR");
		panBotonesAlta.add(btnAceptar);
		
		
		panAlta.add(panDatosAlta, BorderLayout.CENTER);

		panAlta.add(panBotonesAlta, BorderLayout.SOUTH);
		
		
		panAcerca = new JPanel(new FlowLayout(FlowLayout.CENTER));
	    lblAcerca = new JLabel("Proyecto realizado por Carlos Pastor y Paula Sánchez");
	    panAcerca.add(lblAcerca);  
	    
				
		
	}
	
	

}
