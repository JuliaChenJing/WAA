/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Conversion {

    private String dateInput;
    private Date date;
    String temperatureInput;
    String realTemperature;

    public String getDateInput() {
        return dateInput;
    }

    public void setDateInput(String dateInput) {
        this.dateInput = dateInput;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTemperatureInput() {
        return temperatureInput;
    }

    public void setTemperatureInput(String temperatureInput) {
        this.temperatureInput = temperatureInput;
    }

    public String getRealTemperature() {
        return realTemperature;
    }

    public void setRealTemperature(String realTemperature) {
        this.realTemperature = realTemperature;
    }

    public String submit() {
        return "conversionResult.xhtml";
    }
}
