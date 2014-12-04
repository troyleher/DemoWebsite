/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dating.managedbeans.support;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import org.troy.global.persistance.entities.User;
import org.troy.global.persistance.entities.User.City;
import org.troy.global.persistance.entities.User.Gender;

/**
 *
 * @author Troy
 */
@ManagedBean
@javax.faces.bean.ApplicationScoped
public class UserSupport {

    private SimpleDateFormat sdf;
    private Logger logger;

    /**
     * Creates a new instance of UserSupport
     */
    public UserSupport() {
        sdf = new SimpleDateFormat("MM/dd/yyyy");
        logger = Logger.getLogger(UserSupport.class.getName());
    }

    public Gender[] getGenderValues() {
        return Gender.values();
    }
    public City[] getCityValues(){
        return City.values();
    }

    public Date getCalenderMinDate() {
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.YEAR, -100);
        logger.log(Level.INFO, sdf.format(c.getTime()));
        return c.getTime();
    }

    public Date getCalenderMaxDate() {
        Date max = new Date();
        logger.log(Level.INFO, sdf.format(max));
        return max;
    }
}
