package models;

import java.time.LocalDate;

public class Profesional extends Usuario{
    private String titulo;
    private LocalDate fechaIngreso;

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
                .append("Fecha de ingreso: ").append(this.fechaIngreso.getMonthValue()).append("/")
                .append(this.fechaIngreso.getDayOfMonth()).append("/")
                .append(this.fechaIngreso.getYear());

        System.out.println(sb);
    }
}