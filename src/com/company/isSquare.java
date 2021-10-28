package com.company;

public class isSquare {
    public static boolean isSquare(int n) {
        if (n == 0) return true;
        if (n < 0) return false;
        double d = Math.sqrt(n);
        double lo = Math.floor(d);
        if (d != lo) return false;
        return true;
    }
}
