package model;

import java.time.LocalDate;
import java.util.Objects;

public class Empleado {

    private static int contadorId = 1;
    private int numEmpleado;
    private String nombre;
    private String departamento;
    private LocalDate fechaNacimiento;
    private double salario;
    private double salarioMax;

    public Empleado( String nombre, String departamento, LocalDate fechaNacimiento, double salario, double salarioMax) {
        this.numEmpleado = contadorId++;
        this.nombre = nombre;
        this.departamento = departamento;
        this.fechaNacimiento = fechaNacimiento;
        this.salario = salario;
        this.salarioMax = salarioMax;
    }

    public Empleado() {
        this.numEmpleado = contadorId++;
    }

    public static int getContadorId() {
        return contadorId;
    }

    public static void setContadorId(int contadorId) {
        Empleado.contadorId = contadorId;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalarioMax() {
        return salarioMax;
    }

    public void setSalarioMax(double salarioMax) {
        this.salarioMax = salarioMax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return numEmpleado == empleado.numEmpleado && Double.compare(salario, empleado.salario) == 0 && Double.compare(salarioMax, empleado.salarioMax) == 0 && Objects.equals(nombre, empleado.nombre) && Objects.equals(departamento, empleado.departamento) && Objects.equals(fechaNacimiento, empleado.fechaNacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numEmpleado, nombre, departamento, fechaNacimiento, salario, salarioMax);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "numEmpleado=" + numEmpleado +
                ", nombre='" + nombre + '\'' +
                ", departamento='" + departamento + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", salario=" + salario +
                ", salarioMax=" + salarioMax +
                '}';
    }
}
