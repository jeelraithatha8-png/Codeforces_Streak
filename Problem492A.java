//Problem 492A - Vanya and Cubes
import java.util.Scanner;

public class Problem492A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            
            int n = sc.nextInt();
            
            int height = 0;
            int cubesInCurrentLevel = 0;
            int totalCubesUsed = 0;
            
            // Build level by level as long as we have enough cubes
            while (true) {
                height++;
                cubesInCurrentLevel += height; // Level 1 needs 1, Level 2 needs 1+2=3, etc.
                totalCubesUsed += cubesInCurrentLevel;
                
                if (totalCubesUsed > n) {
                    // If we went over n cubes, the maximum height is the previous level
                    height--;
                    break;
                }
            }
            
            System.out.println(height);
        }
    }
}