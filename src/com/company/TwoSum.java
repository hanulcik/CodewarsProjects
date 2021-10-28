package com.company;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int first = 0;
        int[] answer = new int[2];

        while (i != numbers.length) {
            first = numbers[i];
            for (int h = i+1; i < numbers.length; h++) {
                int second = numbers[h];
                if (first + second == target) {
                    answer[0] = i;
                    answer[1] = h;
                    return answer;
                }
            }
            i++;
        }
        return answer;
    }
}
