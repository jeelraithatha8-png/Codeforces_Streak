//Problem 450A - Jzzhu and Children
import java.util.Scanner;

public class Problem450A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int lastChild = 0;
            double maxTurns = -1; 
            
            for (int i = 1; i <= n; i++) {
                int a = sc.nextInt();
                int turns = (a + m - 1) / m;
                
                if (turns >= maxTurns) {
                    maxTurns = turns;
                    lastChild = i;
                }
            }
            
            System.out.println(lastChild);
        }
        
    }
}