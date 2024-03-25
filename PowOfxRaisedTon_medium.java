package LeetCode;

public class PowOfxRaisedTon_medium {
    public static double myPow(double x, int n) {
        double ans = 1;
        long iteratingFactor = n;

        iteratingFactor = iteratingFactor < 0 ? iteratingFactor*-1 :  iteratingFactor;

        while (iteratingFactor > 0)
        {
            if (iteratingFactor%2 == 0)
            {
                x = x*x;
                iteratingFactor /= 2;
            }
            else
            {
                ans *= x;
                iteratingFactor--;
            }
        }

        return n > 0 ? ans : (double) 1/ans;
    }
    public static void main(String[] args) {
        double x = 2.00000;
        int n = -2147483648;
        System.out.println(myPow(x, n));
    }
}
