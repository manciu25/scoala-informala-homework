package com.java8.HW;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class that returns people with a given month and displays them alphabetically ordered too
 */
public class ReturnOutput {

    public static List<Person> display(List<Person> list, int targetMonth) {
        String q;
        if (targetMonth > 0 && targetMonth <= 9) {
            q = 0 + String.valueOf(targetMonth);
        } else q = String.valueOf(targetMonth);

        return list.stream()
                .filter(s -> s.getDateOfBirth().substring(5, 7).equals(q))
                .sorted(Comparator.comparing(Person::getLastName))
                .sorted(Comparator.comparing(Person::getFirstName))
                .collect(Collectors.toList());
    }

}
