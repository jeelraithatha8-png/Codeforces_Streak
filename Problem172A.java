//Problem 172A- Phone Code
import java.util.Scanner;

public class Problem172A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            int n = sc.nextInt();
            
            String base = sc.next();
            int commonLength = base.length();
            
            for (int i = 1; i < n; i++) {
                String s = sc.next();
                int match = 0;
                
                for (int j = 0; j < base.length(); j++) {
                    if (base.charAt(j) == s.charAt(j)) {
                        match++;
                    } else {
                        break;
                    }
                }
                
                commonLength = Math.min(commonLength, match);
            }
            
            System.out.println(commonLength);
        }

    }
        
}
