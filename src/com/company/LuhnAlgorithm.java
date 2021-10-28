package com.company;

public class LuhnAlgorithm {
    public static boolean validate(String n) {
        int[] intArr = new int[n.length()];
        char[] ch = n.toCharArray();
        int counter = 0;

        //convert input string to int[]
        for (char c : ch) {
            intArr[counter] = Character.getNumericValue(c);
            counter++;
        }
        counter = 0;

        //2 cases, int[].length == even or odd
        //case 1: even
        if (intArr.length % 2 == 0) {
            for (int i : intArr) {
                if (counter % 2 != 0) {
                    counter++;
                    continue;
                }
                int k = i * 2;
                if (k > 9) k -= 9;
                intArr[counter] = k;
                counter++;
            }
            counter = 0;
        }

        //case 2: odd
        if (intArr.length % 2 != 0) {
            for (int i : intArr) {
                if (counter % 2 == 0) {
                    counter++;
                    continue;
                }
                int k = i * 2;
                if (k > 9) k -= 9;
                intArr[counter] = k;
                counter++;
            }
            counter = 0;
        }


        //sum final digits
        int sum = 0;
        for (int i : intArr) sum += i;

        if (sum % 10 == 0) return true;
        return false;


    }
}
