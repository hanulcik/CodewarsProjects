package com.company;

import java.text.DecimalFormat;
import java.util.*;


public class Main {


    public static void main(String[] args) {

        int[][] test1 = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        double[] d = {1,1,1};
        double dbl = 5;
        System.out.println(Arrays.toString(tribonnaci(d,10)));
        System.out.println(dbl);
    }



    public static double[] tribonnaci(double[] s, int n) {

        if (n < 3) return new double[]{};
        DecimalFormat format = new DecimalFormat("0.#");

        ArrayList<Double> sequence = new ArrayList<Double>();
        for (double d : s) sequence.add(d);
        int lo = 0;

        while (lo < n-3) {

            Double sum = sequence.get(lo) + sequence.get(lo+1) + sequence.get(lo+2);
            sequence.add(sum);
            lo++;

        }

        return sequence.stream().mapToDouble(Double::doubleValue).toArray();
    }


    }




