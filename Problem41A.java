//Problem 41A- Translation
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem41A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Read string s and string t line by line
        String s = br.readLine();
        String t = br.readLine();
        
        // Safety check if inputs are null
        if (s == null || t == null) {
            return;
        }
        
        // Reverse s using StringBuilder
        String reversedS = new StringBuilder(s).reverse().toString();
        
        // Compare with t
        if (reversedS.equals(t)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}