public class BackspacesInString {
    public static String cleanString(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '#' && sb.length() == 0) continue;
            if (c == '#') sb.deleteCharAt(sb.length()-1);
            if (c != '#') sb.append(s);
        }
        return sb.toString();
    }
}
