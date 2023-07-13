package models;

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
}
