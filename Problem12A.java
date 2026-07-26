//Problem 12A- Super Agent
import java.util.Scanner;

public class Problem12A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            char[][] grid = new char[3][3];
            
            // Read the 3x3 grid
            for (int i = 0; i < 3; i++) {
                grid[i] = sc.next().toCharArray();
            }
            
            // Check symmetry for all positions
            // A 3x3 grid is symmetric if grid[r][c] == grid[2-r][2-c]
            boolean symmetric = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (grid[i][j] != grid[2 - i][2 - j]) {
                        symmetric = false;
                        break;
                    }
                }
            }
            
            if (symmetric) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}