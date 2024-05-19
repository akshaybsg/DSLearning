package com.akshayLocal.programs.BinaryTree;

import sun.reflect.generics.tree.Tree;

public class LeafNodes {

    public static int count;
    public static void main(String args[])
    {
        //             40
        //        20          60
        //      10   30     50  70
        TreeNode node = CreateBinaryTree.createBinaryTree();
        printLeafNodes(node);
        printCountOfLeaf(node);
        System.out.println("Leaf count is : " + count);
        System.out.println("Path from root to leaf");
        printPath(node);

    }
    public static void printLeafNodes(TreeNode node)
    {
        if(node == null)
        {
            System.out.println(node.data);
            return;
        }

        if(node.left == null && node.right ==null)
        {
            System.out.println(node.data);
        }

        if(node.left!=null)
        {
            printLeafNodes(node.left);
        }
        if(node.right!=null)
        {
            printLeafNodes(node.right);
        }

    }

    public static void printCountOfLeaf(TreeNode node)
    {
        if(node==null)
        {
            //count++;
            return;
        }
        if(node.left == null &&  node.right ==null)
        {
            count++;
        }
        if(node.left!=null)
        {
            printCountOfLeaf(node.left);
        }
        if(node.right!=null)
        {
            printCountOfLeaf(node.right);
        }

    }
    public static void printPath(TreeNode node)
    {
        int[] path = new int[1000];
        printPathRootToLeaf(node,path,0);

    }
    public static void printPathRootToLeaf(TreeNode node , int[] path , int pathLen)
    {

        if(node==null)
        {
            return;
        }
        path[pathLen] = node.data;
        pathLen++;

        if(node.left == null || node.right==null)
        {
            printArray(path,pathLen);
        }
        else
        {
            printPathRootToLeaf(node.left,path,pathLen);
            printPathRootToLeaf(node.right,path,pathLen);

        }

    }
    static void printArray(int[] ints, int len)
    {
        int i;
        for (i = 0; i < len; i++)
        {
            System.out.print(ints[i] + " ");
        }
        System.out.println("");
    }
}
