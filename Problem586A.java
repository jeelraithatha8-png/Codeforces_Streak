//Problem 586A -  Alena's Schedule
import java.util.Scanner;

public class Problem586A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            
            int n = sc.nextInt();
            int[] a = new int[n];
            
            int first = -1;
            int last = -1;
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 1) {
                    if (first == -1) {
                        first = i;
                    }
                    last = i;
                }
            }
            
            // If there are no classes at all
            if (first == -1) {
                System.out.println(0);
                return;
            }
            
            int universityTime = 0;
            
            // Count from the first class to the last class
            for (int i = first; i <= last; i++) {
                if (a[i] == 1) {
                    universityTime++;
                } else {
                    // Check if this single '0' is surrounded by classes (a single break)
                    if (i > 0 && i < n - 1 && a[i - 1] == 1 && a[i + 1] == 1) {
                        universityTime++;
                    }
                }
            }
            
            System.out.println(universityTime);
        }
    }
}
