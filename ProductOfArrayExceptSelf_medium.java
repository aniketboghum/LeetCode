package LeetCode;

public class ProductOfArrayExceptSelf_medium {
    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i=0; i< nums.length; i++)
        {
            int mul = 1;
            for (int j=0; j < nums.length; j++)
            {
                if (i == j) continue;
                mul *= nums[j];
            }
            ans[i] = mul;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        for (int i : productExceptSelf(nums))
        {
            System.out.print(i+" ");
        }
    }
}
