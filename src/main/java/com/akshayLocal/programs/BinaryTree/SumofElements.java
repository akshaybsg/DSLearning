package com.akshayLocal.programs.BinaryTree;

public class SumofElements {

    public static int sum =0;
    //             40
    //        20          60
    //      10   30     50  70
    public static void main(String args[])
    {
        TreeNode root = CreateBinaryTree.createBinaryTree();
        System.out.println(sumofElements(root));

    }

    public static int sumofElements(TreeNode node)
    {
        preOrderTraversal(node);
        return sum;

    }
    public static void preOrderTraversal(TreeNode node)
    {
        if(node == null)
        {
            return;//sum =0;
        }
        sum += node.data;
        if(node.left!=null)
        {
            preOrderTraversal(node.left);
        }
        if(node.right!=null)
        {
            preOrderTraversal(node.right);
        }

    }

}
