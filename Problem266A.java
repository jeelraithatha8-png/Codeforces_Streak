//Problem 266A- Stones on the Table
import java.util.Scanner;

public class Problem266A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            int n = sc.nextInt();
            String s = sc.next();
            
            int removeCount = 0;
            
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    removeCount++;
                }
            }
            
            System.out.println(removeCount);
        }
    }
}