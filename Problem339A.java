//Problem 339A- Helpful Maths
import java.util.Arrays;
import java.util.Scanner;

public class Problem339A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();
            
            char[] digits = s.replace("+", "").toCharArray();
            
            // Sort the digits in non-decreasing order
            Arrays.sort(digits);
            
            // Build the new formatted sum string
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < digits.length; i++) {
                result.append(digits[i]);
                if (i < digits.length - 1) {
                    result.append("+");
                }
            }
            
            System.out.println(result.toString());
        }
    }
}