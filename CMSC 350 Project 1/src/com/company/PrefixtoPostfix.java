package com.company;

import java.util.Stack;

public class PrefixtoPostfix {
    // Check to see if the value is an operator
    static boolean isOperator(char x) {
        return x == '+' || x == '-' || x == '*' || x == '/';
    }

    // Check the value for spaces
    static boolean isSpace(char x) {
        return x == ' ';
    }
     // Convert prefix to postfix expressions
    static String prefixToPostfixExpression(String prefixToPostFix) {
        Stack<String> stack = new Stack<String>();
        String operand1;
        String operand2;
        String operator;
        int length = prefixToPostFix.length();
        for (int i = 0; i < length; i++) {
            // if symbol is an operator, pop 2 operands from the stack
            if (isOperator(prefixToPostFix.charAt(i))) {
                operand1 = stack.peek();
                stack.pop();
                operand2 = stack.peek();
                stack.pop();
                //concat the operands and operator and store as a combined value
                String tempValue = operand1 + " " + prefixToPostFix.charAt(i) + " " + operand2;
                //push String back to the stack
                stack.push(tempValue);
            }
            else if (isSpace(prefixToPostFix.charAt(i))) {
                continue;
            }
            else {
                // If the symbol is an operand, push to the stack
                stack.push("" + prefixToPostFix.charAt(i));
            }
        }
        StringBuilder tempOutput = new StringBuilder();
        while(!stack.isEmpty()) {
            tempOutput.append(stack.peek()).append(" ");
            stack.pop();
        }
        System.out.println("Stack is empty");
        return tempOutput.toString();
    }
}
