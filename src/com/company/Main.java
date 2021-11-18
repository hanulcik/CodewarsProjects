package com.company;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {


    public static void main(String[] args) {

        String test = "9DF2";


        System.out.println(isHexNumber(test));
    }





    public static boolean isHexNumber(String s) {
        String regex = "[A-F0-9]+";
        if (s.matches(regex)) return true;
        return false;
    }


}








