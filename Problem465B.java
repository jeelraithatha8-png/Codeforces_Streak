//Problem 465B - Inbox(100500)
import java.util.ArrayList;
import java.util.Scanner;

public class Problem465B {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            
            int n = sc.nextInt();
            int[] letters = new int[n];
            
            ArrayList<Integer> unreadIndices = new ArrayList<>();
            
            for (int i = 0; i < n; i++) {
                letters[i] = sc.nextInt();
                if (letters[i] == 1) {
                    unreadIndices.add(i);
                }
            }
            
            // If there are no unread letters, 0 operations needed
            if (unreadIndices.isEmpty()) {
                System.out.println(0);
                return;
            }
            
            int operations = 0;
            
            // We start by opening the first unread letter
            operations += 1; 
            
            // Check gaps between consecutive unread letters
            for (int i = 1; i < unreadIndices.size(); i++) {
                int gap = unreadIndices.get(i) - unreadIndices.get(i - 1);
                
                if (gap == 1) {
                    // If they are right next to each other, just scroll to the next (1 operation)
                    operations += 1;
                } else {
                    // If there are 0s between them, compare cost:
                    // Scrolling through the 0s takes (gap) operations.
                    // Returning to the list and opening the next takes 2 operations.
                    // We take the minimum of the two!
                    operations += Math.min(gap, 2);
                }
            }
            
            System.out.println(operations);
        }
    }
}