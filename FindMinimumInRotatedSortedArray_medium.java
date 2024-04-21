package LeetCode;

public class FindMinimumInRotatedSortedArray_medium {
    public static int findMin(int[] nums)
    {
        int prev = 5001;
        boolean flag = true;

        for (int i : nums)
        {
            if (flag)
            {
                prev = i;
                flag = false;
                continue;
            }

            if (prev > i) return i;
            else prev = i;
        }
        return nums[0];
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
//        int[] nums = {11,13,15,17};
        System.out.println(findMin(nums));
    }
}
