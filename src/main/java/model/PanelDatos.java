package model;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelDatos extends JPanel {
    private static final long serialVersionUID = 1L;
	private JTextField tfNombre, tfFechaNac, tfDepart, tfSalario;
    private JLabel lblNombre, lblFechaNac, lblDepart, lblSalario;
	

    public PanelDatos(boolean isEditable) {
        setLayout(new GridLayout(4, 2, 5, 5));
        lblNombre = new JLabel("Nombre:");
        lblFechaNac = new JLabel("Fecha de Nacimiento:");
        lblDepart = new JLabel("Departamento:");
        lblSalario = new JLabel("Salario");
        
        tfNombre = new JTextField(); 
        tfFechaNac = new JTextField();
        tfDepart = new JTextField();
        tfSalario = new JTextField();
        
    	lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
    	lblFechaNac.setHorizontalAlignment(SwingConstants.CENTER);
    	lblDepart.setHorizontalAlignment(SwingConstants.CENTER);
    	lblSalario.setHorizontalAlignment(SwingConstants.CENTER);


        // Configura la editabilidad según el parámetro
        tfNombre.setEditable(isEditable);
        tfFechaNac.setEditable(isEditable);
        tfDepart.setEditable(isEditable);
        tfSalario.setEditable(isEditable);        


        add(lblNombre);
        add((tfNombre));
        add(lblFechaNac);
        add((tfFechaNac));
        add(lblDepart);
        add((tfDepart));
        add(lblSalario);
        add((tfSalario));
        
        
        
        
    }

    public void actualizarDatos(Empleado empleado) {
        tfNombre.setText(empleado.getNombre());
        tfFechaNac.setText(empleado.getFechaNacimiento().toString());
        tfDepart.setText(empleado.getDepartamento());
        tfSalario.setText(String.valueOf(empleado.getSalario()));
    }
    public void limpiarCampos() {
        tfNombre.setText("");
        tfFechaNac.setText("");
        tfDepart.setText("");
        tfSalario.setText("");
    }

    public JTextField getTfNombre() {
        return tfNombre;
    }

    public JTextField getTfFechaNac() {
        return tfFechaNac;
    }

    public JTextField getTfDepart() {
        return tfDepart;
    }

    public JTextField getTfSalario() {
        return tfSalario;
    }

}