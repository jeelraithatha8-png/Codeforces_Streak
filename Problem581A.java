//Problem 581A -  Vasya the Hipster
import java.util.Scanner;

public class Problem581A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            // Days with different colored socks
            int diffDays = Math.min(a, b);
            
            // Days with same colored socks using the remaining socks
            int sameDays = Math.abs(a - b) / 2;
            
            System.out.println(diffDays + " " + sameDays);
        }
    }
}
