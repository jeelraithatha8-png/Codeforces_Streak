//Problem 465A - inc ARG
import java.util.Scanner;

public class Problem465A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            
            int n = sc.nextInt();
            String s = sc.next();
            
            int changedBits = 0;
            
            for (int i = 0; i < n; i++) {
                changedBits++;
                if (s.charAt(i) == '0') {
                    break;
                }
            }
            
            System.out.println(changedBits);
        }
    }
}