/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class TravelInformationJSFManagedBean {

    String from;
    String to;
    String departureDate;
    String returnDate;

    boolean firstClass;
    boolean exactTheseDates;
    boolean noStopover;
    String options = "";

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public void setInactive(boolean inactive) {
        this.inactive = inactive;
    }
    boolean inactive;

    public boolean isFirstClass() {
        return firstClass;
    }

    public void setFirstClass(boolean firstClass) {
        this.firstClass = firstClass;
    }

    public boolean isExactTheseDates() {
        return exactTheseDates;
    }

    public void setExactTheseDates(boolean exactTheseDates) {
        this.exactTheseDates = exactTheseDates;
    }

    public boolean isNoStopover() {
        return noStopover;
    }

    public void setNoStopover(boolean noStopover) {
        this.noStopover = noStopover;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String submit() {
        if (this.firstClass) {
            this.options = this.options + "first Class";
        }

        if (this.exactTheseDates) {
            if (!this.options.equals("")) {
                this.options = this.options + ",";
            }
            this.options = this.options + "exact these dates";
        }
        if (this.noStopover) {
            if (!this.options.equals("")) {
                this.options = this.options + ",";
            }
            this.options = this.options + "no stopover";
        }
        return "travelInformationSubmitSuccess.xhtml";
    }
}
