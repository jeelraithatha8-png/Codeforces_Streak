//Problem 276A- Lunch Rush
import java.util.Scanner;

public class Problem276A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int ans = Integer.MIN_VALUE;

            for (int i = 0 ; i < n; i++){
                int f = sc.nextInt();
                int t = sc.nextInt();

                if(t > k){
                    f = f - (t - k);
                }

                ans = Math.max(f, ans);
            }
            
            System.out.println(ans);
        }
    }

}
