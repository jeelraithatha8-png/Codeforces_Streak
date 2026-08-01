//Problem 112A- Petya and Strings
import java.util.Scanner;

public class Problem112A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s1 = sc.next();
            String s2 = sc.next();
            boolean is_equal = true; 
            int index = 0;

            for(int i = 0; i<s1.length(); i++){
                if(Character.toUpperCase(s1.charAt(i)) == Character.toUpperCase(s2.charAt(i))){
                    is_equal = true;
                } else{
                    is_equal = false;
                    index = i;
                    break;
                }
            }

            if(is_equal == true){
                System.out.println(0);
            } else{
                if(Character.toUpperCase(s1.charAt(index)) > Character.toUpperCase(s2.charAt(index))){
                    System.out.println(1);
                } else{
                    System.out.println(-1);
                }
            }
        }
    }       
}
