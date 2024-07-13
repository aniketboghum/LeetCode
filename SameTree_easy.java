package LeetCode;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SameTree_easy
{
    public static boolean isSameTree(TreeNode p, TreeNode q)
    {
        return  BreadthFirstTraversal(p).equals(BreadthFirstTraversal(q));
    }

    private static ArrayList<Integer> BreadthFirstTraversal(TreeNode root)
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

    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 4, 5};

        System.out.println(isSameTree(TreeNode.generateTree(TreeNode.makeArrayList(a)),
                TreeNode.generateTree(TreeNode.makeArrayList(b))));
    }
}
