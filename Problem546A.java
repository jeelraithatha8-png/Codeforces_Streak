//Problem 546A - Solider and Bananas
import java.util.Scanner;

public class Problem546A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextLong()) return;
            
            long k = sc.nextLong();
            long n = sc.nextLong();
            long w = sc.nextLong();
            
            // Calculate total cost: k * (w * (w + 1)) / 2
            long totalCost = k * (w * (w + 1)) / 2;
            
            // Calculate how much he needs to borrow
            long borrow = totalCost - n;
            
            // If he has enough money, he borrows 0
            if (borrow > 0) {
                System.out.println(borrow);
            } else {
                System.out.println(0);
            }
        }
    }
}
