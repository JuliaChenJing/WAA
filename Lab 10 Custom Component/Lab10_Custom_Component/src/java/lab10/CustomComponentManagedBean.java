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

    public void monthIncrease() {
        if (Integer.parseInt(this.monthInput) + 1 > 12) {
            this.monthInput = "12";
        } else if (Integer.parseInt(this.monthInput) - 1 < 1) {
            this.monthInput = "1";
        } else {
            this.monthInput = "" + (Integer.parseInt(this.monthInput) + 1);
        }
    }

    public void monthDecrease() {
        if (Integer.parseInt(this.monthInput) + 1 > 12) {
            this.monthInput = "12";
        } else if (Integer.parseInt(this.monthInput) - 1 < 1) {
            this.monthInput = "1";
        } else {
            this.monthInput = "" + (Integer.parseInt(this.monthInput) - 1);
        }
    }

    public void yearIncrease() {
        if (Integer.parseInt(this.yearInput) + 1 > 2022) {
            this.yearInput = "2022";
        } else if (Integer.parseInt(this.yearInput) - 1 < 2018) {
            this.yearInput = "2018";
        } else {
            this.yearInput = "" + (Integer.parseInt(this.yearInput) + 1);
        }
    }

    public void yearDecrease() {
        if (Integer.parseInt(this.yearInput) + 1 > 2022) {
            this.yearInput = "2022";
        } else if (Integer.parseInt(this.yearInput) - 1 < 2018) {
            this.yearInput = "2018";
        } else {
            this.yearInput = "" + (Integer.parseInt(this.yearInput) + 1);
        }
    }
}
