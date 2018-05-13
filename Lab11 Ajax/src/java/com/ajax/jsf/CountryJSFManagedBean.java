/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ajax.jsf;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CountryJSFManagedBean {

    private String countryName;
    private List<String> countryList = new ArrayList<>();
    private List<String> newCountryList = new ArrayList<>();

    public CountryJSFManagedBean() {
        String[] locales = Locale.getISOCountries();
        for(String countryCode: locales){
            Locale obj = new Locale("", countryCode);
            countryList.add(obj.getDisplayCountry());
        }
    }
   
    public void updatedCountries(){
        newCountryList.clear();
        countryList.stream().filter((country) -> (country.toLowerCase().startsWith(countryName.toLowerCase()) || country.startsWith(countryName))).forEachOrdered((country) -> {
            newCountryList.add(country);
        });
    }
    
    public List<String> getNewCountryList() {
        return newCountryList;
    }

    public void setNewcountryList(List<String> newCountryList) {
        this.newCountryList = newCountryList;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public List<String> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<String> countryList) {
        this.countryList = countryList;
    }
}
