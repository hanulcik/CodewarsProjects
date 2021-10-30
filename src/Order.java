
/*
Create a function that accepts a string in which each word contains one digit.
Arrange the string such that the words are ordered according to the number in each word.
Return a string in the correct order.
 */

//author: Avery Hanulcik
//date: 30 OCT 2021


public class Order {
    public static String order(String words) {
        StringBuilder sb = new StringBuilder();
        if (words == "") return "";

        //split string into string[] and create empty string of same length
        String[] wordArr = words.split(" ");
        String[] answerArr = new String[wordArr.length];

        //find position # and insert words into empty array according to position
        for (String word : wordArr) {
            String numberInString = word.replaceAll("[^0-9]", "");
            int position = Integer.parseInt(numberInString);
            answerArr[position - 1] = word;
        }

        //append new array's words to empty string
        for (String word : answerArr) {
            sb.append(word + " ");
        }

        //clean up string to match desired output
        String str = sb.toString();
        str = str.substring(0,str.length() - 1);

        return str;
    }
}
