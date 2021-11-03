import java.util.ArrayList;

public class Snail {
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
