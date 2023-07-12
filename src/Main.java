import models.Administrativo;
import models.Cliente;
import models.Profesional;
import models.Usuario;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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
