package main.java.com.evansitzes.hackerrank.algorithms;

/**
 * Created by evan on 1/22/17.
 */
public class StairCase {


    public static void printStairCase(final int n) {

        for (int i = 0; i < n; i++) {
            final String[] stair = new String[n];

            // Create blanks
            for (int j = 0; j <= n - 1; j++) {
                stair[j] = " ";
            }

            // Create Stair
            for (int j = n; j >= n - i; j--) {
                stair[j - 1] = "#";
            }

            String stairString = "";
            // Create Stair String
            for (int j = 0; j < n; j++) {
                stairString += stair[j];
            }

            System.out.println(stairString);
        }

    }
}
