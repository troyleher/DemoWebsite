/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dating.managedbeans.controllers;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;
import org.troy.global.persistance.entities.User;
import org.troy.services.UserServiceLocal;

/**
 *
 * @author Troy
 */
@Named
@FlowScoped(value = "signup")
public class SignupFlowController implements Serializable {

    @EJB
    private UserServiceLocal userService;
    private User user;

    /**
     * Creates a new instance of SignupFlowController
     */
    public SignupFlowController() {
    }

    @PostConstruct
    public void init() {
        user = userService.createBlankUser();
    }

    public String getSubmit() {
        userService.saveUser(user);
        return "/index";
    }

    public User getUser() {
        return user;
    }

    public void comparePasswords(ComponentSystemEvent event) {
        FacesContext fc = FacesContext.getCurrentInstance();
        UIComponent components = event.getComponent();

        String password = getComponentValue("password", components);
        String passwordId = getComponentId("password", components);

        String passwordConfirmation = getComponentValue("passwordConfirmation", components);

        if (password.isEmpty() || passwordConfirmation.isEmpty()) {
            return;
        }
        if (!password.equals(passwordConfirmation)) {
            FacesMessage msg = new FacesMessage("Password must match confirm password");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            fc.addMessage(passwordId, msg);
            fc.renderResponse();
        }

    }

    private String getComponentId(String componentToFind, UIComponent componentToSearch) {
        String id = "";
        UIInput uiInput = (UIInput) componentToSearch.findComponent(componentToFind);
        if (uiInput != null) {
            id = uiInput.getClientId();
        }
        return id;
    }

    private String getComponentValue(String componentToFind, UIComponent componentToSearch) {
        String value = "";
        UIInput uiInput = (UIInput) componentToSearch.findComponent(componentToFind);
        if (uiInput != null) {
            value = uiInput.getLocalValue() == null ? "" : uiInput.getLocalValue().toString();
        }
        return value;
    }

}
