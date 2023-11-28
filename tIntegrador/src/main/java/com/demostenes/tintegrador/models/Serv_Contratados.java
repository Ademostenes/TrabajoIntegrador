/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demostenes.tintegrador.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import lombok.*;
@Setter @Getter @NoArgsConstructor

@Entity
@Table(name = "Serv_contratados")
public class Serv_Contratados implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_servContratado;

    private int id_cliente;
    
    @OneToMany
    private List<Servicios> servicios;


}