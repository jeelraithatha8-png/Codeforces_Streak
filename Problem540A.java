//Problem 540A - Combination ock
import java.util.Scanner;

public class Problem540A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            
            int n = sc.nextInt();
            String original = sc.next();
            String target = sc.next();
            
            int totalMoves = 0;
            
            for (int i = 0; i < n; i++) {
                int d1 = original.charAt(i) - '0';
                int d2 = target.charAt(i) - '0';
                
                // Calculate the direct distance and the wrap-around distance
                int diff = Math.abs(d1 - d2);
                int minMoves = Math.min(diff, 10 - diff);
                
                totalMoves += minMoves;
            }
            
            System.out.println(totalMoves);
        }
    }
}
