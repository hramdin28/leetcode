package com.example.leetcode.leets.trees;


import com.example.leetcode.leets.trees.model.TreeNode;
import org.junit.jupiter.api.Test;

class TreesTest {

    private final Trees trees = new Trees();

    @Test
    void test_invertTree() {
        var node = new TreeNode(4);

        node.addRecursive(node, 2);
        node.addRecursive(node, 7);
        node.addRecursive(node, 1);
        node.addRecursive(node, 3);
        node.addRecursive(node, 6);
        node.addRecursive(node, 9);

        System.out.println(node);

        var res = trees.invertTree(node);

        System.out.println(res);

    }


}
