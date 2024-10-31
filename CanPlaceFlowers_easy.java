package LeetCode;

public class CanPlaceFlowers_easy {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n==0) return true;
        if (flowerbed.length==1 && flowerbed[0]==0) return true;
        if (flowerbed.length==1 && flowerbed[0]==1) return false;

        for (int i=0; i<flowerbed.length-2; i++) {
            if (i==0 && (flowerbed[0]==1 || flowerbed[1]==1)) continue;
            if (i==0 && flowerbed[i]==0 && flowerbed[1]==0) {
                flowerbed[i] = 1;
                n--;
            }
            else if (flowerbed[i-1]==0 && flowerbed[i+1]==0 && flowerbed[i]!=1) {
                flowerbed[i] = 1;
                n--;
            }
        }
        int i = flowerbed.length;
        if (flowerbed[i-2]==0 && flowerbed[i-1]==0) {
            flowerbed[i-1] = 1;
            n--;
        }
        return n<=0;
    }

    public static void main(String[] args) {
//        int[] flowerBed = {1,0,0,0,1};
//        int n = 1;
        int[] flowerBed = {1,0,0,0,1,0,0};
        int n = 2;
        System.out.println(canPlaceFlowers(flowerBed, n));
    }
}
