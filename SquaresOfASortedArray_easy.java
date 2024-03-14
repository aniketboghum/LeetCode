package LeetCode;

import java.util.Arrays;

public class SquaresOfASortedArray_easy {
    public static int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int left = 0, right = nums.length - 1;
        int end = right;

        while (left <= right)
        {
            System.out.println(left +" "+right);
            if (Math.abs(nums[left]) > Math.abs(nums[right]))
            {
                ans[end--] = nums[left] * nums[left++];
            }
            else
            {
                ans[end--] = nums[right] * nums[right--];
            }
        }

        return  ans;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
