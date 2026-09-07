//Problem 415A- Mashmokh and Lights
import java.util.Scanner;

public class Problem415A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] arr = new int[n+1];
			for(int i = 0; i < m; i++){
			    int b = sc.nextInt();
			    for(int j = b; j <= n; j++){
			        if(arr[j] == 0){
			            arr[j] = b;
			        }
			    }
			}

			for(int i = 1; i <= n; i++){
			    System.out.print(arr[i] + " ");
			}
		}
        System.out.println();

    }
}
