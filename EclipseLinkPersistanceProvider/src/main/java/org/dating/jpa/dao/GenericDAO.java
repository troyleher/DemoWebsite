/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dating.jpa.dao;

import java.io.Serializable;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Alternative;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.troy.global.persistance.dao.DAO;



/**
 *
 * @author Troy
 */
@Dependent
public class GenericDAO<T> implements DAO<T>{
    @PersistenceContext(name = "PU")
     private EntityManager em;
     private Class<T> entityClass;

    public GenericDAO() {
    }
    public GenericDAO(Class<T> entityClass) {
        this.entityClass = entityClass;
    }
    @Override
    public T getEntity(Serializable primaryKey) {
        return em.find(entityClass, primaryKey);
    }

    @Override
    public void createEntity(T entity) {
        em.persist(entity);
    }

    @Override
    public T updateEntity(T entityToUpdate) {
        return em.merge(entityToUpdate);
    }

    @Override
    public void deleteEntity(T entityToRemove) {
        em.remove(entityToRemove);
    }
}
