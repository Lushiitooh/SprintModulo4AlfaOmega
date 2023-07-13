import models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contenedor contenedor = new Contenedor();
        Scanner sc = new Scanner(System.in);
        int opcion;

                /*
        * - Método Main
- Instancia clase Contenedor: crear 2 listas una de usuarios y una de capacitaciones
- Menú principal con 9 opciones
    - Almacenar Cliente
    - Almacenar Profesional
    - Almacenar Administrativo
    - Listar Usuarios
    - Listar Usuarios por tipo
    - Eliminar Usuarios por run
    - Almacenar Capacitación
    - Listar Capacitaciones
    - Salir

Si ingresa opción incorrecta, debe avisar y volver a pedir una opción

- Instanciar 5 objetos por cada tipo y probar el menú completo.
        * */

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
        p1.setFechaIngreso("05-05-2004");

        Profesional p2 = new Profesional();
        p2.setNombre("Katherine");
        p2.setApellido1("Mancilla");
        p2.setApellido2("Calceto");
        p2.setFechaNacimiento("1998-01-12");
        p2.setRun(445665444);
        p2.setTipoUsuario(2);
        p2.setTitulo("Programadora Base de Datos");
        p2.setFechaIngreso("05-05-2020");

        Profesional p3 = new Profesional();
        p3.setNombre("Andres");
        p3.setApellido1("Cordero");
        p3.setApellido2("Calceto");
        p3.setFechaNacimiento("1998-01-12");
        p3.setRun(186234567);
        p3.setTipoUsuario(2);
        p3.setTitulo("Directivo de oficina");
        p3.setFechaIngreso("06-06-2006");

        Profesional p4 = new Profesional();
        p4.setNombre("Katherine");
        p4.setApellido1("Mancilla");
        p4.setApellido2("Calceto");
        p4.setFechaNacimiento("1998-01-12");
        p4.setRun(12345678);
        p4.setTipoUsuario(2);
        p4.setTitulo("Programadora Base de Datos");
        p4.setFechaIngreso("05-05-2020");

        Profesional p5 = new Profesional();
        p1.setNombre("Diego");
        p1.setApellido1("Desaparecido");
        p1.setApellido2("Profugo");
        p1.setFechaNacimiento("1998-01-12");
        p1.setRun(12345678);
        p1.setTipoUsuario(2);
        p1.setTitulo("Escapista");
        p1.setFechaIngreso("07-05-2021");

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
        a5.setExperienciaPrevia("07-05-2021");




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

        }



    }
}


 /*List<Cliente> l1 = new ArrayList<>();
        l1.add(c1);
        l1.add(c2);
        l1.add(c3);
        l1.add(c4);
        l1.add(c5);

        List<Profesional> l2 = new ArrayList<>();
        l2.add(p1);
        l2.add(p2);
        l2.add(p3);
        l2.add(p4);
        l2.add(p5);

        List<Administrativo> l3 = new ArrayList<>();
        l3.add(a1);
        l3.add(a2);
        l3.add(a3);
        l3.add(a4);
        l3.add(a5);

        for (int i = 0; i < l1.size(); i++) {
            int cont = i + 1;

            System.out.println("Cliente " + cont) ;
            System.out.println(l1.get(i));
            System.out.println("");
        }
        Capacitacion capa1 = new Capacitacion();
        capa1.setId(1);

        Capacitacion capa2 = new Capacitacion();
        capa2.setId(2);

        Contenedor cont1 = new Contenedor();
        cont1.almacenarCapacitacion(capa1);
        cont1.almacenarCapacitacion(capa2);
        cont1.listarCapacitaciones();

        */
