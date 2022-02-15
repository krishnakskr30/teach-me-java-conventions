package com.tw.teachmeconventions.powerpackage;

public class PowerFinder {
    public static int baseRaisedToPower(int base, int power) {
        int product = 1;
        for (int iterator = 0; iterator<power; iterator++) {
            product *= base;
        }
        return product;
    }
}
