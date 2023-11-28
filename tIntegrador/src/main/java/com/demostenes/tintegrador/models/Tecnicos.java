/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demostenes.tintegrador.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter

@Entity
@Table(name="tecnicos")
public class Tecnicos implements Serializable {
       
        @Id
        @Column(name="id_tecnico", nullable = false)
        private int id_tecnico;
        
        @OneToOne
        private Usuarios id_user;
        
        @OneToMany
        @JoinColumn(name="idUsuario", referencedColumnName="id_tecnico")
	private List<Competencias> competencia = new ArrayList<>();
        
        
        public Tecnicos(){
        }
	
}