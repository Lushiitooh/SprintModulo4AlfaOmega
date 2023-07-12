package models;


public class Cliente extends Usuario{
    private String razonSocial;
    private int RUT;
    private long telefonoRepresentante;
    private String direccionEmpresa;
    private String comunaEmpresa;

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getRUT() {
        return RUT;
    }

    public void setRUT(int RUT) {
        this.RUT = RUT;
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

        sb.append("Razon social: ").append(this.razonSocial).append("\n")
                .append("Rut: ").append(this.RUT).append("\n")
                .append("Direccion: ").append(this.direccionEmpresa);

        return sb.toString();
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        StringBuilder sb = new StringBuilder();

        sb.append("Direccion: ").append(this.direccionEmpresa).append("\n")
                .append("Comuna: ").append(this.comunaEmpresa);

        System.out.println(sb);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "razonSocial='" + razonSocial + '\'' +
                ", RUN=" + RUT +
                ", telefonoRepresentante=" + telefonoRepresentante +
                ", direccionEmpresa='" + direccionEmpresa + '\'' +
                ", comunaEmpresa='" + comunaEmpresa + '\'' +
                '}';
    }
}
