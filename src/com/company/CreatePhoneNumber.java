package com.company;

public class CreatePhoneNumber {

    public static String createPhoneNumber(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        sb.append("(");

        for (int i = 0; i < 10; i++) {
            sb.append(numbers[i]);

            if (i == 2) sb.append(")" + " ");
            if (i == 5) sb.append("-");
        }
        return sb.toString();
    }
}
