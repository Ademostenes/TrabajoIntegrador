package com.demostenes.tintegrador.models;
import java.io.Serializable;
import javax.persistence.*;
    import lombok.Setter;
    import lombok.Getter;


    @Setter @Getter

@Entity
@Table(name = "servicios")
public class Servicios implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_servicio")
    private int id_servicio;

    @Column(name = "desc_servicio")
    private String desc_servicio;

    public Servicios() {
    }

    public Servicios(String descripcion){
    this.desc_servicio = descripcion;
           
    }

}