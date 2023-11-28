package com.demostenes.tintegrador.DAO;

import com.demostenes.tintegrador.models.Problemas;

public class ProblemasDAO extends AbstractJpaDAO< Problemas > {

   public ProblemasDAO(){
      setClase(Problemas.class );
   }
   
}