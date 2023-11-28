package com.demostenes.tintegrador.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "competencias")
public class Competencias implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_competencia;

    @OneToMany
    private List<Servicios>servicios; 

    private Tecnicos id_tecnico;


}