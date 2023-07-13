import models.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

        List<Cliente> l1 = new ArrayList<>();
        l1.add(c1);
        l1.add(c2);
        l1.add(c3);
        l1.add(c4);
        l1.add(c5);

        for (int i = 0; i < l1.size(); i++) {
            int cont = i + 1;

            System.out.println("Cliente " + cont) ;
            System.out.println(l1.get(i));
            System.out.println("");
        }
    }
}
