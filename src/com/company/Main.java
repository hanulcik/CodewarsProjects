package com.company;

import java.text.DecimalFormat;
import java.util.*;


public class Main {


    public static void main(String[] args) {

        String test = "apples, pears # and bananas\ngrapes\nbananas !apples";
        String[] symbols = {"#", "!"};

        System.out.println(stripComments(test, symbols));
//        System.out.println(indexSymbol(test, symbols));
    }




        public static String stripComments(String text, String[] commentSymbols) {
            int totalSteps = text.length();
            int counter = 0;

            while (containsSymbol(text, commentSymbols) && counter < totalSteps) {
                int indexNewline = text.indexOf("\n", indexSymbol(text, commentSymbols));
                if (indexNewline == -1) indexNewline = text.length() - 1;
                String comment = text.substring(indexSymbol(text, commentSymbols), indexNewline);
                text = text.substring(0, indexSymbol(text, commentSymbols)) + text.substring(indexNewline, text.length()-1);
                counter++;
            }

//            if (text.endsWith(" ")) text = text.substring(0, text.length() - 1);

            return text;
        }






        public static boolean containsSymbol(String text, String[] symbols) {
            for (int k = 0; k < symbols.length; k++) if (text.contains(symbols[k])) return true;
            return false;
        }

        public static int indexSymbol(String text, String[] symbols) {
            int index = 0;
            char[] array = text.toCharArray();
            for (char ch : array) {
                if (isSymbol(ch, symbols)) return index;
                index++;
            }
            return -1;
        }

        public static boolean isSymbol(char c, String[] commentSymbols) {
            for (int k = 0; k < commentSymbols.length; k++) if (commentSymbols[k].charAt(0) == c) return true;
            return false;
        }
}








