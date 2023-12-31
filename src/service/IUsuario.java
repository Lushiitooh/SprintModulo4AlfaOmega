package service;

import java.time.LocalDate;

public interface IUsuario {
    public void analizarUsuario();

    String getNombre();

    String getApellido1();

    String getApellido2();

    LocalDate getFechaNacimiento();

    int getRun();

    int getTipoUsuario();
}
