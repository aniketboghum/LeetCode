package LeetCode;

public class SingleNumber_easy {
    public static int singleNumber(int[] nums) {
        int res = 0;
        for (int i : nums)
        {
            res = res^i;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));
    }
}
