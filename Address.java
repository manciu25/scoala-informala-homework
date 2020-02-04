package com.objectcontainers;

/**
 * Address class that contains:
 * Street of this address (String)
 * Country in which the address exists (Country)
 */
public class Address {

    private String streetOfThisAddress;
    private Country country;

    public void setStreetOfThisAddress(String streetOfThisAddress) {
        this.streetOfThisAddress = streetOfThisAddress;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getStreetOfThisAddress() {
        return streetOfThisAddress;
    }

    public Country getCountry() {
        return country;
    }

    public Address(String streetOfThisAddress, Country country) {
        this.streetOfThisAddress = streetOfThisAddress;
        this.country = country;
    }
}
