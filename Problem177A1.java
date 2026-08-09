//Problem 177A1- Good Matrix Elements
import java.util.Scanner;

public class Problem177A1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            int n = sc.nextInt();
            
            int sum = 0;
            int mid = n / 2; // The index of the middle row and column
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int val = sc.nextInt();
                    
                    // Check if the element belongs to any of the 4 good categories
                    if (i == j || (i + j == n - 1) || i == mid || j == mid) {
                        sum += val;
                    }
                }
            }
            
            System.out.println(sum);
        }
    }
}