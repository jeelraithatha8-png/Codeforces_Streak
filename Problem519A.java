//Problem 519A - A and B and Chess
import java.util.Scanner;

public class Problem519A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int whiteScore = 0;
            int blackScore = 0;
            
            // The chessboard always has 8 rows
            for (int i = 0; i < 8; i++) {
                if (!sc.hasNext()) return;
                String row = sc.next();
                
                for (int j = 0; j < 8; j++) {
                    char c = row.charAt(j);
                    
                    // Evaluate White pieces (Uppercase)
                    switch (c) {
                        case 'Q' -> whiteScore += 9;
                        case 'R' -> whiteScore += 5;
                        case 'B', 'N' -> whiteScore += 3;
                        case 'P' -> whiteScore += 1;
                        case 'q' -> blackScore += 9;
                        case 'r' -> blackScore += 5;
                        case 'b', 'n' -> blackScore += 3;
                        case 'p' -> blackScore += 1;
                        default -> {
                        }
                    }
                }
            }
            
            // Compare the total scores
            if (whiteScore > blackScore) {
                System.out.println("White");
            } else if (blackScore > whiteScore) {
                System.out.println("Black");
            } else {
                System.out.println("Draw");
            }
        }
    }
}
