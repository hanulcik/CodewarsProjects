public class RegexPinCode {
    public static boolean validatePin(String pin) {
        String regex = "\\d{4}";
        String regex2 = "\\d{6}";
        if (pin.matches(regex) || pin.matches(regex2)) return true;
        return false;
    }
}
