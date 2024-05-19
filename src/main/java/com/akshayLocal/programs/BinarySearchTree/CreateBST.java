package com.akshayLocal.programs.BinarySearchTree;

import com.akshayLocal.programs.BinaryTree.TreeNode;

public class CreateBST {

    public static void main(String args[])
    {

    }
    public static TreeNode createBST()
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
        return root;
    }
     public static void insert(TreeNode node,int data)
     {
         if(node.data < data)
         {
             insert(node.left,data);
         }
         else
         {
             insert(node.right,data);
         }
     }
}
