package LeetCode;

public class AddBinary_easy {
    public static String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i>-1 || j>-1) {
            int a1 = (i>-1) ? a.charAt(i) : 0;
            int b1 = (j>-1) ? b.charAt(j) : 0;

            int sum = a1 + b1 + carry;
            ans.append(sum%2);

            carry = (sum/2) % 2;

            i--;
            j--;
        }
        if (carry != 0) ans.append(carry);
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
//        String a = "11";
//        String b = "1";
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));
    }
}
