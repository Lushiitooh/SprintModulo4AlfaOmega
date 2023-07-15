package models;

import java.time.LocalDate;

/**
 * Esta clase define al usuario como Profesional y extiende de la clase Usuario
 */
public class Profesional extends Usuario{
    private String titulo;
    private LocalDate fechaIngreso;

    public Profesional() {
    }
    /**
     *Constructor para los datos de Profesional
     * @param nombre El parámetro nombre define el nombre del profesional
     * @param apellido1 El parámetro apellido1 define el primer apellido del profesional
     * @param apellido2 El parámetro apellido2 define el segundo apellido del profesional
     * @param fechaNacimiento El parámetro fechaNacimiento define la fecha de nacimiento del profesional
     * @param run El parámetro run define el número de identificación del profesional
     * @param tipoUsuario el parámetro tipoUsuario define el tipo de usuario que es la persona, en este caso Profesional
     * @param titulo el parámetro titulo define con qué título cuenta el profesional
     * @param fechaIngreso el parámetro fechaIngreso define la fecha en la que ingresa el profesional
     */
    public Profesional(String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento, int run, int tipoUsuario, String titulo, LocalDate fechaIngreso) {
        super(nombre, apellido1, apellido2, fechaNacimiento, run, tipoUsuario);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    } //Cierre del contructor

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {

        this.fechaIngreso = LocalDate.parse(fechaIngreso);
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        StringBuilder sb = new StringBuilder();

        sb.append("Titulo: ").append(this.titulo).append("\n")
                .append("Fecha de ingreso: ").append(this.fechaIngreso.getDayOfMonth()).append("/")
                .append(this.fechaIngreso.getMonthValue()).append("/")
                .append(this.fechaIngreso.getYear());

        System.out.println(sb);
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                '}';
    }
}
