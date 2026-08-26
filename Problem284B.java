//Problem 284B- Cows and Poker Game
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem284B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String nStr = br.readLine();
        if (nStr == null || nStr.trim().isEmpty()) return;
        int n = Integer.parseInt(nStr.trim());
        
        String s = br.readLine().trim();
        
        int totalA = 0;
        int totalI = 0;
        
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'A') {
                totalA++;
            } else if (c == 'I') {
                totalI++;
            }
        }
        
        int ans = switch (totalI) {
            case 0 -> totalA;
            case 1 -> 1;
            default -> 0;
        }; 
        
        System.out.println(ans);
    }
}