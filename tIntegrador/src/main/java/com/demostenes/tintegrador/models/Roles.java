package com.demostenes.tintegrador.models;


import java.io.Serializable;
import javax.persistence.*;
import lombok.*;

@Setter @Getter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Roles implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_rol;

    @Column(name = "des_rol")
    private String des_rol;

    @ManyToOne
    @JoinColumn(name="id_permisos",referencedColumnName="id_permiso")
    private Permisos id_permisos;

    public Roles() {
    }
    
    public Roles (String descRol, Permisos perm){
    this.des_rol = descRol;
    this.id_permisos = perm;
    }

}
