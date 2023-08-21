package com.example.leetcode.leets.trees;

import com.example.leetcode.leets.trees.model.TreeNode;

public class Trees {

    public TreeNode invertTree(TreeNode root) {

        if (root != null) {
            var tempNode = root.left;
            root.left = root.right;
            root.right = tempNode;

            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }

}
