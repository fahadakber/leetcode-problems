package com.fahad;

/*
104. Maximum Depth of Binary Tree

Problem Type - Easy

Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 3

Example 2:

Input: root = [1,null,2]
Output: 2

Constraints:

    The number of nodes in the tree is in the range [0, 104].
    -100 <= Node.val <= 100

 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class MaximumDepthOfBinaryTree {
    // recursive implementation
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right) + 1;

    }

    // Stack implementation
    public int maxDepth_Stack(TreeNode root) {
        if (root == null)
            return 0;

        Stack<Pair> stack = new Stack<>();
        Pair pair = new Pair(root,1);
        stack.push(pair);
        int maxDepth = -1;
        while(!stack.isEmpty()){
            Pair tempPair = stack.pop();
            TreeNode node = tempPair.node;
            int curr = tempPair.val;

            if(node.left != null)
                stack.push(new Pair(node.left, 1 + curr));

            if(node.right != null)
                stack.push(new Pair(node.right, 1 + curr));

            maxDepth = Math.max(maxDepth,curr);
        }
        return maxDepth;
    }

    public int maxDepth_Dequeu(TreeNode root){
        if (root == null)
            return 0;

        Deque<Pair> deque = new ArrayDeque<>();
        Pair pair = new Pair(root,1);
        deque.addFirst(pair);
        int maxDepth = Integer.MIN_VALUE;

        while(!deque.isEmpty()){
            pair = deque.removeFirst();
            TreeNode node = pair.node;
            int curr = pair.val;

            if(node.left != null)
                deque.addFirst(new Pair(node.left, 1 + curr));

            if(node.right != null)
                deque.addFirst(new Pair(node.right, 1 + curr));

            maxDepth = Math.max(maxDepth,curr);
        }
        return maxDepth;
    }

}
