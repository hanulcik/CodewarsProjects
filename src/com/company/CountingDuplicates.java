package com.company;

import java.util.Arrays;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        String str = text.toLowerCase();

        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        Arrays.sort(ch);
        int i = 1;
        int count = 0;

        for (char c : ch) {
            if (c == ch[i]) {
                if (sb.indexOf(String.valueOf(c)) != -1) {
                    i++;
                    continue;
                }
                count++;
                if (i == ch.length-1) break;
                i++;
                sb.append(c);
                continue;
            }
            if (i == ch.length-1) break;
            i++;
        }
        return count;
    }
}
