package com.demostenes.tintegrador;

import com.demostenes.tintegrador.models.Clientes;
import com.demostenes.tintegrador.models.Permisos;
import com.demostenes.tintegrador.models.Roles;
import com.demostenes.tintegrador.services.*;
import java.util.List;

public class TIntegrador {

    public static void main(String[] args) {
            ClientesServices clientes = new ClientesServices();
            Inicializar.inicializarClientes(clientes);
        RolesServices roles;
        roles = new RolesServices();
        PermisosServices perm = new PermisosServices();
                perm.create(new Permisos());
                Permisos permiso = perm.findOne(1);
        roles.create(new Roles("Administrador", permiso));
        Clientes unCliente = clientes.findOne(1);
        List<Clientes> listaClientes = clientes.findAll();
        Roles unRol = roles.findOne(1);
        List<Roles> listaroles = roles.findAll(); 
        System.out.println("Cliente: "+ unCliente.getRazonSocial());
        System.out.println("Rol: " + unRol.getDes_rol());
        listaroles.forEach(x -> System.out.println(x.getDes_rol()));
        listaClientes.forEach(x -> System.out.println(x.getRazonSocial()));
    } 

}

