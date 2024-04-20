package LeetCode;

public class MinimumTimeVisitingAllPoints_easy {
    public static int minTimeToVisitAllPoints(int[][] points) {
        int totalTime = 0;

        for (int i = 1; i<points.length; i++)
        {
            int prevX = points[i-1][0];
            int prevY = points[i-1][1];

            int currX = points[i][0];
            int currY = points[i][1];

            int dx = Math.abs(prevX - currX);
            int dy = Math.abs(prevY - currY);

            totalTime += Math.max(dx, dy);
        }

        return totalTime;
    }
    public static void main(String[] args) {
        int[][] points = {{1,1},{3,4},{-1,0}};
        System.out.println(minTimeToVisitAllPoints(points));
    }
}
