//Problem 110A- Nearly Lucky Number
import java.util.Scanner;

public class Problem110A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String n = sc.next();
            int s = 0;

            for(int i = 0; i<n.length(); i++){
                if(n.charAt(i) == '4' || n.charAt(i) == '7'){
                    s+= 1;
                }
            }

            if(s == 4 || s == 7){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }       
}
