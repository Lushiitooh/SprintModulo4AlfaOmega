package models;

import java.time.LocalDate;
import java.time.LocalTime;

public class VisitaTerreno {
    private int id; // obligatorio
    private int rutCliente; // obligatorio
    private LocalDate fechaVisita; // (DD/MM/AAAA)
    private LocalTime horaVisita; // (HH:MM:SS)
    private String lugar; // (min 5 max 50 caracteres) obligatorio
    private String comentarios; // max 200

    public VisitaTerreno() {
    }

    public VisitaTerreno(int id, int rutCliente, LocalDate fechaVisita, LocalTime horaVisita, String lugar, String comentarios) {
        this.id = id;
        this.rutCliente = rutCliente;
        this.fechaVisita = fechaVisita;
        this.horaVisita = horaVisita;
        this.lugar = lugar;
        this.comentarios = comentarios;
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

    public LocalDate getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(LocalDate fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public LocalTime getHoraVisita() {
        return horaVisita;
    }

    public void setHoraVisita(LocalTime horaVisita) {
        this.horaVisita = horaVisita;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "VisitaTerreno{" +
                "id=" + id +
                ", rutCliente=" + rutCliente +
                ", fechaVisita=" + fechaVisita +
                ", horaVisita=" + horaVisita +
                ", lugar='" + lugar + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
