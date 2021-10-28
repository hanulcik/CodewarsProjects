package com.company;

public class basicMath {
    public static Integer basicMath(String op, int v1, int v2) {
        if (op == "+") return v1 + v2;
        if (op == "-") return v1 - v2;
        if (op == "*") return v1 * v2;
        if (op == "/") return v1 / v2;
        return v1 + v2;
    }
}
