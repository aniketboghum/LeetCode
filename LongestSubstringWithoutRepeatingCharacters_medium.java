package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters_medium {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Set<Character> characterSet = new HashSet<>();
        int left = 0;

        for (int right = 0; right < s.length(); right++)
        {
            if (!characterSet.contains(s.charAt(right)))
            {
                characterSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            }
            else
            {
                while (characterSet.contains(s.charAt(right)))
                {
                    characterSet.remove(s.charAt(left));
                    left++;
                }
                characterSet.add(s.charAt(right));
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
