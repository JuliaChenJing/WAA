/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@RequestScoped
public class AirlineInfoManagedBean {

    String selectedAirline;
    private List<AirlineInfo> airlineInfoList;
    private List<AirlineInfo> selectedAirlineInfoList;

    public List<AirlineInfo> getSelectedAirlineInfoList() {
        return selectedAirlineInfoList;
    }

    public void setSelectedAirlineInfoList(List<AirlineInfo> selectedAirlineInfoList) {
        this.selectedAirlineInfoList = selectedAirlineInfoList;
    }

    public String getSelectedAirline() {
        return selectedAirline;
    }

    public void setSelectedAirline(String selectedAirline) {
        this.selectedAirline = selectedAirline;
    }

    public AirlineInfoManagedBean() {
        airlineInfoList = new ArrayList<AirlineInfo>();
        airlineInfoList.add(new AirlineInfo("Amstardam", "New York", "12/11/06", "KLM", 790.80));
        airlineInfoList.add(new AirlineInfo("Amstardam", "New York", "12/11/06", "Morth West", 795.55));
        airlineInfoList.add(new AirlineInfo("Amstardam", "New York", "12/11/06", "KLM", 820.00));
        airlineInfoList.add(new AirlineInfo("Amstardam", "New York", "12/11/06", "United Airlines", 825.50));
        airlineInfoList.add(new AirlineInfo("Amstardam", "New York", "12/11/06", "North West", 875.00));
        airlineInfoList.add(new AirlineInfo("Amstardam", "New York", "12/11/06", "KLM", 989.00));
        airlineInfoList.add(new AirlineInfo("Amstardam", "New York", "12/11/06", "United Airlines", 1050.00));
        selectedAirlineInfoList = airlineInfoList;
    }

    public List<AirlineInfo> getAirlineInfoList() {
        return airlineInfoList;
    }

    public void setAirlineInfoList(List<AirlineInfo> airlineInfoList) {
        this.airlineInfoList = airlineInfoList;
    }

    public String[] airlineValue = {"All", "KLM", "North West", "United Airlines"};

    public String[] getAirlineValue() {
        return this.airlineValue;
    }

    public String submitAirline() {
        System.out.println("airline submitted");
        selectedAirline = "KLM";
        return "airlineInfo.xhtml";
    }

    public String resetToAll() {
        this.selectedAirline = "All";
        return "airlineInfo.xhtml";
    }

    public String selectedAirlineChanged(ValueChangeEvent e) {
        System.out.println(" selectedAirlineChanged");
        if (e.getNewValue().toString().equals("All")) {
            this.selectedAirlineInfoList = airlineInfoList;
        } else {
            this.selectedAirlineInfoList = getSelectedAirlineInfoList(e.getNewValue().toString());
        }
        return "airlineInfo.xhtml";
    }

    public List<AirlineInfo> getSelectedAirlineInfoList(String selectedAirline) {
        this.selectedAirlineInfoList = new ArrayList<AirlineInfo>();
        for (AirlineInfo item : airlineInfoList) {
            if (item.airline.equals(selectedAirline)) {
                this.selectedAirlineInfoList.add(item);
            }
        }
        return selectedAirlineInfoList;
    }
}
