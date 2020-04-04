package com.java8.HW;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that tests ReadFromFile class
 */

public class ReadFromFileTest {
    List<Person> listPerson = new ArrayList<Person>();

    @Test
    public void readFromFileTestsTheSize() {
        try {
            listPerson = ReadFromFile.readingUsingStream(" inputfilename.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(3, listPerson.size());

    }

}
