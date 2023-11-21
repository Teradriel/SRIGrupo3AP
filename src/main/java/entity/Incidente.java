package entity;

import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
public class Incidente {

    Long idIncidente;
    Date fechaIngreso;
    String estado;
    String descripcion;
    String Tipo;
    Cliente cliente;
    List<Servicio> servicios;
    Set<Tecnico> tecnicos;

}
