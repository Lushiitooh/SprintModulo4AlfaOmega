package models;

import service.IUsuario;

import java.util.ArrayList;
import java.util.List;

public class Contenedor {
    private List<Usuario> listaUsuarios;
    private List<Capacitacion> listaCapacitaciones;


    public void almacenarCliente(Cliente cliente) {
        listaUsuarios.add(cliente);
    }
    public void almacenarProfesional(Profesional profesional) {
        listaUsuarios.add(profesional);
    }
    public void almacenarAdministrativo(Administrativo administrativo) {
        listaUsuarios.add(administrativo);
    }

    public void eliminarUsuario(int run) {
        listaUsuarios.removeIf(usuario -> usuario.getRun() == run);
    }

    public void listarUsuarios (){
        for (IUsuario usuario : listaUsuarios){
            System.out.println("Nombre: " + usuario.getNombre());
            System.out.println("Apellido: " + usuario.getApellido1() + usuario.getApellido2());
            System.out.println("Fecha de nacimiento: " + usuario.getFechaNacimiento());
            System.out.println("Run: " + usuario.getRun());
        }
    }

    public void listarUsuariosPorTipo (){
        for (IUsuario usuario : listaUsuarios){
            System.out.println("Nombre: " + usuario.getNombre());
            System.out.println("Apellido: " + usuario.getApellido1() + usuario.getApellido2());
            System.out.println("Fecha de nacimiento: " + usuario.getFechaNacimiento());
            System.out.println("Run: " + usuario.getRun());
        }
    }

    public void listarUsuariosPorTipo(int tipoUsuario) {


        for (IUsuario usuario : listaUsuarios) {

            if (usuario.getTipoUsuario() == tipoUsuario) {
                System.out.println("Nombre: " + usuario.getNombre());
                System.out.println("Apellido: " + usuario.getApellido1() + usuario.getApellido2());
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
        listaCapacitaciones.add(capacitacion);
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

