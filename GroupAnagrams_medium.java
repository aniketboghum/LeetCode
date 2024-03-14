package LeetCode;

import java.util.*;

public class GroupAnagrams_medium {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (int i=0; i<strs.length; i++)
        {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String s = Arrays.toString(chars);

            map.putIfAbsent(s, new ArrayList<>());
            map.get(s).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args)
    {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(str));
    }
}
