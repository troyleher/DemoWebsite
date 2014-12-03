/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dating.managedbeans.controllers;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.troy.global.persistance.entities.User;
import org.troy.services.UserServiceLocal;

/**
 *
 * @author Troy
 */
@Named(value = "userController")
@RequestScoped
public class UserController implements Serializable{
    @EJB
    private UserServiceLocal userService;
    private User user;
    
    @PostConstruct
    public void init(){
        user = userService.createBlankUser();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public String saveUser(){
        userService.saveUser(user);
        return "index";
    }
    
    
}
