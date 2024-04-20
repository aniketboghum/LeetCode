package LeetCode;

public class Largest3SameDigitNumberInString_easy {
    public static String largestGoodInteger(String num)
    {
        String ans = "-1";

        String good = "";

        for (char c : num.toCharArray())
        {
            good = getGoodNumber(c);

            if (num.contains(good) && !num.contains(good+c) && Integer.parseInt(good)>Integer.parseInt(ans)) ans = good;
        }

        return ans.equals("-1") ? "" : ans;
    }

    private static String getGoodNumber(char c)
    {
        return c + String.valueOf(c) + c;
    }
    private static boolean isGoodNumber(String num)
    {
        int count = 0;
        char j = num.charAt(0);
        for (char i : num.toCharArray())
        {
            if (i == j) count++;
        }

        return count == num.length();
    }

    public static void main(String[] args) {
        String num = "6777133339";
//        num = "0123456789"
        System.out.println(largestGoodInteger(num));
    }
}
