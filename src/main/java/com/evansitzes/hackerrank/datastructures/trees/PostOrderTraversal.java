package main.java.com.evansitzes.hackerrank.datastructures.trees;

/**
 * Print binary tree in postorder
 * */
public class PostOrderTraversal {

    public static void postOrder(final TreeNode root) {
        if (root.left != null) {
            postOrder(root.left);
        }

        if (root.right != null) {
            postOrder(root.right);
        }

        System.out.print(root.data + " ");
    }
}
