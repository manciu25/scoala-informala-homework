package com.objectcontainers;

/**
 * Country class that contains:
 * Name of the country (String)
 * Code of the country (String)
 */
public class Country {


    private String nameOfTheCountry;
    private String codeOfTheCountry;

    public void setNameOfTheCountry(String nameOfTheCountry) {
        this.nameOfTheCountry = nameOfTheCountry;
    }

    public void setCodeOfTheCountry(String codeOfTheCountry) {
        this.codeOfTheCountry = codeOfTheCountry;
    }

    public String getNameOfTheCountry() {
        return nameOfTheCountry;
    }

    public String getCodeOfTheCountry() {
        return codeOfTheCountry;
    }

    public Country(String nameOfTheCountry, String codeOfTheCountry) {
        this.nameOfTheCountry = nameOfTheCountry;
        this.codeOfTheCountry = codeOfTheCountry;
    }
}
