
/**
 * A function that takes in a string of one or more words, and returns the same string,
 * but with all five or more letter words reversed.
 */

/**
 * author: Avery Hanulcik
 * date: 01 NOV 2021
 */

public class SpinWords {
    public static String spinwords(String sentence) {
        if (sentence.length() == 0 || sentence.length() == 1) return sentence;
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        String[] arr = sentence.split(" ");

        for (String word : arr) {
            if (word.length() < 5) {
                sb.append(word);
                sb.append(" ");
                continue;
            }
            temp.append(word);
            temp.reverse();
            sb.append(temp);
            temp.setLength(0);
            sb.append(" ");
        }

        sb.setLength(sb.length()-1);
        return sb.toString();

    }
}
