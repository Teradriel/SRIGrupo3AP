package entity;

import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class Tecnico {

    Long idTecnico;
    String nombre;
    Set<Especialidad> especialidades;
    List<Incidente> incidentes;

}
