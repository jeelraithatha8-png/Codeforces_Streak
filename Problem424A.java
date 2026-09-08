//Problem 424A- Squats
import java.util.Scanner;

public class Problem424A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            String s = sc.next();

            int count = 0;
            String ans = "";
            for(char c : s.toCharArray()){
                if(c == 'X'){
                    count++;
                }
            }

            if(count < n/2){
                System.out.println(n/2 - count);
                for(int i = 0; i < n; i++){
                    if(s.charAt(i) == 'x' && count < n/2){
                        ans += 'X';
                        count++;
                    } else{
                        ans += s.charAt(i);
                    }
                }
                System.out.println(ans);
            } else if(count > n/2){
                System.out.println(count - n/2);
                for(int i = 0; i < n; i++){
                    if(s.charAt(i) == 'X' && count > n/2){
                        ans += 'x';
                        count--;
                    } else{
                        ans += s.charAt(i);
                    }
                }
                System.out.println(ans);
            } else{
                System.out.println(0);
                System.out.println(s);
            }
        }
    }
}
