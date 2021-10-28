package com.company;

public class GetXO {
    public static boolean getXO(String str) {
        str.toLowerCase();
        char[] ch = str.toCharArray();
        int xCount = 0;
        int yCount = 0;
        for (char c : ch) {
            if (c == 'x')
                xCount++;
            if (c == 'y')
                yCount++;
        }
        if (xCount != yCount)
            return false;
        return true;
    }
}
