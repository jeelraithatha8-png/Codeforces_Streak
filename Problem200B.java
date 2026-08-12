//Problem 200B- Drinks
import java.util.Scanner;

public class Problem200B {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            double sum = 0;

            for(int i = 0; i<n;i++){
                arr[i] = sc.nextInt();
                sum += (arr[i]/100.0);
            }
            
            System.out.println((sum/n)*100);
        }
    }
}