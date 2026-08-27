//Problem 334A- Candy Bags
import java.util.Scanner;

public class Problem334A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            int n = sc.nextInt();
            
            int left = 1;
            int right = n * n;
            
            // We have n brothers, print n lines
            for (int i = 1; i <= n; i++) {
                StringBuilder sb = new StringBuilder();
                
                // Each brother gets n bags
                for (int j = 0; j < n; j++) {
                    if (j % 2 == 0) {
                        sb.append(left++).append(" ");
                    } else {
                        sb.append(right--).append(" ");
                    }
                }
                System.out.println(sb.toString().trim());
            }
        }
    }
}