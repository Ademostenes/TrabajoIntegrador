package com.demostenes.tintegrador.DAO;

import com.demostenes.tintegrador.models.Incidentes;

public class IncidentesDAO extends AbstractJpaDAO< Incidentes> {

   public IncidentesDAO(){
      setClase(Incidentes.class );
   }
   
}