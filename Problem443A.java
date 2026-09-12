//Problem 443A - Anton and Letters
import java.util.HashSet;
import java.util.Scanner;

public class Problem443A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextLine()) return;
            
            String s = sc.nextLine();
            HashSet<Character> uniqueLetters = new HashSet<>();
            
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    uniqueLetters.add(c);
                }
            }
            System.out.println(uniqueLetters.size());
        }
    }
}