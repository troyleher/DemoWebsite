/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.troy.services;

import java.io.Serializable;
import javax.ejb.Local;
import org.troy.global.persistance.entities.User;


/**
 *
 * @author Troy
 */
@Local
public interface UserServiceLocal {
    User getUser(Serializable id);
    void saveUser(User user);
    public User createBlankUser();
}
