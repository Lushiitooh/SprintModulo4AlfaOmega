package models;

public class Revision {
    private int id;
    private int visitaTerrenoID; // - obligatorio (Asocia revisión a Visita a Terreno)
    private String tipoRevision; // (es el tipo de revisión que se hará en la visita a terreno) obligatorio
    private String detalle; // (min 10 max 200 caract.) obligatorio
    private int estado; // (1 Aprobado, 2 Con Observaciones, 3 No Aprueba)

    public Revision() {
    }

    public Revision(int id, int visitaTerrenoID, String tipoRevision, String detalle, int estado) {
        this.id = id;
        this.visitaTerrenoID = visitaTerrenoID;
        this.tipoRevision = tipoRevision;
        this.detalle = detalle;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVisitaTerrenoID() {
        return visitaTerrenoID;
    }

    public void setVisitaTerrenoID(int visitaTerrenoID) {
        this.visitaTerrenoID = visitaTerrenoID;
    }

    public String getTipoRevision() {
        return tipoRevision;
    }

    public void setTipoRevision(String tipoRevision) {
        this.tipoRevision = tipoRevision;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Revision{" +
                "id=" + id +
                ", visitaTerrenoID=" + visitaTerrenoID +
                ", tipoRevision='" + tipoRevision + '\'' +
                ", detalle='" + detalle + '\'' +
                ", estado=" + estado +
                '}';
    }
}
