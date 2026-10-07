//Problem 580A -  Kefa and First Steps
import java.util.Scanner;

public class Problem580A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            
            int n = sc.nextInt();
            long[] a = new long[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            
            if (n == 0) {
                System.out.println(0);
                return;
            }
            
            int maxLength = 1;
            int currentLength = 1;
            
            for (int i = 1; i < n; i++) {
                if (a[i] >= a[i - 1]) {
                    currentLength++;
                } else {
                    currentLength = 1; // Reset if the non-decreasing order breaks
                }
                
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            }
            
            System.out.println(maxLength);
        }
    }
}
