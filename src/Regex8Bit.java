/**
 * Given an integer in base 10, return true if the number can be represented as an 8-bit unsigned binary.
 * Return false if not.
 */

//author: Avery Hanulcik
//date: 18 NOV 2021


public class Regex8Bit {
    public static boolean eightBitNumber(String n) {
        if (n.startsWith("+")
                || n.startsWith("-")
                || n.contains("\n")
                || n == ""
                || n.endsWith(" ")
                || n.startsWith(" ")
                || (n.startsWith("0") && n.length() > 1)) return false;
        int i = Integer.parseInt(n);
        String str = Integer.toBinaryString(i);
        String regex = "[01]{0,8}";
        if (str.matches(regex)) return true;
        return false;
    }
}
