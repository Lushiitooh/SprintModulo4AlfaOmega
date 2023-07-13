import models.*;

import java.time.LocalDate;
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



        Administrativo u1 = new Administrativo();

        u1.setNombre("Andres");
        u1.setApellido1("Sepulveda");
        u1.setApellido2("Valenzuela");
        u1.setRun(26931652);
        u1.setFechaNacimiento("2023-03-04");
        u1.setTipoUsuario(1);
        u1.setArea("bi");
        u1.setExperienciaPrevia("Algo");
        u1.analizarUsuario();

        Accidente a1 = new Accidente();
        a1.setFechaAccidente("2023-03-04");
        System.out.println(a1.getFechaAccidente());

        Profesional p1 = new Profesional();
        p1.setFechaIngreso("2023-03-04");
        System.out.println(p1.getFechaIngreso());

        Cliente c1 = new Cliente();
        c1.setRUT(269316527);
        Capacitacion cp1 = new Capacitacion();
        cp1.setRutCliente(c1);
        System.out.println(cp1);
    }
}
