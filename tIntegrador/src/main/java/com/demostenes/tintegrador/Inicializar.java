/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demostenes.tintegrador;

import com.demostenes.tintegrador.models.Clientes;
import com.demostenes.tintegrador.services.ClientesServices;

public class Inicializar {
    

    public static void inicializarClientes(ClientesServices clientes){
     clientes.create(new Clientes("Arncard","30707656541","email@arncard.com"));
      clientes.create(new Clientes("Protico","3071554885","email@protico.com"));
       clientes.create(new Clientes("CalzadosArnaldo","3070765581","email@calzadosarnaldo.com"));
    }
    
}
