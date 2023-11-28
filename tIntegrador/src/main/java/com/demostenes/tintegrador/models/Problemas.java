
package com.demostenes.tintegrador.models;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter

@Entity
@Table(name = "Problemas")
public class Problemas implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_problema;
    
    @ManyToOne
    @JoinColumn(name="id_incidente", referencedColumnName = "id_incidente")
    private Incidentes id_incidente;
    @Column(name = "descripcion")
    private String desc_problema;
    
    private int tiempoEsperadoRes; // Tiempo esperado resolución en minutos.
    private int tiempoMaxProblema; // Tiempo maximo resolución en minutos.
    
    public Problemas(){}

    public Problemas(Incidentes id_incidente, String desc_problema, int tiempoEsperadoRes, int tiempoMaxProblema) {
        this.id_incidente = id_incidente;
        this.desc_problema = desc_problema;
        this.tiempoEsperadoRes = tiempoEsperadoRes;
        this.tiempoMaxProblema = tiempoMaxProblema;
    }
    
}
