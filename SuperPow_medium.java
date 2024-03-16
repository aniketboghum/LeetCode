package LeetCode;

import java.math.BigInteger;

public class SuperPow_medium {
    public static int superPow(int a, int[] b) {
        BigInteger expo = BigInteger.valueOf(0);

        for (int i : b)
        {
            expo = expo.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(i));
        }

        BigInteger base = BigInteger.valueOf(a);
        return base.modPow(expo, BigInteger.valueOf(1337)).intValue();
    }

    public static void main(String[] args) {
        int a = 2;
        int[] b = {4,3,3,8,5,2};

        System.out.println(superPow(a, b));
    }
}
