//Problem 551A - GukiZ and Contest
import java.util.Scanner;

public class Problem551A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            
            int n = sc.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            int[] positions = new int[n];
            
            // For each student, count how many have a strictly higher rating
            for (int i = 0; i < n; i++) {
                int rank = 1;
                for (int j = 0; j < n; j++) {
                    if (a[j] > a[i]) {
                        rank++;
                    }
                }
                positions[i] = rank;
            }
            
            // Print the result separated by spaces
            for (int i = 0; i < n; i++) {
                System.out.print(positions[i] + (i == n - 1 ? "" : " "));
            }
        }
        System.out.println();
    }
}
