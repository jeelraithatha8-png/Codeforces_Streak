//Problem 486A - Calculating Function
import java.util.Scanner;

public class Problem486A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextLong()) return;
            
            long n = sc.nextLong();
            long result;
            
            // If n is even, f(n) = n / 2
            // If n is odd, f(n) = -(n + 1) / 2
            if (n % 2 == 0) {
                result = n / 2;
            } else {
                result = -(n + 1) / 2;
            }
            
            System.out.println(result);
        }
    }
}