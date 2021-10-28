package com.company;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String str = String.valueOf(num);
        char[] charr = str.toCharArray();
        int[] intarr = new int[charr.length];
        int count = 0;
        for (char c : charr) {
            int i = Character.getNumericValue(c);
            intarr[count] = i;
            count++;
        }
        Arrays.sort(intarr);
        Collections.reverse(Arrays.asList(intarr));
        StringBuilder sb = new StringBuilder();
        for (int i : intarr) sb.append(String.valueOf(i));
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }
}
