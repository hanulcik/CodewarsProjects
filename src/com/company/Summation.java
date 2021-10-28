package com.company;

public class Summation {
    public static int summation(int n) {
        int i = 0;
        int sum = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        return sum;
    }
}
