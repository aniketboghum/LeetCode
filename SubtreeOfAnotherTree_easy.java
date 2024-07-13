package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SubtreeOfAnotherTree_easy
{
    public static boolean isSubtree(TreeNode root, TreeNode subRoot)
    {
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode currentNode;
        q.add(root);

        while (!q.isEmpty())
        {
            currentNode = q.poll();

            if (currentNode == null) continue;

            if (TreeNode.BreadthFirstTraversal(currentNode).equals(TreeNode.BreadthFirstTraversal(subRoot)))
            {
                return true;
            }

            q.add(currentNode.left);
            q.add(currentNode.right);
        }
        return false;
    }


    public static void main(String[] args)
    {
        int[] r = {3,4,5,1,2};
        int[] s = {4,1,2};

        TreeNode root = TreeNode.generateTree(TreeNode.makeArrayList(r));
        TreeNode subRoot = TreeNode.generateTree(TreeNode.makeArrayList(s));

        System.out.println(isSubtree(root, subRoot));
    }
}
