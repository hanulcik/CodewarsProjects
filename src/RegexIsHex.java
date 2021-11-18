/**
 * Given a string, return true if string is a valid Hex.
 */

public class RegexIsHex {

    public static boolean isHexNumber(String s) {
        String regex = "[A-F0-9]+";
        if (s.matches(regex)) return true;
        return false;
    }
}
