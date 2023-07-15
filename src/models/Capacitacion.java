package models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

/**
 *  Clase que representa las capacitaciones
 *
 * @author AlfaOmega
 * @version 1.0
 */

public class Capacitacion {
    private int id;
    private int rutCliente; // empresa
    private LocalDate dia;
    private LocalTime hora;
    private String lugar; // 10 a 50 caracteres obligatorios.
    private int duracion; // minutos
    private int cantAsistentes; // <1000 obligatorio


    public Capacitacion() {
        Random rd = new Random();
        this.cantAsistentes = rd.nextInt(1, 999);
    }

    /**
     * @param id El ID de la capacitación
     * @param rutCliente El RUT de la empresa
     * @param dia La fecha de la capacitación
     * @param hora La hora de la capacitación
     *  @param lugar El lugar de la capacitación
     *   @param duracion los minutos de la capacitación
     * @param cantAsistentes La cantidad de asistentes
     */
    public Capacitacion(int id, int rutCliente, LocalDate dia, LocalTime hora, String lugar, int duracion, int cantAsistentes) {
        this.id = id;
        this.rutCliente = rutCliente;
        this.dia = LocalDate.now();
        this.hora = LocalTime.now();
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

    public void setRutCliente(int rutCliente){  this.rutCliente = rutCliente; }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = LocalDate.parse(dia);
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = LocalTime.parse(hora);
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

    /**
     * Devuelve una representación en forma de cadena de la capacitación.
     *
     * @return Cadena que representa la capacitación.
     */
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

    /**
     * Muestra los detalles de la capacitación.
     */
    public void mostrarDetalles() {
        StringBuilder sb = new StringBuilder();

        sb.append("La capacitacion sera en: ").append(this.lugar).append("\n")
                .append("A las: ").append(this.hora).append(" horas").append("\n")
                .append("El dia: ").append(this.dia).append("\n")
                .append("Y durara. ").append(this.duracion).append(" minutos.");

        System.out.println(sb);

    }
}
