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
    private List<String> fullCountryList = new ArrayList<>();
    private List<String> filteredCountryList = new ArrayList<>();

    public CountryManagedBean() {
        String[] locales = Locale.getISOCountries();
        for (String countryCode : locales) {
            Locale obj = new Locale("", countryCode);
            fullCountryList.add(obj.getDisplayCountry());
        }
    }

    public void filterCountryList() {
        filteredCountryList.clear();
        fullCountryList
                .stream()
                .filter(
                        (country)
                        -> (country.toLowerCase()
                                .startsWith(countryNameInput.toLowerCase()) || country.startsWith(countryNameInput)))
                .forEachOrdered(
                        (country)
                        -> {
                    filteredCountryList.add(country);
                });
    }

    public List<String> getFilteredCountryList() {
        return filteredCountryList;
    }

    public void setFilteredcountryList(List<String> filteredCountryList) {
        this.filteredCountryList = filteredCountryList;
    }

    public String getCountryNameInput() {
        return countryNameInput;
    }

    public void setCountryNameInput(String countryNameInput) {
        this.countryNameInput = countryNameInput;
    }

    public List<String> getFullCountryList() {
        return fullCountryList;
    }

    public void setFullCountryList(List<String> countryList) {
        this.fullCountryList = countryList;
    }
}
