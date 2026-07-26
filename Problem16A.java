//Problem 16A- Flag
import java.util.Scanner;

public class Problem16A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String[] flag = new String[n];
            
            for (int i = 0; i < n; i++) {
                flag[i] = sc.next();
            }
            
            
            boolean isStriped = true;
            for (int i = 0; i < n; i++) {
                // Check if all characters in the current row are the same
                for (int j = 1; j < m; j++) {
                    if (flag[i].charAt(j) != flag[i].charAt(0)) {
                        isStriped = false;
                    }
                }
                
                // Check if current row color is different from previous row color
                if (i > 0 && flag[i].charAt(0) == flag[i - 1].charAt(0)) {
                    isStriped = false;
                }
            }
            
            if (isStriped) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
