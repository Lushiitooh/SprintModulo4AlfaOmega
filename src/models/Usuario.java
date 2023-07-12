package models;

import service.IUsuario;

import java.time.LocalDate;
import java.time.Period;

public class Usuario implements IUsuario {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private LocalDate fechaNacimiento;
    private int run;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento, int run) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento);
    }

    public int getEdad() {
        LocalDate fechaActual = LocalDate.now();
        Period edad = Period.between(this.fechaNacimiento, fechaActual);
        int aniosEdad = edad.getYears();

        return aniosEdad;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public void mostrarEdad() {
        System.out.println("Mi edad es: " + getEdad());
    }

    @Override
    public void analizarUsuario() {

    }
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", run=" + run +
                '}';
    }
}
