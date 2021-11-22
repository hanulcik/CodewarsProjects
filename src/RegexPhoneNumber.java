public class RegexPhoneNumber {
    public static boolean validPhoneNumber(String phoneNumber) {
        String regex = "\\(\\d{3}\\) \\d{3}-\\d{4}";
        if (phoneNumber.matches(regex)) return true;
        return false;
    }
}
