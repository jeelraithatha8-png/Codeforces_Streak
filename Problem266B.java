//Problem 266B- Queue at the School
import java.util.Scanner;

public class Problem266B {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            int n = sc.nextInt();
            int t = sc.nextInt();
            String s = sc.next();
            
            char[] queue = s.toCharArray();
            
            // Simulate for t seconds
            for (int time = 0; time < t; time++) {
                for (int i = 0; i < n - 1; i++) {
                    if (queue[i] == 'B' && queue[i + 1] == 'G') {
                        char temp = queue[i];
                        queue[i] = queue[i + 1];
                        queue[i + 1] = temp;
                        i++; 
                    }
                }
            }
            
            System.out.println(new String(queue));
        }
    }
}