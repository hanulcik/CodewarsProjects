package com.company;

public class PigLatin {
    public static String pigIt(String str) {
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();

        for (String s : arr) {

            // special punctuation cases
            if (s == "!" && s == arr[arr.length - 1]) {
                answer.append(" !");
                break;
            }
             else if (s == "!") {
                sb.append(" !");
                sb.setLength(0);
                continue;
            }

            // regular case
            String first = s.substring(0,1);
            s = s.substring(1, s.length());
            sb.append(s + first + "ay");
            if (answer.length() == 0) answer.append(sb);
            else answer.append(" " + sb);
            sb.setLength(0);
        }

        return answer.toString();
    }
}
