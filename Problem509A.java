//Problem 509A - Maimum in Table
import java.util.Scanner;

public class Problem509A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            
            int n = sc.nextInt();
            int[][] table = new int[n][n];
            
            // Initialize the first row and first column with 1s
            for (int i = 0; i < n; i++) {
                table[i][0] = 1;
                table[0][i] = 1;
            }
            
            // Fill the rest of the table using the recurrence relation
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < n; j++) {
                    table[i][j] = table[i - 1][j] + table[i][j - 1];
                }
            }
            
            // The maximum value is always at the bottom-right corner of the table
            System.out.println(table[n - 1][n - 1]);
        }
    }
}
