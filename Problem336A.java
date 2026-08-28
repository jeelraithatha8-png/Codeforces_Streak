//Problem 336A- Vasily the Bear and Triangle
import java.util.Scanner;

public class Problem336A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextLong()) return;
            long x = sc.nextLong();
            long y = sc.nextLong();
            
            long sumAbs = Math.abs(x) + Math.abs(y);
            
            long x1, y1, x2, y2;
            
            if (x > 0 && y > 0) {
                x1 = 0;
                y1 = sumAbs;
                x2 = sumAbs;
                y2 = 0;
            } else if (x < 0 && y > 0) {
                x1 = -sumAbs;
                y1 = 0;
                x2 = 0;
                y2 = sumAbs;
            } else if (x < 0 && y < 0) {
                x1 = -sumAbs;
                y1 = 0;
                x2 = 0;
                y2 = -sumAbs;
            } else {
                x1 = 0;
                y1 = -sumAbs;
                x2 = sumAbs;
                y2 = 0;
            }
            
            System.out.println(x1 + " " + y1 + " " + x2 + " " + y2);
        }
    }
}