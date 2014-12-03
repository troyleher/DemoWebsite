/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.troy.global.persistance.dao;

import java.io.Serializable;

/**
 *
 * @author Troy
 */
public interface DAO<T> {
   
    public T getEntity(Serializable primaryKey);
    public void createEntity(T entity);
    public T updateEntity(T entityToUpdate);
    public void deleteEntity(T entityToRemove);
}
