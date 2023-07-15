package models;

import service.IUsuario;

import java.time.LocalDate;
import java.time.Period;

/**
 * Esta clase define los objetos que necesito el usuario
 * @author AlfaOmega
 * @version 1.0
 */
public class Usuario implements IUsuario {
    private String nombre; // obligatorio
    private String apellido1; // obligatorio
    private String apellido2;
    private LocalDate fechaNacimiento;
    private int run;
    private int tipoUsuario; // (1 Cliente, 2 Profesional, 3 Administrativo)

    public Usuario() {
    }
    /**
     * Constructor para los datos del usuario
     * @param nombre El parámetro nombre define el nombre del usuario
     * @param apellido1 El parámetro apellido1 define el primer apellido del usuario
     * @param apellido2 El parámetro apellido2 define el segundo apellido del usuario
     * @param fechaNacimiento El parámetro fechaNacimiento define la fecha de nacimiento del usuario
     * @param run El parámetro run define el número de identificación del usuario
     * @param tipoUsuario el parámetro tipoUsuario define el tipo de usuario que es la persona en cuestión
     */
    public Usuario(String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento, int run, int tipoUsuario) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
        this.tipoUsuario = tipoUsuario;
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

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
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
        StringBuilder sb = new StringBuilder();

        sb.append("Nombre: ").append(this.nombre).append("\n")
                .append("Apellidos: ").append(this.apellido1).append(" ").append(this.apellido2).append("\n")
                .append("Rut: ").append(this.run).append("\n")
                .append("fecha de nacimiento: ").append(this.fechaNacimiento.getDayOfMonth()).append("/")
                .append(this.fechaNacimiento.getMonthValue()).append("/")
                .append(this.fechaNacimiento.getYear());

        System.out.println(sb);
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
