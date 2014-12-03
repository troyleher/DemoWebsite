/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dating.jpa.entities;

import java.util.Date;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.dating.jpa.util.Constants;


/**
 *
 * @author Troy
 */
@Entity
@Table(name = "USER_TABLE")
@Access(AccessType.PROPERTY)
public class User extends org.troy.global.persistance.entities.User {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Override
    public long getId() {
        return super.getId(); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Pattern(regexp = Constants.EMAIL_PATTERN, message = "Email is of wrong format")
    @Override
    public String getEmail() {
        return super.getEmail(); //To change body of generated methods, choose Tools | Templates.
    }

    @Enumerated(EnumType.STRING)
    @Override
    public City getCity() {
        return super.getCity(); //To change body of generated methods, choose Tools | Templates.
    }

    @Temporal(TemporalType.DATE)
    @Override
    public Date getDob() {
        return super.getDob(); //To change body of generated methods, choose Tools | Templates.
    }

    @Enumerated(EnumType.STRING)
    @Override
    public Gender getGender() {
        return super.getGender(); //To change body of generated methods, choose Tools | Templates.
    }

   
    @Size(min = 5, max = 15)
    @Override
    public String getName() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }

    @Size(max = 70)
    @Override
    public String getCaption() {
        return super.getCaption(); //To change body of generated methods, choose Tools | Templates.
    }

    @Size(max = 500)
    @Override
    public String getSeekDescription() {
        return super.getSeekDescription(); //To change body of generated methods, choose Tools | Templates.
    }

    @Enumerated(EnumType.STRING)
    @Override
    public Gender getSeeks() {
        return super.getSeeks(); //To change body of generated methods, choose Tools | Templates.
    }

    @Size(max = 500)
    @Override
    public String getSelfDescription() {
        return super.getSelfDescription(); //To change body of generated methods, choose Tools | Templates.
    }

    @NotNull(message = "Password cannot be blank")
    @Size(min = 6)
    @Override
    public String getPassword() {
        return super.getPassword(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
