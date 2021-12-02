package com.company;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {


    public static void main(String[] args){

        String test = "camel case word";
        System.out.println(camelCase(test));
    }


    public static String camelCase(String str){



        str = str.replaceAll("\\s", "");
        return str;
    }


}








