package LeetCode;

public class isArrayMonotone_easy {
    public static boolean isMonotonic(int[] nums) {
        boolean IsAscMonotone = false;
        boolean IsDescMonotone = false;

        if (nums.length == 1) return true;

        for (int i=0, j=nums.length; i<nums.length-1; i++, j--)
        {
            if (nums[i] <= nums[i+1]) IsAscMonotone = true;
            else 
            {
                IsAscMonotone = false;
                break;
            }
        }

        for (int j=nums.length-1; j>0; j--)
        {
            if (nums[j] <= nums[j-1]) IsDescMonotone = true;
            else 
            {
                IsDescMonotone = false;
                break;
            }
        }


        return IsAscMonotone || IsDescMonotone;
    }

    public static void main(String[] args) {
        // int[] a = {1, 2, 2, 3};
        // int[] a = {3, 2, 2, 1};
        int[] a = {1,3,2,4};
        System.out.println(isMonotonic(a));
    }
}
