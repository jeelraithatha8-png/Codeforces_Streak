//Problem 136A- Presents
import java.util.Scanner;

public class Problem136A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n+1];
            int[] ans = new int[n+1];

            for(int i = 1; i<=n; i++){
                arr[i] = sc.nextInt();
                ans[arr[i]] = i;
            }

            for(int i = 1; i<=n; i++){
                System.out.print(ans[i] + " ");
            }
        }
        System.out.println();
    }
}
