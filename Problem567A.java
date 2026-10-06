//Problem 567A - Lineland Mail
import java.util.Scanner;

public class Problem567A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            
            int n = sc.nextInt();
            long[] x = new long[n];
            
            for (int i = 0; i < n; i++) {
                x[i] = sc.nextLong();
            }
            
            StringBuilder sb = new StringBuilder();
            
            for (int i = 0; i < n; i++) {
                long mini, maxi;
                
                // Calculate minimum cost
                if (i == 0) {
                    mini = x[1] - x[0];
                } else if (i == n - 1) {
                    mini = x[n - 1] - x[n - 2];
                } else {
                    mini = Math.min(x[i] - x[i - 1], x[i + 1] - x[i]);
                }
                
                // Calculate maximum cost
                maxi = Math.max(x[i] - x[0], x[n - 1] - x[i]);
                
                sb.append(mini).append(" ").append(maxi).append("\n");
            }
            
            System.out.print(sb.toString());
        }
    }
}
