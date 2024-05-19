package com.akshayLocal.programs.BinaryTree;

import java.util.Stack;

public class DifferentOrderTraversal {

    public static void main(String args[])
    {
        TreeNode node = CreateBinaryTree.createBinaryTree();
        System.out.println("pre Order Traversal");
        preOrderRecur(node);
        System.out.println("in Order Traversal");
        inOrderRecur(node);
        System.out.println("post Order Traversal");
        postOrderRecur(node);
    }

    //Using Recursion
    public static void preOrderRecur(TreeNode root)
    {
        if(root!=null)
        {
            System.out.println(root.data);
            preOrderRecur(root.left);
            preOrderRecur(root.right);
        }

    }
    public static void inOrderRecur(TreeNode root)
    {
        if(root!=null)
        {
            inOrderRecur(root.left);
            System.out.println(root.data);
            inOrderRecur(root.right);
        }

    }
    public static void postOrderRecur(TreeNode root)
    {
        if(root!=null)
        {
            postOrderRecur(root.left);
            postOrderRecur(root.right);
            System.out.println(root.data);
        }

    }
    //Using Iteration
    public static void preOrderItr(TreeNode root)
    {
        if(root == null)
            return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.empty())
        {
            stack.pop();
            System.out.println(root.data);

            if(root.right!=null)
            {
                stack.push(root.right);
            }
            if(root.left!=null)
            {
                stack.push(root.left);
            }

        }
    }
}
