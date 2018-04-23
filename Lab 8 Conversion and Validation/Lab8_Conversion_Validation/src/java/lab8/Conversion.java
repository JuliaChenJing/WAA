/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Conversion {

    private String dateInput;
    private Date date;
    private String dateOutput;
    String temperatureInput;
    String temperatureOutput;

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

    public String getDateOutput() {
        return dateOutput;
    }

    public void setDateOutput(String dateOutput) {
        this.dateOutput = dateOutput;
    }

    public String getTemperatureOutput() {
        return temperatureOutput;
    }

    public void setTemperatureOutput(String temperatureOutput) {
        this.temperatureOutput = temperatureOutput;
    }

    public String submit() {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy");
            date = simpleDateFormat.parse(dateInput);
            dateOutput = new SimpleDateFormat("EEEE").format(date) + ", " + DateFormat.getDateInstance().format(date);
        } catch (Exception error) {
            System.out.print(error);
            dateOutput = "Wrong date format! " + error;
        }
//        String[] numberArray = dateInput.split("/");
//        int day = Integer.parseInt(numberArray[0]);
//        int month = Integer.parseInt(numberArray[1]) - 1;
//        int year = Integer.parseInt(numberArray[2]) + 100;
//
//        date = new Date();
//        date.setMonth(month);
//        date.setYear(year);
//        date.setDate(day);
        try {
            if (temperatureInput.length() >= 2) {
                char fOrC = temperatureInput.charAt(0);
                if (fOrC == 'F' || fOrC == 'f') {
                    temperatureOutput = temperatureInput.substring(1) + " Fahrenheit";
                } else if (fOrC == 'C' || fOrC == 'c') {
                    temperatureOutput = temperatureInput.substring(1) + " Celsius";
                } else {
                    temperatureOutput = "Wrong temperature format!";
                }
            } else {
                temperatureOutput = "Wrong temperature format!";
            }
        } catch (Exception error) {
            System.out.print(error);
            temperatureOutput = "Wrong temperature format! " + error;

        }
        return "conversionResult.xhtml";
    }
}
