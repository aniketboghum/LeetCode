package LeetCode;

import java.util.Stack;

public class ReverseWordsInAString_easy {
    public static String reverseWords(String s) {
        Stack<String> words = splitWords(s);
        StringBuilder ans = new StringBuilder();

        while (!words.isEmpty()) {
            ans.append(words.pop());
            if (words.size() != 0) ans.append(" ");
        }

        return ans.toString();
    }

    private static Stack<String> splitWords(String s) {
        StringBuilder word = new StringBuilder();
        Stack<String> words = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                if (word.length()>0) words.add(word.toString());
                word.setLength(0);
                continue;
            }
            word.append(c);
        }

        if (word.length()>0) words.add(word.toString());
        return words;
    }

    public static void main(String[] args) {
        String s = " the sky is blue ";
        System.out.println(reverseWords(s));
    }
}
