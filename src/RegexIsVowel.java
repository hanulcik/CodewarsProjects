public class RegexIsVowel {
    public static boolean isVowel(String s) {
        String regex = "[aeiouAEIOU]";
        if (s.matches(regex)) return true;
        return false;
    }
}
