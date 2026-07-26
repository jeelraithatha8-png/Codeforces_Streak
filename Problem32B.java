//Problem 32B- Broze
import java.util.Scanner;

public class Problem32B {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String  s = sc.nextLine();
            StringBuilder ans = new StringBuilder();

            int i = 0;
            while (i < s.length()) {
                if (s.charAt(i) == '.') {
                    ans.append("0");
                    i++; // Move 1 step forward
                } 
                else if(s.charAt(i) == '-') {
                    if (i + 1 < s.length() && s.charAt(i + 1) == '.') {
                        ans.append("1");
                    } else if (i + 1 < s.length() && s.charAt(i + 1) == '-')  {
                        ans.append("2");
                    }
                    i += 2; // Move 2 steps forward
                }
            }
            
            System.out.println(ans.toString());
        }
    }

}
