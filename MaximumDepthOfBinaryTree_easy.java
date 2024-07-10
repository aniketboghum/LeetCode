package LeetCode;

import java.util.ArrayList;

public class MaximumDepthOfBinaryTree_easy
{
    public static int maxDepth(TreeNode root)
    {
        int left = 1;
        int right = 1;
        if (root == null) return 0;
        left += maxDepth(root.left);
        right += maxDepth(root.right);

        return Math.max(left, right);
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> a = new ArrayList<>()
        {{
            add(3);
            add(9);
            add(20);
            add(null);
            add(null);
            add(15);
            add(7);
        }};

        System.out.println(maxDepth(TreeNode.generateTree(a)));
    }
}
