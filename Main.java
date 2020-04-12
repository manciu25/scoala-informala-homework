package com.JDBC.HW;

/**
 * Main class that checks the functionality of the program
 */
public class Main {

    public static void main(String[] args) {
        ProcessingMysql.insertInto(1, "q", "w", 2, "d", 1, 100.2, "winter");
        ProcessingMysql.roomPrice();
    }
}

