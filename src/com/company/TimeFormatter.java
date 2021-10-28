package com.company;

public class TimeFormatter {
    public static String formatDuration(int seconds) {
        if (seconds == 0) return "now";
        if (seconds == 1) return "1 second";
        int years = seconds / 31556952;
        int days = (seconds - (years * 31556952)) / 86400;
        int hours = (seconds - (years * 31556952) - (days * 86400)) / 3600 ;
        int minutes = (seconds - (years * 31556952) - (days * 86400) - (hours * 3600)) / 60;
        int sec = (seconds - (years * 31556952) - (days * 86400) - (hours * 3600) - (minutes * 60));

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









//        //add seconds to string
//        if (seconds == 1) sb.append("1 second");
//        if (seconds > 0 && seconds != 1) sb.append(sec + " seconds");
//
//        //prepend minutes to string
//        if (minutes == 1) sb.insert(0, minutes + " minute and ");
//        if (minutes > 1) sb.insert(0, minutes + " minutes and ");
//
//        //prepend hours to string
//        if (hours == 1) sb.insert(0, hours + " hour, ");
//        if (hours > 1) sb.insert(0, hours + " hours, ");
//
//        //prepend days to string
//        if (days == 1) sb.insert(0, days + " day, ");
//        if (days > 1) sb.insert(0, days + " days, ");
//
//        //prepend years to string
//        if (years == 1) sb.insert(0, years + " year, ");
//        if (years > 1) sb.insert(0, years + " years, ");

    }
}
