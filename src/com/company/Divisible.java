package com.company;

public class Divisible {
    public static boolean isDivisible(long n, long x, long y) {
        if (n % x != 0) return false;
        if (n % y != 0) return false;
        return true;
    }
}
