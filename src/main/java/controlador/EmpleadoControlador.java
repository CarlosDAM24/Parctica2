package controlador;

import model.Empleado;
import model.EmpleadoModelo;
import model.PanelDatos;
import view.JFramePrincipal;

import javax.swing.*;
import java.time.LocalDate;

public class EmpleadoControlador {

    private EmpleadoModelo modelo;
    private PanelDatos vista;

    private JFramePrincipal jframePrincipal;

    public EmpleadoControlador(EmpleadoModelo modelo, PanelDatos vista,JFramePrincipal jframePrincipal) {
        this.modelo = modelo;
        this.vista = vista;
        this.jframePrincipal = jframePrincipal;
        mostrarEmpleadoActual();  // Muestra el primer empleado al inicializar
    }

    public void mostrarEmpleadoActual() {
        Empleado empleadoActual = modelo.getEmpleadoActual();
        if (empleadoActual != null) {
            vista.actualizarDatos(empleadoActual);
        } else {
            vista.limpiarCampos();
        }

        // Habilitar/deshabilitar botones de acuerdo a la posición actual
        jframePrincipal.getBtnRetroceder().setEnabled(!modelo.esPrimerEmpleado());
        jframePrincipal.getBtnAvanzar().setEnabled(!modelo.esUltimoEmpleado());
    }

    public void mostrarSiguienteEmpleado() {
        modelo.siguienteEmpleado();
        mostrarEmpleadoActual();
    }

    public void mostrarAnteriorEmpleado() {
        modelo.anteriorEmpleado();
        mostrarEmpleadoActual();
    }

    public void mostrarPrimerEmpleado() {
        modelo.irPrimerEmpleado();
        mostrarEmpleadoActual();
    }

    public void mostrarUltimoEmpleado() {
        modelo.irUltimoEmpleado();
        mostrarEmpleadoActual();
    }

    public void limpiarCamposAlta() {
        jframePrincipal.getPanDatosAlta().limpiarCampos();
    }

    public void agregarNuevoEmpleado() {
        // Obtener los datos de los campos de texto del panel de alta
        String nombre = jframePrincipal.getPanDatosAlta().getTfNombre().getText();
        String departamento = jframePrincipal.getPanDatosAlta().getTfDepart().getText();
        LocalDate fechaNacimiento = LocalDate.parse(jframePrincipal.getPanDatosAlta().getTfFechaNac().getText());
        double salario = Double.parseDouble(jframePrincipal.getPanDatosAlta().getTfSalario().getText());
        double salarioMax = salario + 500; // Ejemplo, el salario máximo es $500 más que el salario

        // Crear el nuevo empleado
        Empleado nuevoEmpleado = new Empleado(nombre, departamento, fechaNacimiento, salario, salarioMax);

        // Agregar el nuevo empleado al modelo
        modelo.agregarEmpleado(nuevoEmpleado);

        // Limpiar los campos del formulario de alta
        limpiarCamposAlta();

        // Mostrar un mensaje de éxito
        JOptionPane.showMessageDialog(null, "Empleado agregado correctamente.");
        vista.actualizarDatos(nuevoEmpleado);
    }

}
