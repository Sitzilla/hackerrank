package main.java.com.evansitzes.hackerrank.datastructures.trees;

/**
 * Print binary tree in order
 * */
public class InOrderTraversal {

    public static void inOrder(final TreeNode root) {

        if (root.left != null) {
            inOrder(root.left);
        }

        System.out.print(root.data + " ");

        if (root.right != null) {
            inOrder(root.right);
        }
    }
}
