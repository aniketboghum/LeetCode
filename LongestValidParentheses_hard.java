package LeetCode;

import java.util.Stack;

public class LongestValidParentheses_hard {
    public static int longestValidParentheses(String s) {
        int count = 0;
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                count++;
            } else if (stack.peek() == c || stack.peek() == c || stack.peek() == c) {
                stack.pop();
                count++;
            } else {
                count = 0;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "(()";
        System.out.println(longestValidParentheses(s));
    }
}
