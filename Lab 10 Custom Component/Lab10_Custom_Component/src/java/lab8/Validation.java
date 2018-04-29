/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class Validation {

    String brand;
    String licenseNo;
    String price;

    public String submit() {
        return "validation.xhtml";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void validateBrand(FacesContext context, UIComponent toValidate, Object value) {
        brand = (String) value;
        if (!(brand.equalsIgnoreCase("BMW") || brand.equalsIgnoreCase("Mercedes"))) {
            ((UIInput) toValidate).setValid(false);
            FacesMessage message = new FacesMessage("Invalid Brand");
            context.addMessage(toValidate.getClientId(context), message);
        }
    }
}
