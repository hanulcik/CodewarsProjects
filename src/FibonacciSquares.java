import java.math.BigInteger;

public class FibonacciSquares {
    public static BigInteger perimeter(BigInteger n) {
        BigInteger sum = BigInteger.valueOf(0);
        for (String num : fibonacci(n.add(BigInteger.valueOf(1))).split(" ")) {
            sum.add(BigInteger.valueOf(Integer.parseInt(num)));
        }
        return sum.multiply(BigInteger.valueOf(4));
    }


    public static String fibonacci(BigInteger n) {
        StringBuilder sb = new StringBuilder();
        BigInteger num1 = BigInteger.valueOf(0);
        BigInteger num2 = BigInteger.valueOf(1);

        BigInteger counter = BigInteger.valueOf(0);

        // Iterate till counter is N
        while (counter.compareTo(n) < 0) {

            // Print the number
            sb.append(n + " ");

            // Swap
            BigInteger num3 = num2.add(num1);
            num1 = num2;
            num2 = num3;
            counter = counter.add(BigInteger.valueOf(1));
        }
        return sb.toString();
    }

}
