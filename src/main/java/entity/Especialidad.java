package entity;

import lombok.Data;

import java.util.Set;

@Data
public class Especialidad {

    Long idEspecialidad;
    String nombre;
    Set<Tecnico> tecnicos;

}
