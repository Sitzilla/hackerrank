package main.java.com.evansitzes.hackerrank;

import main.java.com.evansitzes.hackerrank.datastructures.trees.*;

/**
 * Created by evan on 1/23/17.
 */
public class Main {

    public static void main(final String[] args) {

        //StairCase.printStairCase(100);


        // HackerRank link to trees problems
        // https://www.hackerrank.com/domains/data-structures/trees
        final TreeNode balancedTree = GenerateTree.generateBalancedTree(5);
        final TreeNode unbalancedTree = GenerateTree.generateUnbalancedTree(10);

        System.out.println("Printing binary tree in pre-order");
        PreOrderTraversal.preOrder(balancedTree);
        System.out.println("\n----------------------------");
        System.out.println("Printing binary tree in post-order");
        PostOrderTraversal.postOrder(balancedTree);
        System.out.println("\n----------------------------");
        System.out.println("Printing binary tree in order");
        InOrderTraversal.inOrder(balancedTree);
        System.out.println("\n----------------------------");
        System.out.println("Printing unbalanced tree height");
        System.out.println(GetHeight.height(unbalancedTree));
    }

}
