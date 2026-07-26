//Problem 59A- Word
import java.util.Scanner;

public class Problem59A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            StringBuilder u = new StringBuilder();
            StringBuilder l = new StringBuilder();

            StringBuilder ans = new StringBuilder();
            
            for(int i = 0; i<s.length(); i++){
                if(Character.isUpperCase(s.charAt(i))){
                    u.append(s.charAt(i));
                } else{
                    l.append(s.charAt(i));
                }
            }

            if(u.length() > l.length()){
                for(int i = 0; i<s.length(); i++){
                    ans.append(Character.toUpperCase(s.charAt(i)));
                }
            } else{
               for(int i = 0; i<s.length(); i++){
                    ans.append(Character.toLowerCase(s.charAt(i)));
                } 
            }

            System.out.println(ans);
        }
    }        
}
