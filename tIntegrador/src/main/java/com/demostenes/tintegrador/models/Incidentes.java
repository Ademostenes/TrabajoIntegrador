package com.demostenes.tintegrador.models;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter

@Entity
@Table(name = "Incidentes")
public class Incidentes implements Serializable {
@Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
private int id_incidente;

@OneToOne
private Usuarios id_usuario;

@OneToOne
private Clientes id_cliente;

@Column(name = "descripcion")
private String desc_incidente;

@Temporal(javax.persistence.TemporalType.DATE)
private Date fecha_alta;

@Column(name = "estado")
private Estados estado_actual;

@OneToOne
private Servicios id_servicio;

@OneToOne
private Tecnicos id_tecnico;

@Column(name="esccomplejo")
private boolean escomplejo;

@Column(name = "coments")
private String comentarios;

@Column (name = "notificado")
private boolean notif_enviada;
}
