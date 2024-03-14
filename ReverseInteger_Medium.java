package LeetCode;

public class ReverseInteger_Medium {
    public static int reverse(int x) {
        long temp = 0;
        while(x!=0) {
            temp *= 10;
            temp += x % 10;
            x /= 10;
        }
        return temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE ? 0 : (int) temp;
    }

    public static void main(String[] args) {
        int x = 321;
        System.out.println(reverse(x));
    }
}
