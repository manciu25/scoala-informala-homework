package com.java8.HW;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that tests ReturnOutput class
 */
public class ReturnOutputTest {

    @Test

    public void ValidatesReturnOutput() {

        List<Person> list = new ArrayList<Person>();
        Person p = new Person("Manciu", "Elisabeth", "1993-09-25");
        list.add(p);
        list.add(p);
        list.add(p);

        Assert.assertEquals(3, ReturnOutput.display(list, 9).size());
    }

}
