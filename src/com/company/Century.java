package com.company;

public class Century {
    public static int century(int number) {
        if (number < 100) return 1;
        if (number % 100 == 0) return number / 100;
        else return number / 100 + 1;
    }
}
