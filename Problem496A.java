//Problem 496A - Minimum Difficulty
import java.util.Scanner;

public class Problem496A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			if (!sc.hasNextInt()) return;
			
			int n = sc.nextInt();
			int[] a = new int[n];
			
			for (int i = 0; i < n; i++) {
			    a[i] = sc.nextInt();
			}
			
			int minDifficulty = Integer.MAX_VALUE;
			
			// Try removing each intermediate hold one by one (from index 1 to n-2)
			for (int i = 1; i < n - 1; i++) {
			    int currentMaxDiff = 0;
			    
			    // Calculate the difficulty of the track if hold 'i' is removed
			    for (int j = 0; j < n - 1; j++) {
			        if (j == i) {
			            continue; // Skip the hold being removed
			        }
			        
			        int nextJ = j + 1;
			        if (nextJ == i) {
			            nextJ++; // If the next hold is the one being removed, jump over it
			        }
			        
			        // If nextJ goes out of bounds, break
			        if (nextJ >= n) break;
			        
			        int diff = a[nextJ] - a[j];
			        if (diff > currentMaxDiff) {
			            currentMaxDiff = diff;
			        }
			    }
			    
			    // Find the minimum among all maximum difficulties
			    if (currentMaxDiff < minDifficulty) {
			        minDifficulty = currentMaxDiff;
			    }
			}
			
			System.out.println(minDifficulty);
		}
    }
}