package com.company;

public class School {
    public static int getAverage(int[] marks) {
        int sum = 0;
        int count = 0;
        for (int i : marks) {
            sum += i;
            count++;
        }
        return sum / count;
    }
}
