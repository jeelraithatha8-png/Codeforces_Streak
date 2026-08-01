//Problem 104A- Blackjack
import java.util.Scanner;

public class Problem104A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            
            // If n is less than 11 or greater than 21, no card can make this sum
            if (n < 11 || n > 21) {
                System.out.println(0);
            } else if (n == 20) {
                // 15 cards are worth 10 points (since queen of spades is already taken)
                System.out.println(15);
            } else if (n == 11 || n == 21) {
                // 4 aces (worth 1 or 11)
                System.out.println(4);
            } else {
                // Cards with values from 2 to 9 have 4 suits each
                System.out.println(4);
            }
        }
    }       
}
