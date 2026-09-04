//Problem 400A- Inna and Choose Options
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Problem400A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null || line.trim().isEmpty()) return;
        
        int t = Integer.parseInt(line.trim());
        int[] aVals = {1, 2, 3, 4, 6, 12};
        int[] bVals = {12, 6, 4, 3, 2, 1};
        
        StringBuilder out = new StringBuilder();
        
        while (t-- > 0) {
            String s = br.readLine().trim();
            ArrayList<String> validPairs = new ArrayList<>();
            
            for (int i = 0; i < 6; i++) {
                int a = aVals[i];
                int b = bVals[i];
                boolean canWin = false;
                
                for (int col = 0; col < b; col++) {
                    boolean allX = true;
                    for (int row = 0; row < a; row++) {
                        int stringIndex = row * b + col;
                        if (s.charAt(stringIndex) != 'X') {
                            allX = false;
                            break;
                        }
                    }
                    if (allX) {
                        canWin = true;
                        break; 
                    }
                }
                
                if (canWin) {
                    validPairs.add(a + "x" + b);
                }
            }
            
            out.append(validPairs.size());
            for (String p : validPairs) {
                out.append(" ").append(p);
            }
            out.append("\n");
        }
        
        System.out.print(out);
    }
}
