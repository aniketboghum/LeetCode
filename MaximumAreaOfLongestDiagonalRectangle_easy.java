package LeetCode;

import java.awt.*;
import java.util.*;

public class MaximumAreaOfLongestDiagonalRectangle_easy {
    public static int areaOfMaxDiagonal(int[][] dimensions) {
        int maxArea = 0;
        double maxDiagonalLength = 0;

        for (int[] dimension : dimensions)
        {
            double lsq = Math.pow(dimension[0], 2);
            double bsq = Math.pow(dimension[1], 2);

            if (maxDiagonalLength == Math.sqrt(lsq + bsq))
            {
                maxArea = Math.max(maxArea, dimension[0]*dimension[1]);
            }
            else if (maxDiagonalLength < Math.sqrt(lsq + bsq))
            {
                maxDiagonalLength = Math.sqrt(lsq + bsq);
                maxArea = dimension[0]*dimension[1];
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[][] dim = {{9, 3}, {8, 6}};
        System.out.println(areaOfMaxDiagonal(dim));
    }
}
