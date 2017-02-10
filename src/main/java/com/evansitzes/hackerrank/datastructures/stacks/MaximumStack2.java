package main.java.com.evansitzes.hackerrank.datastructures.stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Able to get max in O(1) time by maintaining a separate stack of maximums.
 * Link to problem: https://www.hackerrank.com/challenges/maximum-element
 */
public class MaximumStack2 {

    public static void solution() {
        final Stack<Integer> mainStack = new Stack<>();
        final Stack<Integer> stackOfMaximums = new Stack<>();
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter max number of lines: ");
        final int numberOfLines = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfLines; i++) {
            System.out.println("Enter a rule: ");
            final int queryCode = scanner.nextInt();

            // Add to stack
            if (queryCode == 1) {
//                final int value = Integer.valueOf(input[1]);
                final int value = scanner.nextInt();
                if (stackOfMaximums.isEmpty()) {
                    stackOfMaximums.push(value);
                    mainStack.add(value);
                    continue;
                }

                // if new value is greaterthan or equal to the current max then add to the stack of maximums
                if (value >= stackOfMaximums.peek()) {
                    stackOfMaximums.push(value);
                }

                mainStack.add(value);
                continue;
            }

            // Delete from stack
            if (queryCode == 2) {
                if (mainStack.isEmpty()) {
                    continue;
                }

                final int value = mainStack.pop();

                // if new value is lessthan or equal to the current max then delete from the stack of maximums
                if (value >= stackOfMaximums.peek()) {
                    stackOfMaximums.pop();
                }

                continue;
            }

            // Print maximum from the stack
            if (queryCode == 3) {
                System.out.println(stackOfMaximums.peek());
            }
        }

    }

}
