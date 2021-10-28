package com.company;

// code no worky worky

public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {
        StringBuilder aArr = new StringBuilder();
        StringBuilder bArr = new StringBuilder();

        // account for empty array
        if (a.length == 0) return a;
        if (b.length == 0) return a;

        // convert b to char array
        for (int i : b) bArr.append(i);
        String bStr = bArr.toString();

        // if a isn't in b, add it
        for (int i : a) {
            if (bStr.charAt((char) i) == -1) aArr.append(i);
        }

        String str = aArr.toString();
        char[] ch = str.toCharArray();
        int[] answer = new int[ch.length];
        int counter = 0;
        for (char c : ch) {
            answer[counter] = Character.getNumericValue(c);
        }

        return answer;
    }
}
