package com.demostenes.tintegrador.DAO;

import java.util.Collection;
import java.util.Optional;

public interface DAO<T> {

	Optional<T> get(int id);
    Collection<T> getAll();
    int guardar(T t);
    void actualizar(T t);
    void borrar(T t);
	
}