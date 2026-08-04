//Problem 146A- Lucky Ticket
import java.util.Scanner;

public class Problem146A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            String num = sc.next();
            boolean isLucky = true;

            for(int i = 0; i<n; i++){
                if(num.charAt(i) != '4' && num.charAt(i) != '7'){
                    isLucky = false;
                    break;
                } 
            }
            if(isLucky){
                int sum1 = 0  , sum2 = 0; 
                for(int j = 0; j<n/2; j++){
                    sum1 += Integer.parseInt(String.valueOf(num.charAt(j))); 
                }

                for(int j = n/2; j<n; j++){
                    sum2 += Integer.parseInt(String.valueOf(num.charAt(j))); 
                }

                if(sum1 == sum2){
                    System.out.println("YES");
                } else{
                    System.out.println("NO");
                }
            } else{
                System.out.println("NO");
            }
        } 

    }
        
}
