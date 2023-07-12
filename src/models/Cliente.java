package models;


public class Cliente extends Usuario{
    private String razonSocial;
    private int RUN;
    private long telefonoRepresentante;
    private String direccionEmpresa;
    private String comunaEmpresa;

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getRUN() {
        return RUN;
    }

    public void setRUN(int RUN) {
        this.RUN = RUN;
    }

    public long getTelefonoRepresentante() {
        return telefonoRepresentante;
    }

    public void setTelefonoRepresentante(long telefonoRepresentante) {
        this.telefonoRepresentante = telefonoRepresentante;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getComunaEmpresa() {
        return comunaEmpresa;
    }

    public void setComunaEmpresa(String comunaEmpresa) {
        this.comunaEmpresa = comunaEmpresa;
    }

    public String obtenerNombre() {
        StringBuilder sb = new StringBuilder();

        sb.append("Cliente.").append("\n")
                .append("Razon social: ").append(this.razonSocial).append("\n")
                .append("Rut: ").append(this.RUN).append("\n")
                .append("Direccion: ").append(this.direccionEmpresa);

        return sb.toString();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "razonSocial='" + razonSocial + '\'' +
                ", RUN=" + RUN +
                ", telefonoRepresentante=" + telefonoRepresentante +
                ", direccionEmpresa='" + direccionEmpresa + '\'' +
                ", comunaEmpresa='" + comunaEmpresa + '\'' +
                '}';
    }
}
