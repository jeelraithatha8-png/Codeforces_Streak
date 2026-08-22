//Problem 265A- Colorful Stones (Simplified Edition)
import java.util.Scanner;

public class Problem265A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNext()) return;
            String s = sc.next();
            String t = sc.next();
            
            int pos = 0;
            
            for (int i = 0; i < t.length(); i++) {
                char instruction = t.charAt(i);
                
                if (pos < s.length() && s.charAt(pos) == instruction) {
                    pos++;
                }
            }
            
            System.out.println(pos + 1);
        }
    }
}