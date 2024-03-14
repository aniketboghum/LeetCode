package LeetCode;


import java.util.Map;
import java.util.TreeMap;

public class ValidAnagram_easy {
    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> tm1 = new TreeMap<>();
        Map<Character, Integer> tm2 = new TreeMap<>();

        tm1 = getFreqMap(s);
        tm2 = getFreqMap(t);

        return tm1.equals(tm2);
    }

    public static  Map<Character, Integer> getFreqMap(String s)
    {
        Map<Character, Integer> tm = new TreeMap<>();
        for (char i : s.toCharArray())
        {
            if (tm.containsKey(i))
            {
                int val = tm.get(i);
                val++;
                tm.put(i, val);
            }
            else
            {
                tm.put(i, 1);
            }
        }
        return tm;
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
