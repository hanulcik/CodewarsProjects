package com.company;

import java.util.ArrayList;

/*

CODE DOESNT WORK
 */


public class SplitString {
    public static String[] solution(String s) {
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arrList = new ArrayList<String>();

        for (char c : ch) {

            // every time
            sb.append(c);

            // after every pair
            if (sb.length() == 2) {
                arrList.add(sb.toString());
                sb.delete(0, 1);
            }

            // only if last char & solo
            if (c == ch[ch.length - 1] && sb.length() == 1) {
                sb.append("_");
                arrList.add(sb.toString());
                break;
            }
        }


        String[] strArr = new String[arrList.size()];
        int i = 0;
        for (String str : arrList) {
            strArr[i] = str;
            i++;
        }

        return strArr;
    }
}
