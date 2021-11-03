/**
 * A function that traverses a 2 dimensional array in a clockwise spiral.
 * array[][] { {1,2,3},{4,5,6},{7,8,9} } returns {1,2,3,6,9,8,7,4,5}.
 * Answer is returned an as an int[].
 */

//author: Avery Hanulcik
//date: 03 NOV 2020


import java.util.ArrayList;

public class Snail {
    public static int[] snail(int[][] array) {

        ArrayList<Integer> answer = new ArrayList<Integer>();

        int size = array.length * array[0].length;     // total size of array (l*w)
        int step = 0;                                  // used to track number of actions taken

        int rowMin = 0;
        int colMin = 0;
        int rowMax = array[0].length-1;
        int colMax = array.length-1;

        while (step != size) {                         // quit once # of actions == size of array[][]

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
