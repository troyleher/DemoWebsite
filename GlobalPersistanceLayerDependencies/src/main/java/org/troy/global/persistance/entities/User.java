/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.troy.global.persistance.entities;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author Troy
 */
public class User implements Serializable{
    
    private long id;
    
    private String email;
    private String name;
    private Date dob;
    private City city;
    private Gender gender;
    private Gender seeks;
    private String caption;
    private String selfDescription;
    private String seekDescription;
    private String password;
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getSeeks() {
        return seeks;
    }

    public void setSeeks(Gender seeks) {
        this.seeks = seeks;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getSelfDescription() {
        return selfDescription;
    }

    public void setSelfDescription(String selfDescription) {
        this.selfDescription = selfDescription;
    }

    public String getSeekDescription() {
        return seekDescription;
    }

    public void setSeekDescription(String seekDescription) {
        this.seekDescription = seekDescription;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
    public enum City{
        Auckland, Hamilton, 
    }
    public enum Gender{
        Male, Female;
    }
    
}
