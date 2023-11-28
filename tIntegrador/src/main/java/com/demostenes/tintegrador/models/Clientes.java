package com.demostenes.tintegrador.models;



    import java.io.Serializable;
    import java.util.ArrayList;
    import java.util.List;
    import javax.persistence.*;
    import lombok.Setter;
    import lombok.Getter;


    @Setter @Getter

    @Entity
    @Table(name = "clientes")

    public class Clientes implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id_cliente;

        @OneToOne
        @JoinColumn(name = "id_user", referencedColumnName="dni")
        private Usuarios id_user;

        @Column(name = "cuit")
        private String cuit;

        @Column(name = "razon_social")
        private String razonSocial;

        @Column(name = "email")
        private String email;


        @OneToMany
        @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
        private List<Serv_Contratados> listaServiciosContratados;

    public Clientes() {
        this.listaServiciosContratados = new ArrayList<>();
    }
        
        public Clientes ( String razonSocial, String CUIT, String email){
        this.listaServiciosContratados = new ArrayList<>();
        this.razonSocial = razonSocial;
        this.cuit = CUIT;
        this.email = email;
        this.setListaServiciosContratados(new ArrayList<>());
        }

    }


    
