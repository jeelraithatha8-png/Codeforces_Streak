//Problem 255A- Greg's Workout
import java.util.Scanner;

public class Problem255A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            int n = sc.nextInt();
            
            int chestSum = 0;
            int bicepsSum = 0;
            int backSum = 0;
            
            for (int i = 0; i < n; i++) {
                int reps = sc.nextInt();
                int remainder = i % 3;
                
                switch (remainder) {
                    case 0 -> chestSum += reps;
                    case 1 -> bicepsSum += reps;
                    default -> backSum += reps;
                }
            }
            
            // Find which muscle got the most exercise
            if (chestSum > bicepsSum && chestSum > backSum) {
                System.out.println("chest");
            } else if (bicepsSum > chestSum && bicepsSum > backSum) {
                System.out.println("biceps");
            } else {
                System.out.println("back");
            }
        }
    }
}