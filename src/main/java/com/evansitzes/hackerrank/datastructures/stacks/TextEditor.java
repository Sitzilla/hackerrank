package main.java.com.evansitzes.hackerrank.datastructures.stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Create a text editor using a StringBuilder for the message and a stack to keep track of commands (for 'undo' operations).
 * Link to problem: https://www.hackerrank.com/challenges/simple-text-editor
 */
public class TextEditor {

    public static void solution() {
        final Stack<String> stateStack = new Stack<>();
        final StringBuilder message = new StringBuilder();
        final Scanner scanner = new Scanner(System.in);
        stateStack.push(message.toString());

        System.out.println("Enter max number of lines: ");
        final int numberOfLines = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfLines; i++) {
            System.out.println("Enter a rule: ");
            final int queryCode = scanner.nextInt();

            // Add to text editor
            if (queryCode == 1) {
                final String value = scanner.nextLine();
                message.append(value.trim());
                stateStack.add(message.toString());
                continue;
            }

            // delete characters
            if (queryCode == 2) {
                final int charactersToDelete = scanner.nextInt();
                message.delete(message.length() - charactersToDelete, message.length());
                stateStack.add(message.toString());
                continue;
            }

            // print character at index
            if (queryCode == 3) {
                final int printIndex = scanner.nextInt();
                if (printIndex == message.length()) {
                    System.out.println(message.substring(printIndex - 1));
                } else {
                    System.out.println(message.substring(printIndex - 1, printIndex));
                }
                continue;
            }

            // undo last
            if (queryCode == 4) {
                message.setLength(0);
                stateStack.pop();
                message.append(stateStack.peek());
                continue;
            }
        }

    }
}
