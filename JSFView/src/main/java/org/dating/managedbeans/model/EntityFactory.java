/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dating.managedbeans.model;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import org.troy.global.persistance.entities.User;

/**
 *
 * @author Troy
 */
@ApplicationScoped
public class EntityFactory {
    
    @Produces
    @SessionScoped
    public User createUser(){
        return new org.dating.jpa.entities.User();
    }
}
