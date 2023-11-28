package com.demostenes.tintegrador.DAO;

import com.demostenes.tintegrador.models.Clientes;

public class ClientesDAO extends AbstractJpaDAO< Clientes > {

   public ClientesDAO(){
      setClase(Clientes.class );
   }
   
}
