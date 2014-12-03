/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.troy.global.persistance.dao;

import org.troy.global.persistance.entities.User;

/**
 *
 * @author Troy
 * @param <T>
 */
public interface UserDAO<T extends User> extends DAO<T>{
    
    public T createBlankUser();
}
