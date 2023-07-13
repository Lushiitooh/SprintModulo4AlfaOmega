package models;

import java.time.LocalDate;

public class Administrativo extends Usuario{

    private String area; // (minimo 5 max 20 caracteres) obligatorio
    private String experienciaPrevia; // (100 caracteres)

    public Administrativo() {
    }

    public Administrativo(String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento, int run, int tipoUsuario, String area, String experienciaPrevia) {
        super(nombre, apellido1, apellido2, fechaNacimiento, run, tipoUsuario);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }

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