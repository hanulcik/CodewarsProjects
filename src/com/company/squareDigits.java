package com.company;

public class squareDigits {
    public int squareDigits(int n) {
        String str = String.valueOf(n);
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : ch) {
            int i = Character.getNumericValue(c);
            int square = i * i;
            sb.append(String.valueOf(square));
        }
        return Integer.parseInt(sb.toString());
    }
}
