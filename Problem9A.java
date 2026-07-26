//Problem 9A- Die Roll
import java.util.Scanner;

public class Problem9A {
    public static void main(String[] args) {
        // Read the two inputs
        try (Scanner sc = new Scanner(System.in)) {
            // Read the two inputs
            int y = sc.nextInt();
            int w = sc.nextInt();
            
            // Find the maximum roll Dot must beat or match
            int maxRoll = Math.max(y, w);
            
            // Calculate the number of winning faces (6 - maxRoll + 1)
            int numerator = 6 - maxRoll + 1;
            //int denominator = 6;
            
            // Simple way to handle the 6 possible irreducible cases
            switch (numerator) {
                case 1 -> System.out.println("1/6");
                case 2 -> System.out.println("1/3");
                case 3 -> System.out.println("1/2");
                case 4 -> System.out.println("2/3");
                case 5 -> System.out.println("5/6");
                case 6 -> System.out.println("1/1");
                default -> // Case for 0 winning outcomes
                    System.out.println("0/1");
            }
        }
    }
}
