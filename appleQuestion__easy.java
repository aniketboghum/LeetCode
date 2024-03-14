package LeetCode;

import java.util.HashSet;

public class appleQuestion__easy {

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        int sumB = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int alice:aliceSizes){
            sumA+=alice;
            hs.add(alice);
        }
        for(int bob:bobSizes){
            sumB+=bob;
        }
        int diff = (sumA-sumB)/2;
        for(int i =0;i<bobSizes.length;i++)
        {
            int target = diff+bobSizes[i];
            System.out.println(diff);
            if(hs.contains(target)){
                return new int[]{target, bobSizes[i]};
            }
        }
        
        return null;
    }
    
    public static void main(String[] args) {
        int[] a = {1, 1};
        int[] b = {2, 2};
        for(int i : fairCandySwap(a, b))
        {
            System.out.print(i + " ");
        }
    }
}
