package com.company;

public class CamelCase {
    static String toCamelCase(String s) {
        if (s == "") return "";
        StringBuilder sb = new StringBuilder();
        String regex = "";
        if (s.contains("-")) {
            regex = "-";
        }
        if (s.contains("_")) {
            regex = "_";
        }
        String[] arr = s.split(regex);

        for (String str : arr) {

            // special first case
            if (str == arr[0]) {
                char[] firstArr = str.toCharArray();
                Character firstChar = firstArr[0];
                if (!Character.isUpperCase(firstChar)) {
                    sb.append(str);
                    continue;
                }
            }

            // do for every word after first
            str = str.substring(0,1).toUpperCase() + str.substring(1);
            sb.append(str);
        }

        // sb.append(str.substring(0,1).toUpperCase() + s.substring(1))
        return sb.toString();
    }
}
