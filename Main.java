package com.objectcontainers;

import java.util.*;

/**
 * Class that tests the functionality of the program
 */
public class Main {

    public static void main(String[] args) {
        Persoane person1 = new Persoane("Liza1", 26);
        Persoane person2 = new Persoane("Liza2", 25);
        Persoane person3 = new Persoane("Liza3", 28);

        System.out.println(person1);

        /**TreeSet that stores the persons in reverse order, by age */

        TreeSet<Persoane> persoaneTreeSet = new TreeSet<Persoane>(new ComparatorForAgeInReverseOrder());
        persoaneTreeSet.add(person1);
        persoaneTreeSet.add(person2);
        persoaneTreeSet.add(person3);

        for (Persoane element : persoaneTreeSet) {
            System.out.println(element.getName() + " " + element.getAge());
        }
/** Creating the list of hobbies*/

        Country country = new Country("Romania", "+40");
        Country country1 = new Country("Greece", "+30");
        Country country3 = new Country("France", "+33");

        List<Address> addressList = new ArrayList<Address>();
        addressList.add(new Address("Galaxiei", country));
        addressList.add(new Address("Aiolou Street", country1));
        addressList.add(new Address("Champs Elysées", country3));

        List<Hobby> hobbyList = new ArrayList<Hobby>();
        hobbyList.add(new Hobby("Volei", 2, addressList));
        hobbyList.add(new Hobby("Fotbal", 3, addressList));
        hobbyList.add(new Hobby("Dans", 6, addressList));

        HashMap<Persoane, List<Hobby>> infoPersoane = new HashMap<>();
        infoPersoane.put(person1, hobbyList);
        infoPersoane.put(person2, hobbyList);
        infoPersoane.put(person3, hobbyList);

        System.out.println("detalii pers1");
        printTheNamesOfTheHobbiesAndTheCountries(infoPersoane, person1);

    }

    /**
     * Method that takes two argumets: <Persoana, List<Hobby>> and Person.
     * The method prints the names of the hobbies and the countries
     * where it can be practiced of the person passed as an argument,
     * by looking for the hobbies of that person in the HashMap.
     */

    public static void printTheNamesOfTheHobbiesAndTheCountries(HashMap<Persoane, List<Hobby>> infoPersoane, Persoane persoane) {

        List<Hobby> hobbyList = infoPersoane.get(persoane);
        for (Hobby q : hobbyList) {
            System.out.println(q.getNameOfHobby());
            for (Address w : q.getListOfAddresses()) {
                System.out.println(w.getCountry().getNameOfTheCountry());
            }
        }
    }
}
