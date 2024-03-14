package LeetCode;

public class BestTimeToBuyAndSellStock_easy {
    public static int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }

    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
//        int[] a = {7,6,4,3,1};
        System.out.println(maxProfit(a));
    }
}
