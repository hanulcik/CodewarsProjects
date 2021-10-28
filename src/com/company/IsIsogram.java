package com.company;

public class IsIsogram {
    public static boolean isIsogram(String str) {
        int i = 0;
        str.toLowerCase();
        char[] ch = str.toCharArray();
        for (char c : ch) {
            for (char e : ch) {
                if (c == e) return false;
            }
        }
        return true;
    }
}
