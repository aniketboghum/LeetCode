package LeetCode;

public class GreatestCommonDivisorOfStrings_easy {
    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) return "";

        int g = gcd(str1.length(), str2.length());
        return str1.substring(0, g);
    }

    private static int gcd(int a, int b) {
        int remainder = b % a;
        if (remainder == 0) return a;
        return gcd(remainder, a);
    }

    public static void main(String[] args) {
        String s = "ABCABC";
        String s1 = "ABC";
        System.out.println(gcdOfStrings(s, s1));
    }
}
