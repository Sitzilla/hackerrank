package main.java.com.evansitzes.hackerrank.datastructures.trees;

/**
 * Created by evan on 2/9/17.
 */
public class GetHeight {

    public static int height(final TreeNode root) {
        // Write your code here.
        if (root == null) {
            return -1;
        }

        final int leftHeight = height(root.left);
        final int rightHeight = height(root.right);

        if (leftHeight > rightHeight) {
            return leftHeight + 1;
        } else {
            return rightHeight + 1;
        }
    }

}
