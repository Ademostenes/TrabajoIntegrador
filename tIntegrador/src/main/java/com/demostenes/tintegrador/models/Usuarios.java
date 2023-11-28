package com.demostenes.tintegrador.models;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "dni", nullable=false)
    private String dni;

    @Column(name = "pwd", nullable=false)
    private String pwd;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apellido;

    @ManyToOne
    @JoinColumn(name = "id_rol_usuario", referencedColumnName="id_rol")
    private Roles id_rol;

    @Column(name = "email")
    private String email;

    public Usuarios() {}

    public Usuarios(String dni, String pwd, String nombre, String apellido, Roles rol, String email) {
        this.dni = dni;
        this.pwd = pwd;
        this.nombre = nombre;
        this.apellido = apellido;
        this.id_rol = rol;
        this.email = email;
    }

	public void setDni(String nextLine) {
		// TODO Auto-generated method stub
		
	}

	public void setNombre(String nextLine) {
		// TODO Auto-generated method stub
		
	}

	public void setApellido(String nextLine) {
		// TODO Auto-generated method stub
		
	}
}