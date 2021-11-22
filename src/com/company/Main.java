package com.company;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {


    public static void main(String[] args) {

        int[] test = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};


        System.out.println(Arrays.toString(sortArray(test)));
    }





    public static int[] sortArray(int[] array) {
        ArrayList<Integer> odds = new ArrayList<>();
        ArrayList<Integer> evens = new ArrayList<>();
        for (int i : array) {
            if (array[i] % 2 == 0) odds.add(i);
            if (array[i] % 2 != 0) evens.add(i);
        }
        Collections.sort(odds);
        int evenCount = 0; int oddCount = 0;
        for (int i : array) {
            if (array[i] % 2 == 0) { array[i] = evens.get(evenCount); evenCount++; }
            if (array[i] % 2 != 0) { array[i] = odds.get(oddCount); oddCount++; }
        }
        return array;
    }


}








