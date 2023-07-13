package models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Capacitacion {
    private int id;
    private int rutCliente; // empresa
    private LocalDate dia;
    private LocalTime hora;
    private String lugar; // 10 a 50 caracteres obligatorios.
    private int duracion; // minutos
    private int cantAsistentes; // <1000 obligatorio

    public Capacitacion() {
    }

    public Capacitacion(int id, int rutCliente, LocalDate dia, LocalTime hora, String lugar, int duracion, int cantAsistentes) {
        this.id = id;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantAsistentes = cantAsistentes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCantAsistentes() {
        return cantAsistentes;
    }

    public void setCantAsistentes(int cantAsistentes) {
        this.cantAsistentes = cantAsistentes;
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "id=" + id +
                ", rutCliente=" + rutCliente +
                ", dia=" + dia +
                ", hora=" + hora +
                ", lugar='" + lugar + '\'' +
                ", duracion=" + duracion +
                ", cantAsistentes=" + cantAsistentes +
                '}';
    }

    public void mostrarDetalles() {
        /*
        * “La capacitación será en A a las B del día C, y durará D minutos”, en donde A es el lugar, B es la hora, C es el día y D son los minutos.
        * */
    }
}
