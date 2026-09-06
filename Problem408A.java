//Problem 408A- Line to Cashier
import java.util.Scanner;

public class Problem408A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int seconds = 0;
            int[] k = new int[n];

            int min = Integer.MAX_VALUE;

            for(int i = 0; i < n; i++){
                k[i] = sc.nextInt();
            }

            for(int i = 0; i < n; i++){
                for(int j = 0; j < k[i]; j++){
                    seconds += (sc.nextInt()) * 5;
                }

                seconds += k[i]*15;
                min = Math.min(seconds, min);
                seconds = 0;
            }

            System.out.println(min);
        }

    }
}