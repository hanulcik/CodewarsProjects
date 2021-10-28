package com.company;

public class squareSUm {
    public static int squareSum(int[] n) {
        int sum = 0;
        for (int i : n) {
            if (i == 0) continue;
            sum += (i * 2);
        }
        return sum-1;
    }
}
