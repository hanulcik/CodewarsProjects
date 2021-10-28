package com.company;

import java.util.*;


public class Main {


    public static void main(String[] args) {

        int test = 165556797;
        int test2 = 62;
        int testWrongDays = 132116640;
        int test3 = 4494198;
        System.out.println(formatDuration(testWrongDays));
    }


    public static String formatDuration(int seconds) {
        if (seconds == 0) return "now";
        if (seconds == 1) return "1 second";
        int years = seconds / 31536000;
        int days = (seconds - (years * 31536000)) / 86400;
        int hours = (seconds - (years * 31536000) - (days * 86400)) / 3600 ;
        int minutes = (seconds - (years * 31536000) - (days * 86400) - (hours * 3600)) / 60;
        int sec = (seconds - (years * 31536000) - (days * 86400) - (hours * 3600) - (minutes * 60));

        StringBuilder sb = new StringBuilder();

        if (years == 1) sb.append(years + " year");
        if (years > 1) sb.append(years + " years");
        if (days >= 1) sb.append(", ");

        //append days to string
        if (days == 1) sb.append(days + " day");
        if (days > 1) sb.append(days + " days");
        if (hours >= 1) sb.append(", ");

        //append hours to string
        if (hours == 1) sb.append(hours + " hour");
        if (hours > 1) sb.append(hours + " hours");
        if (minutes >= 1) sb.append(", ");

        //append minutes to string
        if (minutes == 1) sb.append(minutes + " minute");
        if (minutes > 1) sb.append(minutes + " minutes");
        if (sec >= 1 ) sb.append(" and ");

        //append seconds to string
        if (sec == 1) sb.append(sec + " second");
        if (sec > 1) sb.append(sec + " seconds");


        if (sb.charAt(0) == ',') {
            sb.reverse();
            sb.setLength(sb.length()-2);
            sb.reverse();
        }

        int last = sb.lastIndexOf(",");
        if (sec == 0 && last !=-1) sb.replace(last, last+1, " and");

        return sb.toString();
    }


}
