package com.demostenes.tintegrador.services;
import java.util.List;
import javax.transaction.Transactional;

import com.demostenes.tintegrador.DAO.ClientesDAO;
import com.demostenes.tintegrador.models.*;

public class ClientesServices {
    
    private ClientesDAO dao = new ClientesDAO();

    public void create(Clientes entity) {
        dao.create(entity);
    }

    public Clientes findOne(int id) {
        return dao.findOne(id);
    }

    public List<Clientes> findAll() {
        return dao.findAll();
    }
    
    public void actualizar(Clientes entity){
    dao.update(entity);
    }
    
}
