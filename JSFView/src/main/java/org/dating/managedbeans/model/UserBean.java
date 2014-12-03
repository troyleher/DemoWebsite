/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dating.managedbeans.model;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import org.dating.jpa.entities.User;
import org.troy.services.UserServiceLocal;

/**
 *
 * @author Troy
 */
@Named(value = "userBean")
@SessionScoped
public class UserBean implements Serializable{
    @EJB
    private UserServiceLocal userService;
    private User user = new User();
    
    private String email;

    /**
     * Creates a new instance of UserBean
     */
    public UserBean() {
    }

    public String getEmail() {
        return user.getEmail();
    }

    public void setEmail(String email) {
        user.setEmail(email); 
    }
    public String save(){
        userService.saveUser(user);
        return "index";
    }
}
