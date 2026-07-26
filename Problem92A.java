//Problem 92A- Chips
import java.util.Scanner;

public class Problem92A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            boolean process_end = false;

            while(process_end == false){
                for(int i = 1; i<n+1; i++){
                    if(m<i){
                        process_end = true;
                        System.out.println(m);
                        break;
                    } else{
                        m -=i;
                    }
                }
            }
        }
        
    }        
}
