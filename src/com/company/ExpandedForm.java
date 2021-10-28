package com.company;

public class ExpandedForm {
    public static String expandedForm(int num) {
        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        char[] ch = String.valueOf(num).toCharArray();
        int numOfZeros = ch.length -1;
        int counter = numOfZeros;
        int trigger = 0;

        for (char c : ch) {
            if (trigger == ch.length -1) {
                answer.append(" + " + sb);
                break;
            }
            if (c == '0') {
                trigger++;
                numOfZeros--;
                counter = numOfZeros;
                continue;
            }
            sb.append(c);
            while (counter > 0) {
                sb.append(0);
                counter--;
            }
            numOfZeros--;
            if (trigger == 0) answer.append(sb);
            else answer.append(" + " + sb);
            sb.setLength(0);
            trigger++;
            counter = numOfZeros;
        }

        return answer.toString();
    }
}
