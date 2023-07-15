package models;

import service.IUsuario;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase contiene los metodos que nos permite que almacenemos los usuarios
 * @author AlfaOmega
 * @version 1.0
 */
public class Contenedor {
    private List<Usuario> listaUsuarios;
    private List<Capacitacion> listaCapacitaciones;

    public Contenedor() {
        this.listaCapacitaciones = new ArrayList<>();
        this.listaUsuarios = new ArrayList<>();
    }

    /**
     *
     * @param cliente
     * Metodo que permite guardar un objeto de tipo Cliente.
     */
    public void almacenarCliente(Cliente cliente) {
        this.listaUsuarios.add(cliente);
    }

    /**
     *
     * @param profesional
     * Metodo que permite guardar un objeto de tipo Profesional.
     */
    public void almacenarProfesional(Profesional profesional) {
        this.listaUsuarios.add(profesional);
    }

    /**
     *
     * @param administrativo
     * Metodo que permite guardar un objeto de tipo Administrativo.
     */
    public void almacenarAdministrativo(Administrativo administrativo) {
        this.listaUsuarios.add(administrativo);
    }

    /**
     * @param run
     * Permite obtener un Usuario por su rut y posteriormente eliminarlo.
     */
    public void eliminarUsuario(int run) {
        listaUsuarios.removeIf(usuario -> usuario.getRun() == run);
    }

    /**
     * Recorre una lista de usuarios mostrando algunos datos por pantalla.
     */
    public void listarUsuarios (){
        for (Usuario usuario : this.listaUsuarios){
            System.out.println("Nombre: " + usuario.getNombre());
            System.out.println("Apellido: " + usuario.getApellido1() + usuario.getApellido2());
            System.out.println("Fecha de nacimiento: " + usuario.getFechaNacimiento());
            System.out.println("Run: " + usuario.getRun());
            System.out.println("");
        }
    }

    /**
     *
     * @return List<Usuario>
     * Retorna una lista de usuarios almacenados.
     */
    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    /**
     * Recorre una lista de Usuarios.
     */
    public void listarUsuariosPorTipo (){
        for (IUsuario usuario : listaUsuarios){
            System.out.println("Nombre: " + usuario.getNombre());
            System.out.println("Apellido: " + usuario.getApellido1() + usuario.getApellido2());
            System.out.println("Fecha de nacimiento: " + usuario.getFechaNacimiento());
            System.out.println("Run: " + usuario.getRun());
            System.out.println("");
        }
    }

    /**
     * Muestra una lista de usuarios dependiendo del tipo.
     * @param tipoUsuario
     */
    public void listarUsuariosPorTipo(int tipoUsuario) {

        for (Usuario usuario : listaUsuarios) {

            if (usuario.getTipoUsuario() == tipoUsuario) {
                System.out.println("Nombre: " + usuario.getNombre());
                System.out.println("Apellido: " + usuario.getApellido1() + " " + usuario.getApellido2());
                System.out.println("Run: " + usuario.getRun());
                System.out.println("Tipo de Usuario: " + usuario.getTipoUsuario());
                if (usuario instanceof Cliente){
                    Cliente cliente = (Cliente) usuario;
                    System.out.println("Razon Social: " + cliente.getRazonSocial()) ;
                    System.out.println("Rut: " + cliente.getRUT()) ;
                    System.out.println("Teléfono Representante: " + cliente.getTelefonoRepresentante()) ;
                    System.out.println("Dirección Empresa: " + cliente.getDireccionEmpresa()) ;
                    System.out.println("Comuna Empresa: " + cliente.getComunaEmpresa()) ;
                } else if (usuario instanceof Profesional){
                    Profesional profesional = (Profesional) usuario;
                    System.out.println("Título: " + profesional.getTitulo()) ;
                    System.out.println("Fecha de Ingreso: " + profesional.getFechaIngreso()) ;
                } else if (usuario instanceof Administrativo){
                    Administrativo administrativo = (Administrativo) usuario;
                    System.out.println("Área: " + administrativo.getArea()) ;
                    System.out.println("Experiencia Previa: " + administrativo.getExperienciaPrevia()) ;
                }
                System.out.println("---------------------------------------------------------");
            }

        }
    }

    public void almacenarCapacitacion(Capacitacion capacitacion) {
        this.listaCapacitaciones.add(capacitacion);
    }

    /*
    public void listarCapacitaciones() {
        for (Capacitacion capacitacion : listaCapacitaciones);
        // System.out.println("ID:" + capacitacion.getId());
    }
    */
    public void listarCapacitaciones() {
        for (int i = 0; i < listaCapacitaciones.size(); i++) {
            System.out.println("El id de la capacitacion es: " + listaCapacitaciones.get(i).getId());
            System.out.println("");
        }
    }
}



    /*
    * Métodos

- Almacenar Cliente(): Agrega clientes a Lista Usuarios
- Almacenar Profesional(): Agrega profesionales a Lista Usuarios
- Almacenar Administrativos(): Agrega administrativos a Lista Usuarios
- Eliminar Usuario(): Elimina un usuario de Lista Usuarios según el run
- Listar Usuarios(): Muestra la Lista completa de Usuarios (sólo muestra los datos de usuario clase padre. No los datos de las clases hija)
- Listar Usuarios por tipo(): Muestra los usuarios por tipo, profesional, cliente o administrativo (muestra los datos de usuario clase padre y de las clases hijas)
- Almacenar Capacitacion(): agrega capacitaciones a Lista de Capacitaciones
- Listar Capacitaciones(): despliega las capacitaciones registradas y los datos del cliente al que pertenecen.
    * */

