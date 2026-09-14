//Problem 447A - DZY Loves Hash
import java.util.Scanner;

public class Problem447A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            
            int p = sc.nextInt();
            int n = sc.nextInt();
            boolean[] filled = new boolean[p];
            
            for (int i = 1; i <= n; i++) {
                int x = sc.nextInt();
                int hash = x % p; 
                
                if (filled[hash]) {
                    System.out.println(i);
                    return; 
                } else {
                    filled[hash] = true;
                }
            }
        }
        System.out.println("-1");
        
    }
}