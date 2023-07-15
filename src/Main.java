import models.*;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 * Despliega un menú de mantenedor y genera una instancia del contenedor.
 *
 * <p>
 *     El menú muestra 9 opciones, solicita al usuario ingresar una de ellas y, si no es válida, se pide ingresar nuevamente una opción.
 *     El programa se ejecuta hasta que la opción seleccionada es 9.
 * </p>
 *
 * @author AlfaOmega
 * @version 1.0
 * @see Contenedor
 */
public class Main {
    /**
     * Crea una instancia de Cliente y la agrega a la lista de usuarios del contenedor
     *
     * <p>
     *     Solicita ingresar atributos y crea una instancia de Cliente con los atributos ingresados.
     *     Posteriormente, agrega la instancia creada a la lista de usuarios del contenedor.
     * </p>
     * @param contenedor instancia de Contenedor creada por la clase Main.
     * @return contenedor ingresado como parámetro, actualizado con el nuevo Cliente.
     */
    private static Contenedor crearCliente(Contenedor contenedor) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();

        System.out.println("Ingrese nombre: ");
        String nombre = sc.next();

        System.out.println("Ingrese apellido: ");
        String apellido = sc.next();

        String fechaNac = "";
        boolean fechaValida = false;

        while (!fechaValida) {
            System.out.println("Ingrese su fecha de nacimiento (año-mes-dia): ");
            fechaNac = sc.next();

            try {
                LocalDate.parse(fechaNac);
                fechaValida = true;
            } catch (DateTimeParseException e) {
                System.out.println("Fecha inválida. Intente nuevamente.");
            }
        }

        System.out.println("Ingrese su numero de run: ");
        int run = sc.nextInt();


        System.out.println("Razon social: ");
        String razonSocial = sc.next();
        System.out.println("Ingrese su rut: ");
        int rut = sc.nextInt();
        System.out.println("Ingrese numero de telefono");
        long telefono = sc.nextLong();
        System.out.println("Ingrese direccion empresa: ");
        String direccionEmpresa = sc.next();
        System.out.println("Ingrese comuna: ");
        String comuna = sc.next();

        cliente.setNombre(nombre);
        cliente.setApellido1(apellido);
        cliente.setFechaNacimiento(fechaNac);
        cliente.setRun(run);
        cliente.setTipoUsuario(1);
        cliente.setRazonSocial(razonSocial);
        cliente.setRUT(rut);
        cliente.setTelefonoRepresentante(telefono);
        cliente.setDireccionEmpresa(direccionEmpresa);
        cliente.setComunaEmpresa(comuna);
        contenedor.almacenarCliente(cliente);

        return contenedor;
    }

    /**
     * Crea una instancia de Profesional y la agrega a la lista de usuarios del contenedor
     *
     * <p>
     *     Solicita ingresar atributos y crea una instancia de Profesional con los atributos ingresados.
     *     Posteriormente, agrega la instancia creada a la lista de usuarios del contenedor.
     * </p>
     * @param contenedor instancia de Contenedor creada por la clase Main.
     * @return contenedor ingresado como parámetro, actualizado con el nuevo Profesional.
     */
    private static Contenedor crearProfesional(Contenedor contenedor) {
        Scanner sc = new Scanner(System.in);
        Profesional profesional = new Profesional();

        System.out.println("Ingrese nombre: ");
        String nombre = sc.next();
        System.out.println("Ingrese apellido: ");
        String apellido = sc.next();
        String fechaNac = "";
        boolean fechaValida = false;

        while (!fechaValida) {
            System.out.println("Ingrese su fecha de nacimiento (año-mes-dia): ");
            fechaNac = sc.next();

            try {
                LocalDate.parse(fechaNac);
                fechaValida = true;
            } catch (DateTimeParseException e) {
                System.out.println("Fecha inválida. Intente nuevamente.");
            }
        }
        System.out.println("Ingrese su numero de run: ");
        int run = sc.nextInt();
        System.out.println("Ingrese título: ");
        String titulo = sc.next();

        String fechaIngreso = "";
        boolean fechaValidaProfesional = false;

        while (!fechaValidaProfesional) {
            System.out.println("indique fecha de ingreso (año-mes-dia): ");
            fechaIngreso = sc.next();

            try {
                LocalDate.parse(fechaIngreso);
                fechaValidaProfesional = true;
            } catch (DateTimeParseException e) {
                System.out.println("Fecha inválida. Intente nuevamente.");
            }
        }

        profesional.setNombre(nombre);
        profesional.setApellido1(apellido);
        profesional.setFechaNacimiento(fechaNac);
        profesional.setRun(run);
        profesional.setTipoUsuario(2);
        profesional.setTitulo(titulo);
        profesional.setFechaIngreso(fechaIngreso);
        contenedor.almacenarProfesional(profesional);

        return contenedor;
    }

    /**
     * Crea una instancia de Administrativo y la agrega a la lista de usuarios del contenedor
     *
     * <p>
     *     Solicita ingresar atributos y crea una instancia de Administrativo con los atributos ingresados.
     *     Posteriormente, agrega la instancia creada a la lista de usuarios del contenedor.
     * </p>
     * @param contenedor instancia de Contenedor creada por la clase Main.
     * @return contenedor ingresado como parámetro, actualizado con el nuevo Administrativo.
     */
    private static Contenedor crearAdministrativo(Contenedor contenedor){
        Scanner sc = new Scanner(System.in);
        Administrativo administrativo = new Administrativo();

        System.out.println("Ingrese nombre: ");
        String nombre = sc.next();


        System.out.println("Ingrese apellido: ");
        String apellido1 = sc.next();

        String fechaNac = "";
        boolean fechaValida = false;

        while (!fechaValida) {
            System.out.println("Ingrese su fecha de nacimiento (año-mes-dia): ");
            fechaNac = sc.next();

            try {
                LocalDate.parse(fechaNac);
                fechaValida = true;
            } catch (DateTimeParseException e) {
                System.out.println("Fecha inválida. Intente nuevamente.");
            }
        }

        System.out.println("Ingrese su numero de run: ");
        int run = sc.nextInt();

        String area = "";
        boolean areaValida = false;

        while(!areaValida){
            System.out.println("Ingrese area: ");
            area = sc.next();

            if(area.length() >= 5 && area.length() <= 20){
                areaValida = true;
            } else {
                System.out.println("El área debe contener mínimo 5 y máximo 20 caracteres.");
            }
        }


        String experiencia = "";
        boolean expValida = false;

        while(!expValida){
            System.out.println("Ingrese experiencia previa: ");
            experiencia = sc.next();

            if(experiencia.length() <= 100){
                expValida = true;
            } else {
                System.out.println("Se permiten máximo 100 caracteres, intente nuevamente.");
            }
        }

        administrativo.setNombre(nombre);
        administrativo.setApellido1(apellido1);
        administrativo.setFechaNacimiento(fechaNac);
        administrativo.setRun(run);
        administrativo.setTipoUsuario(3);
        administrativo.setArea(area);
        administrativo.setExperienciaPrevia(experiencia);
        contenedor.almacenarAdministrativo(administrativo);

        return contenedor;
    }

    /**
     * Crea una instancia de Capacitación y la agrega a la lista de capacitaciones del contenedor
     *
     * <p>
     *     Solicita ingresar atributos y crea una instancia de Capacitación con los atributos ingresados.
     *     Posteriormente, agrega la instancia creada a la lista de capacitaciones del contenedor.
     * </p>
     * @param contenedor instancia de Contenedor creada por la clase Main.
     * @return contenedor ingresado como parámetro, actualizado con la nueva Capacitación.
     */
    private static Contenedor crearCapacitacion(Contenedor contenedor){
        Capacitacion capacitacion = new Capacitacion();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese id: ");
        int id = sc.nextInt();

        System.out.println("Ingrese rut de cliente: ");
        int rut = sc.nextInt();

        System.out.println("Ingrese duración: ");
        int duracion = sc.nextInt();

        System.out.println("Ingrese lugar: ");
        String lugar = sc.next();





        capacitacion.setId(id);
        capacitacion.setRutCliente(rut);
        capacitacion.setLugar(lugar);
        capacitacion.setDuracion(duracion);
        contenedor.almacenarCapacitacion(capacitacion);

        return contenedor;
    }

    public static void main(String[] args) {
        Contenedor contenedor = new Contenedor();
        Scanner sc = new Scanner(System.in);

        int opcion;

        Cliente c1 = new Cliente();
        c1.setNombre("Andres");
        c1.setApellido1("Sepulveda");
        c1.setApellido2("Valenzuela");
        c1.setFechaNacimiento("1995-03-04");
        c1.setRun(26931652);
        c1.setTipoUsuario(1);
        c1.setRazonSocial("Razon social");
        c1.setRUT(269316527);
        c1.setTelefonoRepresentante(37078878);
        c1.setDireccionEmpresa("Lo Ovalle 559");
        c1.setComunaEmpresa("La Cisterna");

        Cliente c2 = new Cliente();
        c2.setNombre("Luis");
        c2.setApellido1("Valenzuela");
        c2.setFechaNacimiento("1990-11-27");
        c2.setRun(2516357);
        c2.setTipoUsuario(1);
        c2.setRazonSocial("Razon social2");
        c2.setRUT(25163572);
        c2.setTelefonoRepresentante(65280917);
        c2.setDireccionEmpresa("Santa Isabel");
        c2.setComunaEmpresa("Puente Asalto");

        Cliente c3 = new Cliente();
        c3.setNombre("Katherine");
        c3.setApellido1("Cordero");
        c3.setFechaNacimiento("1600-11-11");
        c3.setRun(3120);
        c3.setTipoUsuario(1);
        c3.setRazonSocial("Razon social3");
        c3.setRUT(31203);
        c3.setTelefonoRepresentante(98765432);
        c3.setDireccionEmpresa("La NASA");
        c3.setComunaEmpresa("Melipilla");

        Cliente c4 = new Cliente();
        c4.setNombre("Diego");
        c4.setApellido1("Mancilla");
        c4.setApellido2("Calceto");
        c4.setFechaNacimiento("1998-01-12");
        c4.setRun(12345678);
        c4.setTipoUsuario(1);
        c4.setRazonSocial("Razon social4");
        c4.setRUT(123456781);
        c4.setTelefonoRepresentante(13579246);
        c4.setDireccionEmpresa("La Cashe");
        c4.setComunaEmpresa("La Calceto House");

        Cliente c5 = new Cliente();
        c5.setNombre("Diego");
        c5.setApellido1("Aedo");
        c5.setFechaNacimiento("2015-01-12");
        c5.setRun(26782329);
        c5.setTipoUsuario(1);
        c5.setRazonSocial("Razon social5");
        c5.setRUT(267823291);
        c5.setTelefonoRepresentante(26387112);
        c5.setDireccionEmpresa("Ya no se me ocurre nada mas");
        c5.setComunaEmpresa("Donde dios quiera");

        Profesional p1 = new Profesional();
        p1.setNombre("Diego");
        p1.setApellido1("Mancilla");
        p1.setApellido2("Calceto");
        p1.setFechaNacimiento("1998-01-12");
        p1.setRun(12345678);
        p1.setTipoUsuario(2);
        p1.setTitulo("Prevencionista de Riesgos");
        p1.setFechaIngreso("2004-05-05");

        Profesional p2 = new Profesional();
        p2.setNombre("Katherine");
        p2.setApellido1("Mancilla");
        p2.setApellido2("Calceto");
        p2.setFechaNacimiento("1998-01-12");
        p2.setRun(445665444);
        p2.setTipoUsuario(2);
        p2.setTitulo("Programadora Base de Datos");
        p2.setFechaIngreso("2004-05-05");

        Profesional p3 = new Profesional();
        p3.setNombre("Andres");
        p3.setApellido1("Cordero");
        p3.setApellido2("Calceto");
        p3.setFechaNacimiento("1998-01-12");
        p3.setRun(186234567);
        p3.setTipoUsuario(2);
        p3.setTitulo("Directivo de oficina");
        p3.setFechaIngreso("2004-05-05");

        Profesional p4 = new Profesional();
        p4.setNombre("Katherine");
        p4.setApellido1("Mancilla");
        p4.setApellido2("Calceto");
        p4.setFechaNacimiento("1998-01-12");
        p4.setRun(12345678);
        p4.setTipoUsuario(2);
        p4.setTitulo("Programadora Base de Datos");
        p4.setFechaIngreso("2004-05-05");

        Profesional p5 = new Profesional();
        p1.setNombre("Diego");
        p1.setApellido1("Desaparecido");
        p1.setApellido2("Profugo");
        p1.setFechaNacimiento("1998-01-12");
        p1.setRun(12345678);
        p1.setTipoUsuario(2);
        p1.setTitulo("Escapista");
        p1.setFechaIngreso("2004-05-05");

        Administrativo a1 = new Administrativo();
        a1.setNombre("Diego");
        a1.setApellido1("Desaparecido");
        a1.setApellido2("Profugo");
        a1.setFechaNacimiento("1998-01-12");
        a1.setRun(12345678);
        a1.setTipoUsuario(3);
        a1.setArea("Carcel");
        a1.setExperienciaPrevia("1 año de Temporada 2");

        Administrativo a2 = new Administrativo();
        a2.setNombre("Katherine");
        a2.setApellido1("Mancilla");
        a2.setApellido2("Calceto");
        a2.setFechaNacimiento("1998-01-12");
        a2.setRun(12345678);
        a2.setTipoUsuario(3);
        a2.setArea("Carcel");
        a2.setExperienciaPrevia("2 años de Temporada 2");

        Administrativo a3 = new Administrativo();
        a3.setNombre("Andres");
        a3.setApellido1("Cordero");
        a3.setApellido2("Calceto");
        a3.setFechaNacimiento("1998-01-12");
        a3.setRun(186234567);
        a3.setTipoUsuario(3);
        a3.setArea("Carcel Antofagasta");
        a3.setExperienciaPrevia("6 años de Temporada 2");

        Administrativo a4 = new Administrativo();
        a4.setNombre("afsafsasf");
        a4.setApellido1("asfasfa");
        a4.setApellido2("aaaaaaa");
        a4.setFechaNacimiento("1998-01-12");
        a4.setRun(186234555);
        a4.setTipoUsuario(3);
        a4.setArea("Carcel Calama");
        a4.setExperienciaPrevia("5 años de Temporada 2");

        Administrativo a5 = new Administrativo();
        a5.setNombre("jose");
        a5.setApellido1("asfasfa");
        a5.setApellido2("aaaaaaa");
        a5.setFechaNacimiento("1998-01-12");
        a5.setRun(186234555);
        a5.setTipoUsuario(3);
        a5.setArea("Carcel Calama");
        a5.setExperienciaPrevia("5 años de Temporada 2");


        contenedor.almacenarCliente(c1);
        contenedor.almacenarCliente(c2);
        contenedor.almacenarCliente(c3);
        contenedor.almacenarCliente(c4);
        contenedor.almacenarCliente(c5);

        contenedor.almacenarProfesional(p1);
        contenedor.almacenarProfesional(p2);
        contenedor.almacenarProfesional(p3);
        contenedor.almacenarProfesional(p4);
        contenedor.almacenarProfesional(p5);

        contenedor.almacenarAdministrativo(a1);
        contenedor.almacenarAdministrativo(a2);
        contenedor.almacenarAdministrativo(a3);
        contenedor.almacenarAdministrativo(a4);
        contenedor.almacenarAdministrativo(a5);

        do{
            System.out.println("1.- Almacenar Cliente");
            System.out.println("2.- Almacenar Profesional");
            System.out.println("3.- Almacenar Administrativo");
            System.out.println("4. Listar Usuarios");
            System.out.println("5. Listar Usuarios por tipo");
            System.out.println("6. Eliminar Usuario por RUN");
            System.out.println("7. Almacenar Capacitacion");
            System.out.println("8. Listar Capacitaciones");
            System.out.println("9. Salir");
            System.out.println("Ingresar una Opcion");

            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Almacenar Cliente");
                    crearCliente(contenedor);
                    System.out.println("Cliente Almacenado");
                    break;
                case 2:
                    System.out.println("Almacenar Profesional");
                    crearProfesional(contenedor);
                    System.out.println("Profesional Almacenado");
                    break;
                case 3:
                    System.out.println("Almacenar Administrativo");
                    crearAdministrativo(contenedor);
                    System.out.println("Administrativo Almacenado");
                    break;
                case 4:
                    System.out.println("Listar Usuarios");
                    contenedor.listarUsuarios();
                    break;
                case 5:
                    System.out.println("Listar Usuarios por Tipo");
                    System.out.println("Ingrese tipo de usuario: 1:Cliente  2:Profesional  3:Administrativo" );
                    int tipoUsuario = sc.nextInt();
                    contenedor.listarUsuariosPorTipo(tipoUsuario);
                    break;
                case 6:
                    System.out.println("Eliminar Usuario por Run");
                    System.out.println("Ingrese el Run que desea eliminar: " );
                    int run = sc.nextInt();
                    contenedor.eliminarUsuario(run);
                    break;
                case 7:
                    System.out.println("Almacenar Capacitacion");
                    crearCapacitacion(contenedor);
                    System.out.println("Capacitacion Almacenada");
                    break;
                case 8:
                    System.out.println("Listar Capacitaciones");
                    contenedor.listarCapacitaciones();
                    break;
                case 9:
                    System.out.println("Hasta Luego");
                    break;
                default:
                    System.out.println("Ingrese una opcion válida");
                    break;
            }
            System.out.println();

        }while (opcion != 9);

    }
}
