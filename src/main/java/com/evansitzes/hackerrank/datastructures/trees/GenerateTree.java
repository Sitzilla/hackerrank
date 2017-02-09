package main.java.com.evansitzes.hackerrank.datastructures.trees;

import java.util.Random;

/**
 * Created by evan on 2/9/17.
 */
public class GenerateTree {

    private static final int MAX_DATA_VALUE = 30;

    private static Random random = new Random();

    public static TreeNode generateBalancedTree(final int depth) {
        TreeNode root = new TreeNode();

        root = generateBalancedChildren(0, depth, root);

        return root;
    }

    public static TreeNode generateUnbalancedTree(final int depth) {
        TreeNode root = new TreeNode();

        root = generateUnbalancedChildren(0, depth, root);

        return root;
    }

    private static TreeNode generateBalancedChildren(final int currentDepth, final int maxDepth, final TreeNode node) {

        node.data = random.nextInt(MAX_DATA_VALUE) + 1;

        if (currentDepth == maxDepth) {
            return node;
        }

        // Left children
        node.left = new TreeNode();
        generateBalancedChildren(currentDepth + 1, maxDepth, node.left);

        // Right children
        node.right = new TreeNode();
        generateBalancedChildren(currentDepth + 1, maxDepth, node.right);

        return node;
    }

    private static TreeNode generateUnbalancedChildren(final int currentDepth, final int maxDepth, final TreeNode node) {

        node.data = random.nextInt(MAX_DATA_VALUE) + 1;

        if (currentDepth == maxDepth) {
            return node;
        }

        if (node.data < MAX_DATA_VALUE / 3) {
            return node;
        }

        // Left children
        node.left = new TreeNode();
        generateUnbalancedChildren(currentDepth + 1, maxDepth, node.left);

        // Right children
        node.right = new TreeNode();
        generateUnbalancedChildren(currentDepth + 1, maxDepth, node.right);

        return node;
    }

}
