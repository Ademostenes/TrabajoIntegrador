package com.demostenes.tintegrador.services;
import java.util.List;

import com.demostenes.tintegrador.DAO.RolesDAO;
import com.demostenes.tintegrador.models.*;

public class RolesServices {
    
    private RolesDAO dao = new RolesDAO();

    public void create(Roles entity) {
        dao.create(entity);
    }

    public Roles findOne(int id) {
        return dao.findOne(id);
    }

    public List<Roles> findAll() {
        return dao.findAll();
    }
    
}
