package com.akshayLocal.programs.BinaryTree;

public class MinElement {
    public static int minEle =0;
    public static void main(String args[])
    {
        TreeNode root = CreateBinaryTree.createBinaryTree();
        minEle = root.data;
        System.out.println(minElementFromTreeNode(root));

    }
    public static int minElementFromTreeNode(TreeNode node)
    {
        if(node!=null)
        {
            int value = node.data;
            int left = minElementFromTreeNode(node.left);
            int right = minElementFromTreeNode(node.right);

            if(left<right)
            {
                minEle = left;
            }
            else
            {
                minEle = right;
            }
            if(minEle > value)
            {
                minEle = value;
            }

        }

        return minEle;

    }
}
