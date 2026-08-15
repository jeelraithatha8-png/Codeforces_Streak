//Problem 245A- System Administrator
import java.util.Scanner;

public class Problem245A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            int n = sc.nextInt();
            
            int totalSentA = 0;
            int successA = 0;
            
            int totalSentB = 0;
            int successB = 0;
            
            for (int i = 0; i < n; i++) {
                int t = sc.nextInt();
                int x = sc.nextInt();
                int y = sc.nextInt();
                
                if (t == 1) {
                    totalSentA += (x + y); 
                    successA += x;
                } else {
                    totalSentB += (x + y); 
                    successB += x;
                }
            }
            
            if (successA * 2 >= totalSentA) {
                System.out.println("LIVE");
            } else {
                System.out.println("DEAD");
            }
            
            if (successB * 2 >= totalSentB) {
                System.out.println("LIVE");
            } else {
                System.out.println("DEAD");
            }
        }
    }
}
