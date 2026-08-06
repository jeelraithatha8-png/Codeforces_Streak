//Problem 151A- Soft Drinking
import java.util.Scanner;

public class Problem151A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int l = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int p = sc.nextInt();
            int nl = sc.nextInt();
            int np = sc.nextInt();

            int total_drink = (k * l)/ nl;
            int total_limes = c*d;
            int total_salt = p/np;

            int total_toasts = Math.min(total_drink,Math.min(total_limes, total_salt))/n;

            System.out.println(total_toasts);
        }

    }
        
}
