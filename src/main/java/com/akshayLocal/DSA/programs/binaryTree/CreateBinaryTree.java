package com.akshayLocal.DSA.programs.binaryTree;

public class CreateBinaryTree {

    public static void main(String args[])
    {

    }


    //               40
    //        20          60
    //      10   30     50  70

    public static TreeNode createBinaryTree()
    {
        TreeNode root = new TreeNode(40);
        TreeNode node20 = new TreeNode(20);
        TreeNode node60 = new TreeNode(60);
        TreeNode node10 = new TreeNode(10);
        TreeNode node30 = new TreeNode(30);
        TreeNode node50 = new TreeNode(50);
        TreeNode node70 = new TreeNode(70);

        root.left = node20;
        root.right = node60;

        node20.left = node10;
        node20.right = node30;

        node60.left = node50;
        node60.right = node70;

        return root;
    }
}
