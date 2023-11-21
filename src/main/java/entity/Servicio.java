package entity;

import lombok.Data;

import java.util.List;

@Data
public class Servicio {

    Long idServicio;
    String descripcion;
    List<Incidente> incidentes;

}
