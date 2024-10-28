package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class EmpleadoModelo {
    private ArrayList<Empleado> listaEmpleados;
    private int indiceActual;
    public EmpleadoModelo(){
        listaEmpleados = new ArrayList<>();
        indiceActual = 0;
        Empleado empleado1 = new Empleado("Luis", "García", LocalDate.parse("2023-12-12"), 1000.10, 1500.00);
        Empleado empleado2 = new Empleado("Pepe", "Fernández", LocalDate.parse("2023-12-12"), 1011.10, 1600.00);
        Empleado empleado3 = new Empleado("Carlito", "Sánchez", LocalDate.parse("2023-12-12"), 1010.10, 1550.00);
        Empleado empleado4 = new Empleado("Romeo", "Martínez", LocalDate.parse("2023-12-12"), 1000.20, 1450.00);
        Empleado empleado5 = new Empleado("Ezequiel", "López", LocalDate.parse("2023-12-12"), 1000.30, 1580.00);
        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);
        listaEmpleados.add(empleado3);
        listaEmpleados.add(empleado4);
        listaEmpleados.add(empleado5);
    }

    public Empleado getEmpleadoActual() {
        return listaEmpleados.get(indiceActual);
    }

    public void siguienteEmpleado() {
        if (indiceActual < listaEmpleados.size()) {
            indiceActual++;
        }
    }

    public void anteriorEmpleado() {
        if (indiceActual > 0) {
            indiceActual--;
        }
    }

    public boolean esUltimoEmpleado() {
        return indiceActual == listaEmpleados.size();
    }

    public boolean esPrimerEmpleado() {
        return indiceActual == 0;
    }

    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
    }

}
