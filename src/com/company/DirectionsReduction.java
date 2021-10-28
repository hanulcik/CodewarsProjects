package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DirectionsReduction {
    public static String[] dirReduc(String[] arr) {
        if (arr.length == 2) return arr;
        List<String> list = new ArrayList<String>();
        Collections.addAll(list, arr);

        int first = 0;
        int second = 1;

        for (int k = 0; second < list.size(); k++) {

            if (list.get(first) == "NORTH" && list.get(second) == "SOUTH") {
                list.remove(second);
                list.remove(first);
                first = 0;
                second = 1;
                continue;
            }

            if (list.get(first) == "SOUTH" && list.get(second) == "NORTH") {
                list.remove(second);
                list.remove(first);
                first = 0;
                second = 1;
                continue;
            }

            if (list.get(first) == "EAST" && list.get(second) == "WEST") {
                list.remove(second);
                list.remove(first);
                first = 0;
                second = 1;
                continue;
            }

            if (list.get(first) == "WEST" && list.get(second) == "EAST") {
                list.remove(second);
                list.remove(first);
                first = 0;
                second = 1;
                continue;
            }

            first++;
            second++;

        }

        String[] strArr = (list.toString()).split(" ");


        return strArr;

    }
}


