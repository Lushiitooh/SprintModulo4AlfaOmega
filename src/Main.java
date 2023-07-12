import models.Administrativo;
import models.Cliente;
import models.Profesional;
import models.Usuario;

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
        u1.setFechaNacimiento("2023-04-03");
        u1.setTipoUsuario(1);
        u1.setArea("bi");
        u1.setExperienciaPrevia("Algo");
        u1.analizarUsuario();
    }
}
