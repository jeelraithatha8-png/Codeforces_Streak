//Problem 520A - Pangram
import java.util.HashSet;
import java.util.Scanner;

public class Problem520A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            
            int n = sc.nextInt();
            String s = sc.next();
            
            // Convert the string to lowercase to treat 'A' and 'a' the same
            s = s.toLowerCase();
            
            HashSet<Character> uniqueLetters = new HashSet<>();
            
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                // Only add alphabetic characters (a-z)
                if (c >= 'a' && c <= 'z') {
                    uniqueLetters.add(c);
                }
            }
            
            // A pangram must contain all 26 letters of the English alphabet
            if (uniqueLetters.size() == 26) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
