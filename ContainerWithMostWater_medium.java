package LeetCode;

public class ContainerWithMostWater_medium {
    public static int maxArea(int[] height) {
        int i  = 0 , j = height.length-1;
        int area = 0;

        while(i < j)
        {
                int temp = Math.min(height[i], height[j]) * (j - i);
                area = Math.max(area, temp);

                if (height[i] < height[j])  i++;
                else j--;
        }
        return area;
    }

    public static void main(String[] args) {
//        int[] a = {1,8,6,2,5,4,8,3,7};
        int[] a = {4,3,2,1,4};
        System.out.println(maxArea(a));
    }
}
