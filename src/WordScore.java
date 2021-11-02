/**
 * Given a string of words, find the highest scoring word.
 * Each letter of a word scores points according to its position in the alphabet.
 * ex: a=1, b=2, c=3, etc.
 * Return the highest scoring word as a string, if there is a tie return the
 * word that appears earliest in the original string.
 */

//author: Avery Hanulcik
//date: 02 NOV 2021

public class WordScore {
    public static String high(String s) {

        String highestWord = "";
        int topScore = 0;
        int wordScore = 0;
        int score = 0;
        String[] arr = s.split(" ");

        for (String word : arr) {
            char[] chArr = word.toCharArray();

            for (char c : chArr) {
                score = (int) c - 96;
                wordScore += score;
            }

            if (wordScore > topScore) {
                topScore = wordScore;
                highestWord = word;
            }

            wordScore = 0;
            score = 0;
        }
        return highestWord;
    }
}
