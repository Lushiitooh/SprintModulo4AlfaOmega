package models;


import java.time.LocalDate;

/**
 *  Clase que representa a un cliente
 *
 * @author AlfaOmega
 * @version 1.0
 */



public class Cliente extends Usuario{
    private String razonSocial;
    private int RUT;
    private long telefonoRepresentante;
    private String direccionEmpresa;
    private String comunaEmpresa;


    public Cliente() {
    }
    /**
     * @param razonSocial el nombre de la empresa
     * @param RUT el registro tributario de la empresa
     * @param telefonoRepresentante el telefono del cliente
     * @param direccionEmpresa La direccion del cliente
     * @param comunaEmpresa La comuna de la direccion
     */

    // Constructor
    public Cliente(String razonSocial, int RUT, long telefonoRepresentante, String direccionEmpresa, String comunaEmpresa) {
        this.razonSocial = razonSocial;
        this.RUT = RUT;
        this.telefonoRepresentante = telefonoRepresentante;
        this.direccionEmpresa = direccionEmpresa;
        this.comunaEmpresa = comunaEmpresa;
    }

    public Cliente(String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento, int run, int tipoUsuario, String razonSocial, int RUT, long telefonoRepresentante, String direccionEmpresa, String comunaEmpresa) {
        super(nombre, apellido1, apellido2, fechaNacimiento, run, tipoUsuario);
        this.razonSocial = razonSocial;
        this.RUT = RUT;
        this.telefonoRepresentante = telefonoRepresentante;
        this.direccionEmpresa = direccionEmpresa;
        this.comunaEmpresa = comunaEmpresa;
    }

    /**
     * Obtiene el nombre de la empresa.
     *
     * @return El nombre de la empresa.
     */
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

    /**
     * Obtiene el nombre del cliente en un formato legible.
     * El nombre incluye la razón social, el RUT y la dirección de la empresa.
     *
     * @return el nombre del cliente en formato legible
     */
    public String obtenerNombre() {
        StringBuilder sb = new StringBuilder();

        sb.append("Razon social: ").append(this.razonSocial).append("\n")
                .append("Rut: ").append(this.RUT).append("\n")
                .append("Direccion: ").append(this.direccionEmpresa);

        return sb.toString();
    }

    /**
     * Realiza un análisis detallado del usuario, mostrando su dirección y comuna.
     * La información básica del usuario se obtiene de la clase padre.
     */
    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        StringBuilder sb = new StringBuilder();

        sb.append("Direccion: ").append(this.direccionEmpresa).append("\n")
                .append("Comuna: ").append(this.comunaEmpresa);

        System.out.println(sb);
    }

    /**
     * Devuelve una representación en formato de cadena de texto del objeto Cliente.
     *
     * @return La representación en formato de cadena de texto del objeto Cliente.
     */
    @Override
    public String toString() {
        return  "nombre: " + this.getNombre() + "\n" +
                "apellido1: " + this.getApellido1() + "\n" +
                "apellido2: " + this.getApellido2() + "\n" +
                "fechaNacimiento: " + this.getFechaNacimiento() + "\n" +
                "run: " + this.getRun() + "\n" +
                "razonSocial: " + razonSocial + "\n" +
                "RUT: " + RUT + "\n" +
                "telefonoRepresentante: " + telefonoRepresentante + "\n" +
                "direccionEmpresa: " + direccionEmpresa + "\n" +
                "comunaEmpresa: " + comunaEmpresa + "\n";
    }
}
