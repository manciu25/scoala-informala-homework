package com.ski.biathlons;

import java.util.Objects;

public class Util {
    public static long shooting(String shooting) {
       return shooting.chars().filter(ch -> ch == 'o').count();

    }

}
