package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) { this.val = val; }

    TreeNode(int val, TreeNode left, TreeNode right)
    {
      this.val = val;
      this.left = left;
      this.right = right;
    }

    public static TreeNode generateTree(int[] arr)
    {
        if (arr == null || arr.length == 0) {
            return null;
        }

        // Use Integer.MIN_VALUE as a sentinel value for null nodes
        final int NULL_VALUE = Integer.MIN_VALUE;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (i < arr.length) {
            TreeNode current = queue.poll();

            if (i < arr.length && arr[i] != NULL_VALUE) {
                current.left = new TreeNode(arr[i]);
                queue.add(current.left);
            }
            i++;

            if (i < arr.length && arr[i] != NULL_VALUE) {
                current.right = new TreeNode(arr[i]);
                queue.add(current.right);
            }
            i++;
        }

        return root;
    }

    //Breadth first traversal
    public static void displayTree(TreeNode root)
    {
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode t;
        q.add(root);
        System.out.print(root.val+" ");

        while (!q.isEmpty())
        {
            t = q.poll();

            if (t.left != null)
            {
                System.out.print(t.left.val+" ");
                q.add(t.left);
            }

            if (t.right != null)
            {
                System.out.print(t.right.val+" ");
                q.add(t.right);
            }
        }
    }
}
