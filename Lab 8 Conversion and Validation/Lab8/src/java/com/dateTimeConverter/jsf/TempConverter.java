/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dateTimeConverter.jsf;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("TempConverter")
public class TempConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        String temperature = "";
        if (value.startsWith("C")) {
            temperature = "The temperature was " + value.substring(1) + " Celcius";
        } else if (value.startsWith("F")) {
            temperature = "The temperature was " + value.substring(1) + " Fahrenheit";
        } else {
            temperature = "Wrong Input for temperature";
        }
        return temperature;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return value.toString();
    }

}
