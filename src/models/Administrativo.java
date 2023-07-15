package models;

import java.time.LocalDate;

/**
 * @author AlfaOmega
 * @version 1.0
 * Esta clase representa una persona de tipo Administrativo
 */

public class Administrativo extends Usuario{

    private String area; // (minimo 5 max 20 caracteres) obligatorio
    private String experienciaPrevia; // (100 caracteres)

    public Administrativo() {
    }

    /**
     *
     * @param nombre Nombre correspondiente a clase usuario
     * @param apellido1 Apellido Paterno correspondiente a clase usuario
     * @param apellido2 Apellido Materno correspondiente a clase usuario
     * @param fechaNacimiento Fecha de nacimiento correspondiente a clase usuario
     * @param run RUN correspondiente a clase Usuario
     * @param tipoUsuario correspondiente a el tipo de usuario (1. cliente 2. profesional 3. administrativo
     * @param area correspondiente al area de la clase hija Administrativo
     * @param experienciaPrevia correspondiente a la experiencia previa de clase hija Administrativo
     */
    public Administrativo(String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento, int run, int tipoUsuario, String area, String experienciaPrevia) {
        super(nombre, apellido1, apellido2, fechaNacimiento, run, tipoUsuario);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    /**
     * Método para obtener el area del Administrativo
     * @return devuelve un string con el area de administrativo
     */
    public String getArea() {
        return area;
    }

    /**
     * Método para establecer el area del Administrativo
     * @param area String con el area del Administrativo
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * Método para obtener el la experiencia previa del Administrativo
     * @return devuelve un string con la experiencia previa del administrativo
     */
    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }

    /**
     * Método para establecer la experiencia previa del Administrativo
     * @param experienciaPrevia String con la experiencia previa del Administrativo
     */
    public void setExperienciaPrevia(String experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        StringBuilder sb = new StringBuilder();

        sb.append("Area: ").append(this.area).append("\n")
                .append("Experiencia previa: ").append(this.experienciaPrevia);

        System.out.println(sb);
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "area='" + area + '\'' +
                ", experienciaPrevia='" + experienciaPrevia + '\'' +
                '}';
    }
}