package com.demostenes.tintegrador.services;
import com.demostenes.tintegrador.DAO.PermisosDAO;
import java.util.List;

import com.demostenes.tintegrador.models.*;

public class PermisosServices {
    
    private PermisosDAO dao = new PermisosDAO();

    public void create(Permisos entity) {
        dao.create(entity);
    }

    public Permisos findOne(int id) {
        return dao.findOne(id);
    }

    public List<Permisos> findAll() {
        return dao.findAll();
    }
    
}
