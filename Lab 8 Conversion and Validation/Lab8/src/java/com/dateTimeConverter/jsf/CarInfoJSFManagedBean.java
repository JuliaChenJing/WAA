/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dateTimeConverter.jsf;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;


/**
 *
 * @author bimal.parajuli
 */
@ManagedBean
@RequestScoped
public class CarInfoJSFManagedBean {
    private String brand;
    private String license;
    private Long price; 

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
    public void validateBrand(FacesContext context, UIComponent toValidate, Object value){
        brand = (String) value;
        if(!(brand.equalsIgnoreCase("BMW") || brand.equalsIgnoreCase("Mercedes"))){
            ((UIInput) toValidate).setValid(false);
            FacesMessage message = new FacesMessage("Invalid Brand");
            context.addMessage(toValidate.getClientId(context), message);
        }
    }
    public String submit(){
        return null;
    }
    
    
}
