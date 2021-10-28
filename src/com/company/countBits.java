package com.company;

public class countBits {
    public static int countBits(int n) {
        int sum = 0;
        String str = Integer.toBinaryString(n);
        char[] ch = str.toCharArray();
        for (char c : ch) {
            if (c == 1) sum += 1;
        }
        return sum;
    }
}
