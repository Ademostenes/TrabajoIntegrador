package com.demostenes.tintegrador.DAO;

import com.demostenes.tintegrador.dbconfig.DBConfig;
import com.demostenes.tintegrador.TIntegrador;
import com.demostenes.tintegrador.models.Clientes;
import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public abstract class AbstractJpaDAO< T extends Serializable > {

	   private Class<T> clase; //Donde T es un tipo a establecer.

	   EntityManager entityManager = DBConfig.getEntityManager();
	   
	   public final void setClase( Class< T > claseToSet ){
		  this.clase = claseToSet;
	   }

	   public T findOne( int id ){
	      return entityManager.find( clase, id );
	   }
	   public List< T > findAll(){
	      return entityManager.createQuery( "from " + clase.getName() )
	       .getResultList();
	   }

	   public void create( T entity ){
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
		    entityManager.persist( entity );
		    tx.commit();
	   }

	   public T update( T entity ){
		   EntityTransaction tx = entityManager.getTransaction();
		   tx.begin();
		   T entityMerged = entityManager.merge( entity );
		   tx.commit();
		   return entityMerged;
	   }

	   public void delete( T entity ){
		  EntityTransaction tx = entityManager.getTransaction();
		  tx.begin();
		  entityManager.remove( entity );
	      tx.commit();
	   }
	   
	}