//Problem 38A- Army
import java.util.Scanner;

public class Problem38A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Read n (number of ranks)
            int n = sc.nextInt();
            
            // Read the d array of size n - 1
            int[] d = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                d[i] = sc.nextInt();
            }
            
            // Read current rank 'a' and target rank 'b'
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int totalYears = 0;
            
            // Sum up the years needed from rank a to rank b-1
            for (int i = a - 1; i < b - 1; i++) {
                totalYears += d[i];
            }
            
            System.out.println(totalYears);
        }
        
    }        
}
