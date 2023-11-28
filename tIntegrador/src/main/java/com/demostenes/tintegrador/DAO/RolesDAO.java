package com.demostenes.tintegrador.DAO;

import com.demostenes.tintegrador.models.Roles;

public class RolesDAO extends AbstractJpaDAO<Roles> {

   public RolesDAO(){
      setClase(Roles.class );
   }
   
}