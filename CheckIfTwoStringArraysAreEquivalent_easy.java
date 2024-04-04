package LeetCode;

public class CheckIfTwoStringArraysAreEquivalent_easy {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder w1 = new StringBuilder();
        StringBuilder w2 = new StringBuilder();

        for (String i : word1)
        {
            w1.append(i);
        }

        for (String i : word2)
        {
            w2.append(i);
        }

        return w1.compareTo(w2) == 0;
    }
    public static void main(String[] args) {
        String[] s1 = {"ab", "c"};
        String[] s2 = {"a", "bc"};

        System.out.println(arrayStringsAreEqual(s1, s2));
    }
}
