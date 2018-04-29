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

@ManagedBean
@RequestScoped
public class AirlineInfoManagedBean {

    String selectedAirline;

    public String getSelectedAirline() {
        return selectedAirline;
    }

    public void setSelectedAirline(String selectedAirline) {
        this.selectedAirline = selectedAirline;
    }

    private List<AirlineInfo> airlineInfoList = new ArrayList<AirlineInfo>();

    public AirlineInfoManagedBean() {
        airlineInfoList.add(new AirlineInfo("Amstardam", "New York", "12/11/06", "KLM", 790.80));
        airlineInfoList.add(new AirlineInfo("Amstardam", "New York", "12/11/06", "Morth West", 795.55));
        airlineInfoList.add(new AirlineInfo("Amstardam", "New York", "12/11/06", "KLM", 820.00));
        airlineInfoList.add(new AirlineInfo("Amstardam", "New York", "12/11/06", "United Airlines", 825.50));
        airlineInfoList.add(new AirlineInfo("Amstardam", "New York", "12/11/06", "North West", 875.00));
        airlineInfoList.add(new AirlineInfo("Amstardam", "New York", "12/11/06", "KLM", 989.00));
        airlineInfoList.add(new AirlineInfo("Amstardam", "New York", "12/11/06", "United Airlines", 1050.00));
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

    public void submit() {
        selectedAirline = "KLM";
    }

    public void reset() {
        selectedAirline = "All";
    }
}
