//Problem 454A - Little Pony and Crystal Mine
import java.util.Scanner;

public class Problem454A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            
            int n = sc.nextInt();
            int mid = n / 2;
            
            for (int i = 0; i < n; i++) {
                // Distance from the center row
                int distance = Math.abs(mid - i);
                
                // Number of '*' characters on one side
                int stars = distance;
                // Number of 'D' characters in the middle
                int dCount = n - (2 * distance);
                
                StringBuilder sb = new StringBuilder();
                
                // Append left stars
                for (int j = 0; j < stars; j++) {
                    sb.append('*');
                }
                // Append D's
                for (int j = 0; j < dCount; j++) {
                    sb.append('D');
                }
                // Append right stars
                for (int j = 0; j < stars; j++) {
                    sb.append('*');
                }
                
                System.out.println(sb.toString());
            }
        }
    }
}