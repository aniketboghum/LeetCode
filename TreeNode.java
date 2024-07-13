//Helper class for Tree Questions
package LeetCode;

import java.util.ArrayList;
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

    public static TreeNode generateTree(ArrayList<Integer> arr)
    {
        if (arr == null || arr.isEmpty()) {
            return null;
        }

        TreeNode root = new TreeNode(arr.get(0));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (i < arr.size()) {
            TreeNode current = queue.poll();

            if (i < arr.size() && arr.get(i) != null) {
                current.left = new TreeNode(arr.get(i));
                queue.add(current.left);
            }
            i++;

            if (i < arr.size() && arr.get(i) != null) {
                current.right = new TreeNode(arr.get(i));
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

    //Breadth first Traversal but returns a ArrayList
    public static ArrayList<Integer> BreadthFirstTraversal(TreeNode root)
    {
        ArrayList<Integer> traversal = new ArrayList<>();
        TreeNode currentNode;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty())
        {
            currentNode = q.poll();

            if (currentNode == null)
            {
                traversal.add(null);
                continue;
            }
            q.add(currentNode.left);
            q.add(currentNode.right);

            traversal.add(currentNode.val);
        }

        return traversal;
    }

    public static ArrayList<Integer> makeArrayList(int[] a)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i : a)
        {
            arr.add(i);
        }
        return arr;
    }
}
