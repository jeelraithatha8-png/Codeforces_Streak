//Problem 49A- Sleuth
import java.util.Scanner;

public class Problem49A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            
            char last = ' ';
            for(int i = s.length()-1; i>=0; i--){
                char c = s.charAt(i);
                if(Character.isLetter(c)){
                    last = Character.toUpperCase(c);
                    break;
                }
            }

            if(last == 'A' || last == 'E' || last == 'I' || last == 'O' || last == 'U' || last == 'Y'){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }        
}