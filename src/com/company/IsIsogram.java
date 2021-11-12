package com.company;

public class IsIsogram {
    public static boolean isIsogram(String str) {
        int i = 0;
        str.toLowerCase();
        char[] ch = str.toCharArray();
        for (char c : ch) {
            if (str.lastIndexOf(c) == str.indexOf(c)) return false;
        }
        return true;
    }
}
