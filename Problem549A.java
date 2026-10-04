//Problem 549A - Face Detection
import java.util.Arrays;
import java.util.Scanner;

public class Problem549A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                grid[i] = sc.next().toCharArray();
            }
            
            int faceCount = 0;
            char[] target = {'a', 'c', 'e', 'f'};
            
            // Iterate through all possible top-left corners of 2x2 squares
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < m - 1; j++) {
                    char[] current = {
                        grid[i][j],
                        grid[i][j + 1],
                        grid[i + 1][j],
                        grid[i + 1][j + 1]
                    };
                    
                    Arrays.sort(current);
                    
                    // If the sorted characters match {'a', 'c', 'e', 'f'}, it's a face!
                    if (Arrays.equals(current, target)) {
                        faceCount++;
                    }
                }
            }
            
            System.out.println(faceCount);
        }
    }
}
