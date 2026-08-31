//Problem 344A- Magnets
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem344A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String nStr = br.readLine();
        if (nStr == null || nStr.trim().isEmpty()) return;
        int n = Integer.parseInt(nStr.trim());
        
        int groups = 1; // At least 1 group if there is 1 or more magnets
        String prev = br.readLine().trim();
        
        for (int i = 1; i < n; i++) {
            String curr = br.readLine().trim();
            // If the current magnet's orientation is different from the previous, it's a new group
            if (!curr.equals(prev)) {
                groups++;
            }
            prev = curr;
        }
        
        System.out.println(groups);
    }
}