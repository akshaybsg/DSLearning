package com.akshayLocal.programs.BinaryTree;

public class AvgofElements {
    public static int sum =0;
    public static int count =0;

    //             40
    //        20          60
    //      10   30     50  70
    public static void main(String args[])
    {
        TreeNode root = CreateBinaryTree.createBinaryTree();
        System.out.println(avgofElemets(root));

    }
    public static int avgofElemets(TreeNode node)
    {
        //preOrderTraversal(node);
        postOrderTraversal(node);
        return (sum/count);
    }
    public static void preOrderTraversal(TreeNode node)
    {
        if(node == null)
        {
            return;//sum =0;
        }
        sum += node.data;
        count +=1;
        if(node.left!=null)
        {
            preOrderTraversal(node.left);
        }
        if(node.right!=null)
        {
            preOrderTraversal(node.right);
        }

    }
    public static void postOrderTraversal(TreeNode node)
    {
        if(node == null)
        {
            return;//sum =0;
        }

        if(node.left!=null)
        {
            preOrderTraversal(node.left);
        }

        if(node.right!=null)
        {
            preOrderTraversal(node.right);
        }
        sum += node.data;
        count +=1;

    }

}
