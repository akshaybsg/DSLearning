package com.akshayLocal.DSA.programs.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxElement {

    static int count =0 ;
    public static int maxEle =0 ;
    public static void main(String args[])
    {
        //               40
        //        20          60
        //      10   30     50  70
        TreeNode root = CreateBinaryTree.createBinaryTree();
        //int maxEle = root.data;
        //System.out.println(maxElementTreeNode(root,maxEle));
        maxEle = root.data;
        maxElementTreeNode(root);
        System.out.println(maxEle);
        //maxElementTreeNode(root,maxEle);

    }

    public static int maxElementTreeNode(TreeNode node)
    {
         int value =0;
         int left = 0;
         int right = 0;

        if(node!=null)
        {
            value = node.data;
            left = maxElementTreeNode(node.left);
            right = maxElementTreeNode(node.right);

            if (left > right)
            {
                maxEle = left;
            }
            else
            {
                maxEle = right;
            }
            if(maxEle < value)
            {
                maxEle = value;
            }

        }
        return maxEle;
    }
    public static void maxElementTreeNodeIteration(TreeNode node)
    {
        Queue<Integer> queue = new LinkedList<>();
        while(!queue.isEmpty())
        {

        }
    }
}
