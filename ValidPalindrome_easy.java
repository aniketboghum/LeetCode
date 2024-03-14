package LeetCode;

import java.util.*;

public class ValidPalindrome_easy {
    public static boolean isPalindrome(String s) {
        //forming the proper string
        List<Character> ps = new ArrayList<>();
        for (char c : s.toCharArray())
        {
            if(Character.isAlphabetic(c) || Character.isDigit(c)) ps.add(Character.toLowerCase(c));
        }

        for (int i=0, j=ps.size()-1; i<ps.size(); i++, j--)
        {
            if (ps.get(i).equals(ps.get(j))) continue;
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
//        String s = "A man, a plan, a canal: Panama";
//        String s = "race a car";
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
}
