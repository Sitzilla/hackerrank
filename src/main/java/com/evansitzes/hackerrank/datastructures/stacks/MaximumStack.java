package main.java.com.evansitzes.hackerrank.datastructures.stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Get max O(n) solution. Iterate through the stack every time to get the max.
 * Link to problem: https://www.hackerrank.com/challenges/maximum-element
 */
public class MaximumStack {

    public static void solution() {
        final Stack<Integer> stack = new Stack<>();
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter max number of lines: ");
        final int numberOfLines = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfLines; i++) {
            System.out.println("Enter a rule: ");
            final String line = scanner.nextLine();
            final String[] input = line.split(" ");

            if (input.length == 0) {
                continue;
            }

            // Add to stack
            if (Integer.valueOf(input[0]) == 1) {
                stack.add(Integer.valueOf(input[1]));
                continue;
            }

            // Delete from stack
            if (Integer.valueOf(input[0]) == 2) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                continue;
            }

            // Print maximum from the stack
            if (Integer.valueOf(input[0]) == 3) {
                System.out.println(getMax((Stack<Integer>) stack.clone()));
                continue;
            }
        }

    }

    private static int getMax(final Stack<Integer> clonedStack) {
        int max = Integer.MIN_VALUE;

        for (final Integer value : clonedStack) {
            max = Math.max(max, value);
        }

        return max;
    }

}
