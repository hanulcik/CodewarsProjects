package com.company;

public class HighAndLow {

    public static String highAndLow(String numbers) {
        String[] arr = numbers.split(" ");
        int hi = Integer.parseInt(arr[0]);
        int lo = Integer.parseInt(arr[0]);
        for (String s : arr) {
            int i = Integer.parseInt(s);
            if (i > hi) hi = i;
            if (i < lo) lo = i;
        }
        return (hi + " " + lo);
    }
}
