//Problem 14A- Letter
import java.util.Scanner;

public class Problem14A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            char[][] grid = new char[n][m];
            
            int minRow = n, maxRow = -1;
            int minCol = m, maxCol = -1;
            
            for (int i = 0; i < n; i++) {
                String row = sc.next();
                grid[i] = row.toCharArray();
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == '*') {
                        if (i < minRow) minRow = i;
                        if (i > maxRow) maxRow = i;
                        if (j < minCol) minCol = j;
                        if (j > maxCol) maxCol = j;
                    }
                }
            }
            
            // Print the sub-rectangle
            for (int i = minRow; i <= maxRow; i++) {
                for (int j = minCol; j <= maxCol; j++) {
                    System.out.print(grid[i][j]);
                }
                System.out.println();
            }
        }
    }
}