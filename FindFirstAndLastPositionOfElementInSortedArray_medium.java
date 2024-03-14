package LeetCode;

public class FindFirstAndLastPositionOfElementInSortedArray_medium {
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        for (int i=0; i< nums.length; i++)
        {
            if (nums[i] == target) {
                ans[1] = i;
            }
        }

        for (int j = nums.length - 1; j >=0; j--)
        {
            if (nums[j] == target) {
                ans[0] = j;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {5,7,7,8,8,10};
        int tar = 8;
        for (int i : searchRange(a, tar))
        {
            System.out.print(i+" ");
        }
    }
}
