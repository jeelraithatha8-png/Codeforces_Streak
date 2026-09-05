//Problem 404A- Valera ans X
import java.util.Scanner;

public class Problem404A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            
            int n = sc.nextInt();
            char[][] grid = new char[n][n];
            
            for (int i = 0; i < n; i++) {
                String row = sc.next();
                grid[i] = row.toCharArray();
            }
            
            char diagChar = grid[0][0];
            char nonDiagChar = grid[0][1]; 
            
            if (diagChar == nonDiagChar) {
                System.out.println("NO");
                return;
            }
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    boolean isDiagonal = (i == j) || (j == n - 1 - i);
                    
                    if (isDiagonal) {
                        if (grid[i][j] != diagChar) {
                            System.out.println("NO");
                            return;
                        }
                    } else {
                        if (grid[i][j] != nonDiagChar) {
                            System.out.println("NO");
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("YES");

    }
}
