//Problem 420A- Start Up
import java.util.Scanner;

public class Problem420A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.next();

            String validChars = "AHIMOTUVWXY";
            boolean isMirror = true;
            for(int i = 0; i < name.length(); i++){
                char c = name.charAt(i);

                if(validChars.indexOf(c) == -1){
                    isMirror = false;
                    break;
                }

                if(c != name.charAt(name.length() - 1 -i)){
                    isMirror = false;
                    break;
                }
            } 

            if(isMirror){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
