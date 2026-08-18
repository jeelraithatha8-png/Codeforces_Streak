//Problem 262A- Roma and Lucky Numbers
import java.util.Scanner;

public class Problem262A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int count = 0;
            int ans = 0;
            String[] arr = new String[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.next();
            }

            for(String num : arr){
                for(int j = 0; j < num.length(); j++){
                    if(num.charAt(j) == '4' || num.charAt(j) == '7'){
                        count++;
                    }
                }
                if(count <= k){
                    ans++;
                }
                count = 0;
            }

            System.out.println(ans);
        }
    }
}