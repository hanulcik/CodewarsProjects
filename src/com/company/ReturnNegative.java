package com.company;

public class ReturnNegative {
    public static int makeNegative(int x) {
        if (x == 0) return 0;
        if (x < 0) return x;
        if (x > 0) return x*-1;
        return x;
    }
}
