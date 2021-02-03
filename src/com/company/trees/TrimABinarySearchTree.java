package com.company.trees;

public class TrimABinarySearchTree {

    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root == null) {
            return null;
        } else {

        }
        return null;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
