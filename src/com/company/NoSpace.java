package com.company;

public class NoSpace {
    public static String noSPace(final String x) {
        StringBuilder sb = new StringBuilder();
        String[] arr = x.split(" ");
        for (String str : arr) sb.append(str);
        return sb.toString();
    }
}
