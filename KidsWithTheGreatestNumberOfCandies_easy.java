package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies_easy {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();

        int greatest = 0;
        for (int i : candies) {
            if (i > greatest) greatest = i;
        }

        for (int i : candies) {
            if ((i+extraCandies) >= greatest) {
                ans.add(true);
            }
            else {
                ans.add(false);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] c = {2,3,5,1,3};
        int ec = 3;

        System.out.println(kidsWithCandies(c, ec));
    }
}
