//Problem 236A- Boy or Girl
import java.util.Scanner;

public class Problem236A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String user_name = sc.next();
            int[] arr = new int[26];

            for(int i = 0; i<user_name.length(); i++){
                arr[user_name.charAt(i) - 'a']++;
            }

            int count = 0;
            for(int i = 0; i<26; i++){
                if(arr[i] > 0){
                    count++;
                }
            }

            if(count%2 == 0){
                System.out.println("CHAT WITH HER!");
            } else{
                System.out.println("IGNORE HIM!");
            }
        }
    }  
}