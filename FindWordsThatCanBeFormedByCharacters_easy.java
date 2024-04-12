package LeetCode;

public class FindWordsThatCanBeFormedByCharacters_easy {
    public static int countCharacters(String[] words, String chars) {
        int ans = 0;

        for (String i : words)
        {
            if (canBeFormered(i, chars))
            {
                ans += i.length();
            }
        }
        return ans;
    }

    private static boolean canBeFormered(String word, String chars)
    {
        if (word.length() > chars.length()) return false;

        int length = 0;
        StringBuilder Ch = new StringBuilder(chars);

        for (char c : word.toCharArray())
        {
            int index = Ch.indexOf(c+"");
            if (index > -1)
            {
                Ch.deleteCharAt(index);
                length++;
            }
        }

        return word.length() == length;
    }

    public static void main(String[] args) {
//        String[] words = {"cat","bt","hat","tree"};
//        String chars = "atach";

        String[] words = {"hello","world","leetcode"};
        String chars = "welldonehoneyr";

        System.out.println(countCharacters(words, chars));
//        System.out.println(canBeFormered("tree", chars));
    }
}
