//Problem 435A- Queue on Bus Stop
import java.util.Scanner;

public class Problem435A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] arr = new int[n];
            int count = 0;
            int sum = 0;

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            for(int i = 0; i < n; i++){
                if(arr[i] > m){
                    count += 2;
                } else if(arr[i] < m){
                    for(int j = i; j < n; j++){
                        sum += arr[j];
                        if(sum <= m){
                            i = j;
                        } else{
                            i = j-1;
                            break;
                        }
                    }
                    count++;
                    sum = 0;
                } else{
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
