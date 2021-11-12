import java.util.ArrayList;

/**
 * A function that accepts 3 numbers and adds to the sequence by summing the previous 3 numbers.
 * Repeat n times and return the sequence.
 */

//author: Avery Hanulcik
//date: 03 NOV 2021


public class Tribonacci {
    public double[] tribonaci(double[] s, int n) {
        if (n == 0) return new double[]{};
        if (n == 1) return new double[]{s[0]};
        if (n == 2) return new double[]{s[0], s[1]};
        if (n == 3) return new double[]{s[0], s[1], s[2]};

        ArrayList<Double> sequence = new ArrayList<Double>();
        for (double d : s) sequence.add(d);
        int lo = 0;

        while (lo < n-3) {

            Double sum = sequence.get(lo) + sequence.get(lo+1) + sequence.get(lo+2);
            sequence.add(sum);
            lo++;

        }

        return sequence.stream().mapToDouble(Double::doubleValue).toArray();
    }
}
