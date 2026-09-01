//Problem 373A- Collecting Beats is Fun
import java.util.*;

public class Problem373A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int k = sc.nextInt() * 2;
            HashMap<Character, Integer> map = new HashMap<>();
            
            for(int i = 0; i < 4; i++){
                String s = sc.next();
                for(char c : s.toCharArray()){
                    if (c != '.') {
                        map.put(c, map.getOrDefault(c, 0) + 1);
                    }
                }
            }
            
            for(char c : map.keySet()){
                if(map.get(c) > k){
                    System.out.println("NO");
                    return;
                }
            }
            
            System.out.println("YES");
        }
    }
}