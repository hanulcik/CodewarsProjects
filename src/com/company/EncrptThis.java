package com.company;

import java.util.Arrays;

public class EncrptThis {
    public static String encryptThis(String text) {
        String[] strArr = text.split(" ");
        StringBuilder sb = new StringBuilder();
        StringBuilder ab = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        if (text.length() == 0) return "";

        for (String s : strArr) {

            // special case: 1 char word
            if (s.length() == 1) {
                answer.append((int) s.charAt(0) + " ");
                continue;
            }

            //special case: 2 char word
            if (s.length() == 2) {
                int ascii = (int) s.charAt(0);
                s = s.substring(1);
                sb.append(ascii);
                sb.append(s);
                answer.append(sb + " ");
                sb.setLength(0);
                continue;
            }

            //special case: 3 char word
            if (s.length() == 3) {
                int ascii = (int) s.charAt(0);
                s = s.substring(1);
                ab.append(ascii);
                sb.append(s);
                sb.reverse();
                ab.append(sb);
                answer.append(ab + " ");
                sb.setLength(0);
                ab.setLength(0);
                continue;
            }

            //regular case
            else {
                int ascii = (int) s.charAt(0);
                char second = s.charAt(1);
                char last = s.charAt(s.length() - 1);
                s = s.substring(2, s.length() - 1);
                sb.append(ascii);
                sb.append(last);
                sb.append(s);
                sb.append(second);
                answer.append(sb + " ");
                sb.setLength(0);
            }
        }

        String str = answer.toString();
        if (str.endsWith(" ")) {
            answer.setLength(answer.length()-1);
        }

        return answer.toString();
    }
}
