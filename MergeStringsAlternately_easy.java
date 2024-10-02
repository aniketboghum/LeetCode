package LeetCode;

public class MergeStringsAlternately_easy {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int firstIndex = 0;
        int secondIndex = 0;
        int count = 0;

        while (firstIndex < word1.length() && secondIndex < word2.length()) {
            if (count%2 == 0) {
                ans.append(word1.charAt(firstIndex));
                firstIndex++;
            }
            else {
                ans.append(word2.charAt(secondIndex));
                secondIndex++;
            }
            count++;
        }

        if (firstIndex == word1.length()) {
            ans.append(word2.substring(secondIndex));
        }
        else {
            ans.append(word1.substring(firstIndex));
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String a = "ab";
        String b = "pqrs";
        System.out.println(mergeAlternately(a, b));
    }
}
