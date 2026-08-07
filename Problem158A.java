//Problem 158A- Next Round
import java.util.Scanner;

public class Problem158A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            int count = 0;

            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
                if(arr[i] >= arr[k-1] && arr[i] > 0){
                    count++;            }
            }

            System.out.println(count);
        }

    }
        
}
