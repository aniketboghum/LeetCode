package LeetCode;

public class DivideTwoIntegers_meduim {

    public static int divide(int dividend, int divisor) {
        long ans = (long) dividend/divisor;
        if (ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        else if (ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        else return (int) ans;
    }
    public static void main(String[] args) {
        System.out.println(divide(10, 3));
    }
}
