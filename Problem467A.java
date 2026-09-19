//Problem 467A - George and Accommodation
import java.util.Scanner;

public class Problem467A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            
            int n = sc.nextInt();
            int validRooms = 0;
            
            for (int i = 0; i < n; i++) {
                int p = sc.nextInt(); // current people
                int q = sc.nextInt(); // total capacity
                
                // Check if there are at least 2 free spots for George and Alex
                if (q - p >= 2) {
                    validRooms++;
                }
            }
            
            System.out.println(validRooms);
        }
    }
}