//Problem 61A- Ultra-Fast-Mathematician
import java.util.Scanner;

public class Problem61A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s1 = sc.next();
            String s2 = sc.next();

            StringBuilder ans = new StringBuilder();

            for(int i = 0; i<s1.length(); i++){
                if(s1.charAt(i) != s2.charAt(i)){
                    ans.append("1");
                } else{
                    ans.append("0");
                }
            } 

            System.out.println(ans);
        }
    }        
}

