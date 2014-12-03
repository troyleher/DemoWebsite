/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dating.jsf.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

/**
 *
 * @author Troy
 */
@Named
@ApplicationScoped
@FacesConverter(value = "dateConveter")
public class DateConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        checkDateIsNotNull(value);
        return parseDate(value);
    }

    

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        if (date != null) {
            return sdf.format((Date) date);
        }
        return null;
    }
    
    private void checkDateIsNotNull(String value) throws ConverterException {
        FacesMessage errorMessage;
        if(value == null){
            errorMessage = new FacesMessage();
            errorMessage.setSummary("Date is required dd/mm/yyyy");
            errorMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ConverterException(errorMessage);
        }
    }

    private Date parseDate(String value) throws ConverterException {
        FacesMessage errorMessage;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        Date date = null;
        try {
            date = sdf.parse(value);
        } catch (ParseException ex) {
            errorMessage = new FacesMessage("Date is of wrong format dd/mm/yyyy");
            errorMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ConverterException(errorMessage);
        }
        return date;
    }

}
