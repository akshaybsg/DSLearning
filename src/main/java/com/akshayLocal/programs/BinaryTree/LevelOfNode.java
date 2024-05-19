package com.akshayLocal.programs.BinaryTree;

public class LevelOfNode {

    static int level = 1 ;
    public static void main(String args[])
    {
        //               40
        //        20          60
        //      10   30     50  70
        TreeNode root = CreateBinaryTree.createBinaryTree();
        System.out.println(levelOfnNode(root, 5,1));

    }
    public static int levelOfnNode(TreeNode node ,int data, int level)
    {
        if(node == null)
        {
            return 0;
        }
        if(node.data == data)
        {
            return level;
        }

        int result =  levelOfnNode(node.left, data, level+1);
        if(result != 0) {
            // I.e found in left subtree
            return result;
        }

        return levelOfnNode(node.right, data , level+1);


    }

}
