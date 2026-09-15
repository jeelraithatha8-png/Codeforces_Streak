//Problem 451A - Game with Sticks
import java.util.Scanner;

public class Problem451A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			if (!sc.hasNextInt()) return;
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int totalMoves = Math.min(n, m);
			
			if (totalMoves % 2 != 0) {
			    System.out.println("Akshat");
			} else {
			    System.out.println("Malvika");
			}
		}
        
    }
}