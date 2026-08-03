//Problem 144A- Arrival of the General
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem144A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            List<Integer> arr = new ArrayList<>();

            for(int i =0; i<n; i++){
                arr.add(sc.nextInt());
            }

            int max = Collections.max(arr);
            int min = Collections.min(arr);
            int maxIndex = arr.indexOf(max);
            int minIndex = arr.lastIndexOf(min);

            if(arr.indexOf(max) == 0 && arr.indexOf(min) == n-1){
                System.out.println(0);
            } else{
                if(maxIndex < minIndex){
                    System.out.println(maxIndex + (n - 1 - minIndex));
                } else{
                    System.out.println(maxIndex + (n - 1 - minIndex) - 1);
                }
            }
        }
        
    }
}
