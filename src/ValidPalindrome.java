import java.util.Locale;

/**
 * Given a string, determine if palindrome.
 * Ignore case and non alpha-numeric characters.
*/

//author: Avery Hanulcik
//date: 14 DEC 2021

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase(Locale.ROOT);
        s = s.replaceAll("[^a-z_0-9]", "");
        sb = sb.append(s);
        sb = sb.reverse();
        char[] sbArr = sb.toString().toCharArray();
        char[] regularArr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) if (sbArr[i] != regularArr[i]) return false;
        return true;
    }
}
