//Problem 441A- Valera and Anitque Items
import java.util.ArrayList;
import java.util.Scanner;

public class Problem441A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            
            int n = sc.nextInt();
            long v = sc.nextLong(); // Using long for money to be safe
            
            ArrayList<Integer> validSellers = new ArrayList<>();
            
            for (int i = 1; i <= n; i++) {
                int ki = sc.nextInt();
                boolean canBuyFromThisSeller = false;
                
                for (int j = 0; j < ki; j++) {
                    long price = sc.nextLong();
                    // If price is strictly less than v, Valera can outbid it
                    if (price < v) {
                        canBuyFromThisSeller = true;
                    }
                }
                
                // Even if multiple items are cheaper, we record this seller only once
                if (canBuyFromThisSeller) {
                    validSellers.add(i);
                }
            }
            
            // Print total number of valid sellers
            System.out.println(validSellers.size());
            
            // Print the seller indices separated by spaces
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < validSellers.size(); i++) {
                sb.append(validSellers.get(i));
                if (i < validSellers.size() - 1) {
                    sb.append(" ");
                }
            }
            System.out.println(sb.toString());
        }
    }
}