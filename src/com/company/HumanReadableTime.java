package com.company;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        StringBuilder sb = new StringBuilder();
        int hh = (int) (seconds / 3600);
        int mm = (int) ((seconds - (3600 * (int)(seconds / 3600))) / 60);
        int ss = (seconds - (3600 * (int)(seconds / 3600))) - (60 * mm);

        if (hh < 10) sb.append(0 + hh);
        else sb.append(hh);
        sb.append(":");

        if (mm < 10) sb.append(0 + mm);
        else sb.append(mm);
        sb.append(":");

        if (ss < 10) sb.append(0 + ss);
        else sb.append(ss);

        return sb.toString();







//        sb.append(hh + ":" + mm + ":" + ss);
//        return sb.toString();
    }
}
