//Problem 376A- Lever
import java.util.Scanner;

public class Problem376A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();
            
            long left = 0;
            long right = 0;
            int pivot = s.indexOf('^');

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isDigit(c)) {
                    int mass = c - '0'; // Convert char to actual integer number
                    int distance = Math.abs(i - pivot);
                
                    if (i < pivot) {
                        left += (long) mass * distance;
                    } else if (i > pivot) {
                        right += (long) mass * distance;
                    }
                }
            }

            if(left == right){
                System.out.println("balance");
            } else if (left > right){
                System.out.println("left");
            } else{
                System.out.println("right");
            }
        }
    }
}
