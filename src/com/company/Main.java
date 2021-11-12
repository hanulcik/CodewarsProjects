package com.company;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;


public class Main {


    public static void main(String[] args) {

        BigInteger test = BigInteger.valueOf(5);


        System.out.println(perimeter(test));
    }





        public static BigInteger perimeter(BigInteger n) {
            BigInteger sum = BigInteger.valueOf(0);
            n = n.add(BigInteger.valueOf(2));
            BigInteger[] arr = fibonacci(n);
            for (BigInteger num : arr) {
                sum = sum.add(num);
            }
            return sum.multiply(BigInteger.valueOf(4));
        }


        public static BigInteger[] fibonacci(BigInteger n) {
            ArrayList<BigInteger> arr = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            BigInteger num1 = BigInteger.valueOf(0);
            BigInteger num2 = BigInteger.valueOf(1);

            BigInteger counter = BigInteger.valueOf(0);

            // Iterate till counter is N
            while (counter.compareTo(n) < 0) {

                // add number to long array
                arr.add(num1);

                // Swap
                BigInteger num3 = num2.add(num1);
                num1 = num2;
                num2 = num3;
                counter = counter.add(BigInteger.valueOf(1));
            }
            return arr.toArray(new BigInteger[arr.size()]);
        }


}








