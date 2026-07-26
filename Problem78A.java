//Problem 78A- Haiku
import java.util.Scanner;

public class Problem78A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String s3 = sc.nextLine();

            int n1 = 0;
            int n2 = 0;
            int n3 = 0;
            
            for(int i = 0; i<s1.length(); i++){
                char c = s1.charAt(i);
                if(Character.isLetter(c)){
                    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                        n1 += 1;
                    }
                }
            }

            for(int i = 0; i<s2.length(); i++){
                char c = s2.charAt(i);
                if(Character.isLetter(c)){
                    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                        n2 += 1;
                    }
                }
            }

            for(int i = 0; i<s3.length(); i++){
                char c = s3.charAt(i);
                if(Character.isLetter(c)){
                    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                        n3 += 1;
                    }
                }
            }

            if(n1 == 5  && n2 == 7 && n3 == 5){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
        
    }        
}
