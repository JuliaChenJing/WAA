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
public class CountryManagedBean {

    private String countryNameInput;
    private List<String> countryList = new ArrayList<>();
    private List<String> updatedCountryList = new ArrayList<>();

    public CountryManagedBean() {
        String[] locales = Locale.getISOCountries();
        for (String countryCode : locales) {
            Locale obj = new Locale("", countryCode);
            countryList.add(obj.getDisplayCountry());
        }
    }

    public void updateCountries() {
        updatedCountryList.clear();
        countryList.stream().filter((country) -> (country.toLowerCase().startsWith(countryNameInput.toLowerCase()) || country.startsWith(countryNameInput))).forEachOrdered((country) -> {
            updatedCountryList.add(country);
        });
    }

    public List<String> getUpdatedCountryList() {
        return updatedCountryList;
    }

    public void setUpdatedcountryList(List<String> updatedCountryList) {
        this.updatedCountryList = updatedCountryList;
    }

    public String getCountryNameInput() {
        return countryNameInput;
    }

    public void setCountryNameInput(String countryNameInput) {
        this.countryNameInput = countryNameInput;
    }

    public List<String> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<String> countryList) {
        this.countryList = countryList;
    }
}
