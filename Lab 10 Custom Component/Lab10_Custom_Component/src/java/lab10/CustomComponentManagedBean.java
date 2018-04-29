/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CustomComponentManagedBean {

    String yearInput;
    String monthInput;

    public String submit() {
        return "customComponentResult.xhtml";
    }

    public String getYearInput() {
        return yearInput;
    }

    public void setYearInput(String yearInput) {
        this.yearInput = yearInput;
    }

    public String getMonthInput() {
        return monthInput;
    }

    public void setMonthInput(String monthInput) {
        this.monthInput = monthInput;
    }
}
