package com.objectcontainers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** Class that contains:
 * Name of hobby (String)
 * Frequency (int) – how many times a week they practice their hobby
 * List of Addresses where the hobby can be practiced . Is stored in List<Adresa>
 */
public class Hobby {


    private String nameOfHobby;
    private int frequncy;


    private List<Address> listOfAddresses = new ArrayList<Address>();

    public List<Address> getListOfAddresses() {
        return listOfAddresses;
    }


    public void setNameOfHobby(String nameOfHobby) {
        this.nameOfHobby = nameOfHobby;
    }

    public void setFrequncy(int frequncy) {
        this.frequncy = frequncy;
    }

    public void setListOfAddresses(List<Address> listOfAddresses) {
        this.listOfAddresses = listOfAddresses;
    }

    public String getNameOfHobby() {
        return nameOfHobby;
    }

    public int getFrequncy() {
        return frequncy;
    }

    public Hobby(String nameOfHobby, int frequncy, List<Address> listOfAddresses) {
        this.nameOfHobby = nameOfHobby;
        this.frequncy = frequncy;
        this.listOfAddresses = listOfAddresses;
    }


}

