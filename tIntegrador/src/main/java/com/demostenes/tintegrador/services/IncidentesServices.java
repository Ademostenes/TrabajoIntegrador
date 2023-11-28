package com.demostenes.tintegrador.services;
import java.util.List;

import com.demostenes.tintegrador.DAO.IncidentesDAO;
import com.demostenes.tintegrador.models.*;

public class IncidentesServices {
    
    private IncidentesDAO dao = new IncidentesDAO();

    public void create(Incidentes entity) {
        dao.create(entity);
    }

    public Incidentes findOne(int id) {
        return dao.findOne(id);
    }

    public List<Incidentes> findAll() {
        return dao.findAll();
    }
    
}