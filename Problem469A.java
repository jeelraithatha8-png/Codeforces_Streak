//Problem 469A - I Wanna Be the Guy
import java.util.HashSet;
import java.util.Scanner;

public class Problem469A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            
            int n = sc.nextInt();
            HashSet<Integer> levelsPassed = new HashSet<>();
            
            // Read Little X's levels
            int p = sc.nextInt();
            for (int i = 0; i < p; i++) {
                levelsPassed.add(sc.nextInt());
            }
            
            // Read Little Y's levels
            int q = sc.nextInt();
            for (int i = 0; i < q; i++) {
                levelsPassed.add(sc.nextInt());
            }
            
            // If the number of unique levels they can clear equals n, they win!
            if (levelsPassed.size() == n) {
                System.out.println("I become the guy.");
            } else {
                System.out.println("Oh, my keyboard!");
            }
        }
    }
}