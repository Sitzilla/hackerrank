package main.java.com.evansitzes.hackerrank.datastructures.stacks;

import java.util.Scanner;
import java.util.Stack;


/**
 * Balance a line of parenthesis, brackets, and curly braces using a stack
 * problem statement: https://www.hackerrank.com/challenges/balanced-brackets
 * Input examples:
 *   3
     {[()]}
     {[(])}
     {{[[(())]]}}
 */
public class BalancedBrackets {

    public static void solution() {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter max number of lines: ");
        final int numberOfLines = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfLines; i++) {
            System.out.println("Enter a rule: ");
            final boolean isBalanced = isBalanced(scanner.nextLine());

            if (isBalanced) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }

    private static boolean isBalanced(final String line) {
        final Stack<Character> stack = new Stack<>();

        for (int i = 0; i < line.length(); i++) {
            final char character = line.charAt(i);
            if(character == '['
               || character == '('
               || character == '{') {
                stack.push(character);
            }

            if (character == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            }

            if (character == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }

            if (character == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

}
