package com.demostenes.tintegrador.models;
import java.io.Serializable;
import javax.persistence.*;
import lombok.*;

@Getter @Setter

@Entity
@Table(name = "permisos")  
public class Permisos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_permiso;

    @Column(name = "full_access")
    private boolean fullAccess;

    @Column(name = "rrhh_access")
    private boolean rrhhAccess;

    @Column(name = "tec_access")
    private boolean tecAccess;

    @Column(name = "asesor_access")
    private boolean asesorAccess;

    @Column(name = "comer_access")
    private boolean comerAccess;
    
    public Permisos (){
    this.fullAccess = true;
    }

}
