package br.com;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public boolean validate(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {return false;}
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {return false;}
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {return false;}
                    break;
                default:
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses v = new ValidParentheses();
        String s = "([)";
        System.out.println(v.validate(s));
    }
}