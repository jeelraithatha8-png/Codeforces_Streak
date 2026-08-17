//Problem 248A- Cupboards
import java.util.Scanner;

public class Problem248A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            int n = sc.nextInt();
            
            int leftOpen = 0;
            int leftClosed = 0;
            int rightOpen = 0;
            int rightClosed = 0;
            
            for (int i = 0; i < n; i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                
                if (l == 1) {
                    leftOpen++;
                } else {
                    leftClosed++;
                }
                
                if (r == 1) {
                    rightOpen++;
                } else {
                    rightClosed++;
                }
            }
            
            int totalSeconds = Math.min(leftOpen, leftClosed) + Math.min(rightOpen, rightClosed);
            
            System.out.println(totalSeconds);
        }
    }
}