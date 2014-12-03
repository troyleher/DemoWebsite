/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.troy.services;

import java.io.Serializable;
import javax.ejb.Stateful;
import javax.inject.Inject;
import org.troy.global.persistance.dao.DAO;
import org.troy.global.persistance.dao.UserDAO;
import org.troy.global.persistance.entities.User;


/**import org.troy.persistance.entities.User;
 *
 * @author Troy
 */
@Stateful
public class UserService implements UserServiceLocal {
    //Named(value = "userDAO")
    @Inject @org.troy.global.persistance.qualifiers.UserDAO
    private UserDAO<User> userDAO ;

    @Override
    public User getUser(Serializable id) {
       return userDAO.getEntity(id);
    }

    @Override
    public void saveUser(User user) {
        userDAO.createEntity(user);
    }

    @Override
    public User createBlankUser() {
        return userDAO.createBlankUser();
    }
}
