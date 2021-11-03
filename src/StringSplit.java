/**
 * documentation needed
 */

//author: Avery Hanulcik
//date: 02 NOV 2021

import java.util.ArrayList;

public class StringSplit {
    public static String[] solution(String s) {

        // create arraylist, stringbuilder and convert to char array
        ArrayList<String> answer = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();

        // if _ needs to be added
        if ((s.length() % 2) != 0) {
            char[] newArr = new char[arr.length + 1];
            for (int i = 0; i < newArr.length; i++) newArr[i] = arr[i];
            newArr[newArr.length - 1] = '_';

            for (int i = 0; i < newArr.length; i++) {
                sb.append(arr[i]);
                if (i % 2 == 0 && i != 0) {
                    answer.add(sb.toString());
                    sb.setLength(0);
                    continue;
                }
            }
            return (String[]) answer.toArray();
        }

        //if _ does not need to be added
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i % 2 == 0 && i != 0) {
                answer.add(sb.toString());
                sb.setLength(0);
                continue;
            }
        }

        return (String[]) answer.toArray();

    }
}
