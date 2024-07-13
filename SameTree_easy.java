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
        return  TreeNode.BreadthFirstTraversal(p).equals(TreeNode.BreadthFirstTraversal(q));
    }


    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 4, 5};

        System.out.println(isSameTree(TreeNode.generateTree(TreeNode.makeArrayList(a)),
                TreeNode.generateTree(TreeNode.makeArrayList(b))));
    }
}
