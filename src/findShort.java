public class findShort {
    public static int findShort(String s) {

        String[] words = s.split(" ");
        int low = words[0].length();

        for (String word : words) {
            if (word.length() < low) low = word.length();
        }
        return low;
    }
}
