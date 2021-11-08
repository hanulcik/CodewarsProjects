/**
 * A function that accepts a word as a string. Convert each character to a parenthesis.
 * "(" if character appears only once, ")" if character appears more than once.
 * Ignore capitalization.      "Success"  =>  ")())())"
 */

//author: Avery Hanulcik
//date: 04 NOV 2021


public class DuplicateEncoder {
    public static String encode(String word) {
        StringBuilder sb = new StringBuilder();

        for (char c : word.toCharArray()) {
            if (!isDuplicate(c, word)) sb.append(')');
            else sb.append('(');
        }
        return sb.toString();
    }




    public static boolean isDuplicate(char ch, String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) count++;
        }
        if (count > 1) return false;
        return true;
    }


}
