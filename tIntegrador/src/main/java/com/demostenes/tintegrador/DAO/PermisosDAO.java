package com.demostenes.tintegrador.DAO;

import com.demostenes.tintegrador.models.Permisos;

public class PermisosDAO extends AbstractJpaDAO<Permisos> {

   public PermisosDAO(){
      setClase(Permisos.class );
   }
   
}