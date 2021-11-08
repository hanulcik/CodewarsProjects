package com.company;

import java.text.DecimalFormat;
import java.util.*;


public class Main {


    public static void main(String[] args) {

        List<String> a = new ArrayList<String>();
        a.add(":)");
        a.add("XD");
        a.add(":0}");
        a.add("x:-");
        a.add("):-");
        a.add("D:");

        System.out.println(countSmileys(a));
    }


    public static int countSmileys(List<String> arr) {
        int count = 0;

        for (String str : arr) {
            if ((str.contains(":)") || str.contains(":D") || str.contains(";)") || str.contains(";D") && str.length() == 2) || (
                str.contains(":-)") || str.contains(":-D") || str.contains(":~D") || str.contains(":~)")
                || str.contains(";-D") || str.contains(";-)") || str.contains(";~)") || str.contains(";~D") && str.length() == 3))
                count++;
        }
        return count;

    }
}








