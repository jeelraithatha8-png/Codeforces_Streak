//Problem 501A - Contest
import java.util.Scanner;

public class Problem501A {
    // Helper method to calculate Codeforces score
    private static double calculateScore(int p, int t) {
        double option1 = (3.0 * p) / 10.0;
        double option2 = p - (p / 250.0) * t;
        return Math.max(option1, option2);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            
            double mishaScore = calculateScore(a, c);
            double vasyaScore = calculateScore(b, d);
            
            if (mishaScore > vasyaScore) {
                System.out.println("Misha");
            } else if (vasyaScore > mishaScore) {
                System.out.println("Vasya");
            } else {
                System.out.println("Tie");
            }
        }
    }
}