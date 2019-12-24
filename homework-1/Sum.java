package com.hm1ex1.main;

public class Sum {

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            sum = addSum(sum, i);
        }
        System.out.println(sum);
    }

    public static int addSum(int sum, int i){
        return sum+i;
    }
}
