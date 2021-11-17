import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Stream;

/**
 * A simple calculator that given a string of operators (),+,-,/ and numbers separated by spaces returns the value of
 * that expression.
 * Calculator.evaluate("2 / 2 + 3 * 4 - 6")   => 7
 */

//author: Avery Hanulcik
//date: 06 NOV 2021


public class Calculator {


    /**
     * Given a string, parses and evaluates string according to given operator rules.
     * Repeats through a while loop that evaluates the next relevant expression and
     * modifies the string to replace the evaluated expression with the result.
     * @param expression
     * @return Double
     */
    public static Double evaluate(String expression) {
        String[] array = expression.split(" ");
        int size = array.length;

        //set parameters used to control reductive loop
        ArrayList<String>  array1 = new ArrayList<>(makeArrayList(expression));

        while (size > 1) {

            //if contains parenthesis, evaluate parenthesis loop and continue
            if (expression.lastIndexOf('(') != -1) {
                expression = parenthesisLoop(expression);
                continue;
                }

            expression = standardLoop(expression);


        } // END MAIN LOOP

        return Double.parseDouble(expression);
    }


    public static String standardLoop(String expression) {


        return expression;
    }





    /**
     * Given a string expression with parenthesis, evaluate priority operation and return.
     * @param expression
     * @return
     *
     * TODO:
     * Always reduces the original expression by the entire subexpression, must
     * add functionality to check if parenthesis need to be removed or not.
     */
    public static String parenthesisLoop(String expression) {
        int openParens = expression.lastIndexOf('(');
        int closeParens = expression.indexOf(')', openParens);
        String subExpression = expression.substring(openParens, closeParens);
        String operator = "";
        String operation = "";
        Double evaluated = 0.0;

        //if sub expression contains * or /, then evaluate left to right and continue
        if (subExpression.contains("*") || subExpression.contains("/")) {

            int mulIndex = subExpression.indexOf("*");
            int divIndex = subExpression.indexOf("/");

            //find operator of * or / operation
            if (divIndex == -1) operator = subExpression.substring(mulIndex, mulIndex);
            else if (mulIndex == -1) operator = subExpression.substring(divIndex, divIndex);
            else if (mulIndex < divIndex && mulIndex >= 0 && divIndex >= 0)
                operator = subExpression.substring(mulIndex, mulIndex);
            else operator = subExpression.substring(divIndex, divIndex);

            //find operation
            int start = subExpression.indexOf(operator) - 1;
            int end = subExpression.indexOf(operator) + 1;
            operation = subExpression.substring(start, end);

            //calculate operation and edit main expression
            evaluated = calculate(operation);
            expression.replaceAll(operation, String.valueOf(evaluated));
            return expression;
        }
        //else evaluate sub expression left to right and continue;
        else {
            int addIndex = subExpression.indexOf("+");
            int subIndex = subExpression.indexOf("-");

            //find operator of + or - operation
            if (subIndex == -1) operator = subExpression.substring(addIndex, addIndex);
            else if (addIndex == -1) operator = subExpression.substring(subIndex, subIndex);
            else if (addIndex < subIndex && addIndex >= 0 && subIndex >= 0)
                operator = subExpression.substring(addIndex, addIndex);
            else operator = subExpression.substring(subIndex, subIndex);

            //find operation
            int start = subExpression.indexOf(operator) - 1;
            int end = subExpression.indexOf(operator) + 1;
            operation = subExpression.substring(start, end);

            //calculate operation and edit main expression
            evaluated = calculate(operation);
            expression.replaceAll(operation, String.valueOf(evaluated));
            return expression;

        }
    }





    /**
     * Given a string, determines if the combinations of parenthesis are valid.
     * @param parens
     * @return boolean
     */
    public static boolean validParentheses(String parens)
    {
        Stack<Character> stack = new Stack<>();
        char[] ch = new char[parens.length()];
        if (parens.length() == 1)
            return false;

        for (int i = 0; i < parens.length(); i++) ch[i] = parens.charAt(i);

        for (char c : ch) {
            if (c == '(') stack.push(c);
            if (stack.isEmpty() && c == ')') return false;
            if (c == ')') {
                if (stack.peek() == '(') {
                    stack.pop();
                    continue;
                }
                else return false;
            }
        }

        if (stack.isEmpty()) return true;
        return false;
    }




    /**
     * Given input expression, return the maximum number of operations that can occur to that expression.
     * Ex: (1 + 2 + 3)  => 2
     * @param arr
     * @return int
     */
    public static int maxOps(ArrayList<String> arr) {
        int count = 0;
        for (String str : arr) {
            if (isNumeric(str)) count++;
        }
        return count - 1;
    }




    /**
     * Given a string, determines if it is numeric.
     * @param str
     * @return boolean
     */
    public static boolean isNumeric(String str) {
        if (str == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }




    /**
     * Given a string representation of an expression, return the evaluation of that expression.
     * @param s
     * @return Double
     */
    public static Double calculate(String s) {
        Double answer = 0.0;
        Double leftOperand = 0.0;
        Double rightOperand = 0.0;
        int count = 0;
        ArrayList<String> array1 = new ArrayList<>(makeArrayList(s));

        //assign left and right operands
        for (String str : array1) {
            if (isNumeric(str) && count == 0) {
                leftOperand = Double.parseDouble(str);
                count++;
            }
            if (isNumeric(str) && count > 0) {
                rightOperand = Double.parseDouble(str);
            }
        }

        //find operator and calculate
        for (String str : array1) {
            if (str.equals('+')) answer = leftOperand + rightOperand;
            if (str.equals('-')) answer = leftOperand - rightOperand;
            if (str.equals('*')) answer = leftOperand * rightOperand;
            if (str.equals('/')) answer = leftOperand / rightOperand;
        }

        return answer;
    }




    /**
     * Given a string, return an arraylist of that string separated by spaces.
     * @param expression
     * @return ArrayList
     */
    public static ArrayList<String> makeArrayList(String expression) {
        String[] words = expression.split(" ");
        ArrayList<String> array = new ArrayList<>();
        for (String word : words) {
            array.add(word);
        }
        return array;
    }





}
