//Problem 268B- Buttons
import java.util.Scanner;

public class Problem268B {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            int n = sc.nextInt();
            
            int totalPushes = 0;
            
            for (int i = 1; i <= n; i++) {
                totalPushes += i * (n - i) + 1;
            }
            
            System.out.println(totalPushes);
        }
    }
}