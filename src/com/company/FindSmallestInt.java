package com.company;

public class FindSmallestInt {
    public static int findSmallestInt(int[] args) {
        int lo = args[0];
        for (int i : args) {
            if (i < lo) lo = i;
        }
        return lo;
    }
}
