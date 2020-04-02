package com.ioconcurrency;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**Class that reads from files persons and returns the list with them*/

public class ReadingPerson {

    public static ArrayList<Person> readFromFile(String fileName) throws IOException {
        ArrayList<Person> arrayPerson = new ArrayList<Person>();

        {
            BufferedReader bf = null;
            try {
                bf = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
                String val = "";

                while ((val = bf.readLine()) != null) {
                    String[] splitArray = val.split(",");
                    Gender gender = null;
                    if (isNumeric(splitArray[2])) {
                        gender = Gender.valueOfType(Integer.parseInt(splitArray[2]));
                    } else {
                        gender = Gender.valueOf(splitArray[2]);
                    }
                    Person p = new Person(splitArray[0], splitArray[1], gender);
                    arrayPerson.add(p);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                bf.close();
            }
        }
        return arrayPerson;
    }

    public static boolean isNumeric(String strNum) {
        Pattern pattern = Pattern.compile("\\d+");
        if (strNum == null) {
            return false;
        }
        return pattern.matcher(strNum).matches();
    }
}
