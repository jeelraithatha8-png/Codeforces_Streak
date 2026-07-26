//Problem 34A- Reconnaissance-2
import java.util.Scanner;

public class Problem34A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] heights = new int[n];
            

            for(int i = 0; i<n; i++){
                heights[i] = sc.nextInt();
            }

            int minDiff = Integer.MAX_VALUE;
            int index1 = -1;
            int index2 = -1;
            
            for (int i = 0; i < n; i++) {
                // Use modulo to handle the circular wrap-around
                int next = (i + 1) % n;
                int diff = Math.abs(heights[i] - heights[next]);
                
                if (diff < minDiff || diff == minDiff) {
                    minDiff = diff;
                    // Store 1-based indices as requested by the output format
                    index1 = i + 1;
                    index2 = next + 1;
                }
            }
            System.out.println(index1 + " " + index2);
        }
    }        
}
