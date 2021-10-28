package com.company;

public class MissingLetter {
    public static char findMissingLetter(char[] array) {
       int[] intArr = new int[array.length];
       int counter = 0;
       int first = 0;
       int second = 1;
       if (array.length == 0) return array[0];

       // convert char[] to int[]
       for (char c : array) {
           intArr[counter] = (int) c;
       }

       for (int i : intArr) {
           if (intArr[second] - intArr[first] != 1) return (char) Character.getNumericValue(intArr[second] - 1);
       }

       return array[0];

    }
}
