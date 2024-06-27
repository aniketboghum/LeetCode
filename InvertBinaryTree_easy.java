package LeetCode;

public class InvertBinaryTree_easy
{
    public static TreeNode invertTree(TreeNode root)
    {
        invert(root);
        return root;
    }

    private static void invert(TreeNode node)
    {
        if (node == null) return;
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        invert(node.left);
        invert(node.right);
    }

    public static void main(String[] args)
    {
        int[] a = {4,2,7,1,3,6,9};
        TreeNode r = TreeNode.generateTree(a);
        r = invertTree(r);

        TreeNode.displayTree(r);
    }
}
