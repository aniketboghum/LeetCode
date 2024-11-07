package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseVowelsOfAString_easy {
    public static String reverseVowels(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> vowels = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) {
                vowels.add(ch);
            }
        }

        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) {
                ans.append(vowels.pop());
            }
            else {
                ans.append(ch);
            }
        }

        return ans.toString();
    }

    private static boolean isVowel(char ch) {
        if (ch=='a' || ch=='i' || ch=='e' || ch=='o' || ch=='u' ||
                ch=='A' || ch=='I' || ch=='E' || ch=='O' || ch=='U') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
//        String s = "IceCreAm";
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }
}
