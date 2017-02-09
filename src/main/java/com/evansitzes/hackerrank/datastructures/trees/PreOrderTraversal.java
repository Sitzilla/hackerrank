package main.java.com.evansitzes.hackerrank.datastructures.trees;

/**
 * Print binary tree in preorder
 */
public class PreOrderTraversal {

    public static void preOrder(final TreeNode root) {
        System.out.print(root.data + " ");

        if (root.left != null) {
            preOrder(root.left);
        }

        if (root.right != null) {
            preOrder(root.right);
        }
    }
}
