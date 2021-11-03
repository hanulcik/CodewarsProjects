package com.company;

import java.util.*;


public class Main {


    public static void main(String[] args) {

        int[][] threeByThree = { {1,2,3},
                                 {4,5,6},
                                 {7,8,9} };

        int[][] fourByFour = { {1,2,3,4},
                               {5,6,7,8},
                               {9,10,11,12},
                               {13,14,15,16}};

        System.out.println(Arrays.toString(snail(threeByThree)));
    }



    public static int[] snail(int[][] array) {

        ArrayList<Integer> answer = new ArrayList<Integer>();

        int size = array.length * array[0].length;
        int step = 0;

        int rowMin = 0;
        int colMin = 0;
        int rowMax = array[0].length-1;
        int colMax = array.length-1;

        while (step != size) {

            //left to right
            for (int i = colMin; i <= colMax; i++) {
                answer.add(array[rowMin][i]);
                step++;
            }
            rowMin++;

            if (step == size) break;

            //top to bottom
            for (int k = rowMin; k <= rowMax; k++) {
                answer.add(array[k][colMax]);
                step++;
            }
            colMax--;

            if (step == size) break;

            //right to left
            for (int a = colMax; a >= colMin; a--) {
                answer.add(array[rowMax][a]);
                step++;
            }
            rowMax--;

            if (step == size) break;

            //bottom to top
            for (int b = rowMax; b >= rowMin; b--) {
                answer.add(array[b][colMin]);
                step++;
            }
            colMin++;

        }

        int[] arr = answer.stream().mapToInt(i -> i).toArray();
        return arr;
    }

    }



