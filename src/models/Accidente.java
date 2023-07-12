package models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Accidente {
    private int id; // obligatorio
    private int rutCliente; // empresa
    private LocalDate fechaAccidente; // (DD/MM/AAAA) obligatorio
    private LocalTime horaAccidente; // (HH:MM) obligatorio
    private String lugar; // 10 a 50 caracteres obligatorios.
    private String causasAccidente; // min 20 obligatorio
    private String consecuenciasAccidente; // (min 20 y max 100 Caract) obligatorio

    public Accidente() {
    }

    public Accidente(int id, int rutCliente, LocalDate fechaAccidente, LocalTime horaAccidente, String lugar, String causasAccidente, String consecuenciasAccidente) {
        this.id = id;
        this.rutCliente = rutCliente;
        this.fechaAccidente = fechaAccidente;
        this.horaAccidente = horaAccidente;
        this.lugar = lugar;
        this.causasAccidente = causasAccidente;
        this.consecuenciasAccidente = consecuenciasAccidente;
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

    public LocalDate getFechaAccidente() {
        return fechaAccidente;
    }

    public void setFechaAccidente(String fechaAccidente) {
        this.fechaAccidente = LocalDate.parse(fechaAccidente);
    }

    public LocalTime getHoraAccidente() {
        return horaAccidente;
    }

    public void setHoraAccidente(String horaAccidente) {
        this.horaAccidente = LocalTime.parse(horaAccidente);
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getCausasAccidente() {
        return causasAccidente;
    }

    public void setCausasAccidente(String causasAccidente) {
        this.causasAccidente = causasAccidente;
    }

    public String getConsecuenciasAccidente() {
        return consecuenciasAccidente;
    }

    public void setConsecuenciasAccidente(String consecuenciasAccidente) {
        this.consecuenciasAccidente = consecuenciasAccidente;
    }

    @Override
    public String toString() {
        return "Accidente{" +
                "id=" + id +
                ", rutCliente=" + rutCliente +
                ", fechaAccidente=" + fechaAccidente +
                ", horaAccidente=" + horaAccidente +
                ", lugar='" + lugar + '\'' +
                ", causasAccidente='" + causasAccidente + '\'' +
                ", consecuenciasAccidente='" + consecuenciasAccidente + '\'' +
                '}';
    }
}
