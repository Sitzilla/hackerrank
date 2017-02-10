package main.java.com.evansitzes.hackerrank.datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * print the level-order traversal of the binary tree from left to right
 */
public class LevelOrderTraversal {

    public static void levelOrder(final TreeNode root) {

        final Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) {
            return;
        }

        queue.add(root);

        while(queue.size() > 0) {
            final TreeNode node = queue.poll();
            System.out.print(node.data + " ");

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }

    }
}
