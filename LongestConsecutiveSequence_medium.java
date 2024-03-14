package LeetCode;


import java.util.*;

public class LongestConsecutiveSequence_medium {
    public static int longestConsecutive(int[] nums) {
        int longestAnsForward = 0;
        int longestAnsBackward = 0;
        int ans = 1;

        TreeSet<Integer> s = new TreeSet<>();

        for (int i : nums) s.add(i);

        int nextEle = Integer.MIN_VALUE;
        for (int i : s)
        {
            if (i == nextEle)
            {
                ans++;
            }
            else
            {
                ans = 1;
            }
            longestAnsForward = Math.max(longestAnsForward, ans);
            nextEle = i+1;
        }

        Set<Integer> ns = s.descendingSet();
        for (int i : ns)
        {
            if (i == nextEle)
            {
                ans++;
            }
            else
            {
                ans = 1;
            }
            longestAnsBackward = Math.max(longestAnsBackward, ans);
            nextEle = i-1;
        }

        return Math.max(longestAnsForward, longestAnsBackward);
    }
    public static void main(String[] args) {
//        int[] a = {0,3,7,2,5,8,4,6,0,1};
//        int[] a = {100,4,200,1,3,2};
        int[] a =  {0, -1};
        System.out.println(longestConsecutive(a));
    }
}
