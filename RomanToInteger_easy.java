package LeetCode;

import java.awt.datatransfer.StringSelection;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_easy
{
    public static int romanToInt(String s)
    {
        int ans = 0;
        Map<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        for (int i=s.length() - 1; i >= 0; i--)
        {
            ans += m.get(s.charAt(i));
            if (i > 0 && m.get(s.charAt(i)) > m.get(s.charAt(i - 1)))
            {
                ans -= m.get(s.charAt(i - 1));
                i--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}
