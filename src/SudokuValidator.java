import java.util.Arrays;

/**
 * A function that accepts a 9x9 grid of integers representing a sudoku board.
 * Returns true if valid, false if invalid.
 * Zeros count as empty spaces (which invalidates solution).
 */

//author: Avery Hanulcik
//date: 03 NOV 2021


public class SudokuValidator {
    public static boolean check(int[][] sudoku) {
        StringBuilder sb = new StringBuilder();
        int[] holder = new int[9];

        //row-by-row starting at top
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++){
                holder[col] = sudoku[row][col];
            }
            if (oneThruNine(holder) == false) return false;
        }

        //column-by-column starting at left
        for (int col = 0; col < 9; col++) {
            for (int row = 0; row < 9; row++) {
                holder[row] = sudoku[row][col];
            }
            if (oneThruNine(holder) == false) return false;
        }

        //3x3 grid by grid starting top left
        int row = 3;
        int col = 3;
        int count = 0;

        while (row <= 9) {

            for (int i = row - 3; i < row; i++) {
                for (int k = col - 3; k < col; k++) {
                    holder[count] = sudoku[i][k];
                }
                if (oneThruNine(holder) == false) return false;
                count = 0;
            }
            row += 3;
            col += 3;
        }


        return true;
    }


    /**
     * Accepts an int[] and determines if it contains all numbers 1..9.
     * @param input
     * @return
     */

    public static boolean oneThruNine(int[] input) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(input);

        for (int i : input) {
            sb.append(i);
        }

        if (sb.toString() == "123456789") {
            return true;
        }
        return false;
    }


}
