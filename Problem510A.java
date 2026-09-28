//Problem 510A - Fox and Snake 
import java.util.Scanner;

public class Problem510A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            
            int n = sc.nextInt();
            int m = sc.nextInt();
        
            for (int i = 0; i < n; i++) {
                StringBuilder sb = new StringBuilder();
                
                if (i % 2 == 0) {
                // Odd rows (1st, 3rd, 5th, etc.) are completely filled with '#'
                    for (int j = 0; j < m; j++) {
                        sb.append("#");
                    }
                } else {
                // Even rows alternate between having '#' at the end or at the beginning
                    if ((i / 2) % 2 == 0) {
                    // '#' at the very end of the row
                        for (int j = 0; j < m - 1; j++) {
                            sb.append(".");
                        }
                        sb.append("#");
                } else {
                    // '#' at the very beginning of the row
                        sb.append("#");
                        for (int j = 0; j < m - 1; j++) {
                            sb.append(".");
                        }
                }
            }
            
            System.out.println(sb.toString());
            }
        }
    }
}
