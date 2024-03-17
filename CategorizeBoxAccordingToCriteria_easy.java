package LeetCode;

public class CategorizeBoxAccordingToCriteria_easy {
    public static String categorizeBox(int length, int width, int height, int mass) {
        boolean isHeavy = false;
        boolean isBulky = false;

        if (mass >= 100)
        {
            isHeavy = true;
        }
        long product = (long) length*width*height;
        if (length >= 10000 || width >= 10000 || height >= 10000 || product >= 1000000000)
        {
            isBulky = true;
        }

        if (isBulky && isHeavy) return "Both";
        else if (!isBulky && !isHeavy) return "Neither";
        else if (isBulky && !isHeavy) return "Bulky";
        else if (isHeavy && !isBulky) return "Heavy";
        return "None";
    }

    public static void main(String[] args) {
//        int length = 1000, width = 35, height = 700, mass = 300;
//        int length = 200, width = 50, height = 800, mass = 50;
        int length=2909, width=3968, height=3272, mass=727;
        System.out.println(categorizeBox(length, width, height, mass));
    }
}
