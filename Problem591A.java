//Problem 591A -  Wizards' Duel
import java.util.Scanner;

public class Problem591A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextDouble()) return;
            
            double l = sc.nextDouble();
            double p = sc.nextDouble();
            double q = sc.nextDouble();
            
            // The second meeting occurs at the exact same distance from Harry as the first meeting
            double distance = (l * p) / (p + q);
            
            System.out.println(distance);
        }
    }
}
