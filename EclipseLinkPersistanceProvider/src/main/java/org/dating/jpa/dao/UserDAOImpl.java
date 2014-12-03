/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dating.jpa.dao;

import java.io.Serializable;
import javax.enterprise.context.Dependent;
import org.troy.global.persistance.dao.UserDAO;
import org.troy.global.persistance.entities.User;



/**
 *
 * @author Troy
 * @param <T>
 */

@Dependent
@   org.troy.global.persistance.qualifiers.UserDAO
public class UserDAOImpl<T extends User> extends GenericDAO<User> implements Serializable, UserDAO<User>{

    public UserDAOImpl() {
        super(User.class);
    }

    @Override
    public User createBlankUser() {
        return new org.dating.jpa.entities.User();
    }
    
    
    
}
