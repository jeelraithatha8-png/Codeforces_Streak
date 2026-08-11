// Problem 181A - Series of Crimes
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Problem181A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().trim().split("\\s+");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        
        int ansRow = 0;
        int ansCol = 0;
        
        // Read the map row by row (1-indexed)
        for (int i = 1; i <= n; i++) {
            String line = br.readLine();
            for (int j = 1; j <= m; j++) {
                if (line.charAt(j - 1) == '*') {
                    // XOR the row and column indices of each asterisk found
                    ansRow ^= i;
                    ansCol ^= j;
                }
            }
        }
        
        // The remaining values after XOR cancellation are the coordinates of the fourth point
        System.out.println(ansRow + " " + ansCol);
    }
} 