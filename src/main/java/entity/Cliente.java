package entity;

import lombok.Data;

import java.util.List;

@Data
public class Cliente {

    Long idCliente;
    Long cuit;
    String razonSocial;
    String telefono;
    String mail;
    List<Incidente> incidentes;

}
