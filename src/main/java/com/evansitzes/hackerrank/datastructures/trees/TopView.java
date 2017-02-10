package main.java.com.evansitzes.hackerrank.datastructures.trees;

/**
 * Print the top view of a binary tree.
 */
public class TopView {

    public static void topView(final TreeNode root) {
        leftSide(root.left);
        System.out.print(root.data + " ");
        rightSide(root.right);
    }


    public static void leftSide(final TreeNode node) {
        if (node.left == null) {
            System.out.print(node.data + " ");
            return;
        }

        leftSide(node.left);
        System.out.print(node.data + " ");
    }

    public static void rightSide(final TreeNode node) {
        if (node.right == null) {
            System.out.print(node.data + " ");
            return;
        }

        System.out.print(node.data + " ");
        rightSide(node.right);
    }
}
