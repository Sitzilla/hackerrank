package main.java.com.evansitzes.hackerrank.datastructures.trees;

/**
 * Created by evan on 2/10/17.
 */
public class Insert {

    public static TreeNode insert(TreeNode root, final int value) {

        if (root == null) {
            final TreeNode node = new TreeNode();
            node.data = value;
            node.left = null;
            node.right = null;
            root = node;
        }

        if (root.data > value) {
            root.left = insert(root.left, value);
        } else if (root.data < value) {
            root.right = insert(root.right, value);
        }

        return root;
    }

}
