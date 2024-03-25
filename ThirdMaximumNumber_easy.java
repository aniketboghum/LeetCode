package LeetCode;

import java.util.Arrays;

public class ThirdMaximumNumber_easy {
    public static int thirdMax(int[] nums) {
        Integer firstMax = null;
        Integer secondMax = null;
        Integer thirdMax = null;

        for (Integer i: nums)
        {
            if (i.equals(firstMax) || i.equals((secondMax)) || i.equals(thirdMax)) continue;

            if (firstMax == null || i > firstMax)
            {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = i;
            }
            else if (secondMax == null || i > secondMax)
            {
                thirdMax = secondMax;
                secondMax = i;
            }
            else if (thirdMax == null || i > thirdMax)
            {
                thirdMax = i;
            }
        }
        return thirdMax == null ? firstMax : thirdMax;
    }

    public static void main(String[] args) {
//        int[] num = {3,2,1};
        int[] num = {1,2,-2147483648};
        System.out.println(thirdMax(num));
    }
}
