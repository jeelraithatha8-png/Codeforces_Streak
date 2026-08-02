//Problem 141A- Amusing Joke
import java.util.Scanner;

public class Problem141A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String guest = sc.nextLine();
            String host = sc.nextLine();
            String pile = sc.nextLine();

            String combined = guest + host;

            if(combined.length() != pile.length()){
                System.out.println("NO");
                return;
            } 
            
            int[] count = new int[26];

            for(char c: combined.toCharArray()){
                count[c - 'A']++;
            }

            for(char p : pile.toCharArray()){
                count[p - 'A']--;
            }
            
            boolean isAmusing = true;
            for(int i = 0; i<26; i++){
                if(count[i] != 0){
                    isAmusing = false;
                    break;
                }
            }

            if(isAmusing){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
