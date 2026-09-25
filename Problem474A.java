//Problem 474A - Keyboard
import java.util.Scanner;

public class Problem474A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNext()) return;
            
            char direction = sc.next().charAt(0);
            String typed = sc.next();
            
            String[] keyboard = {
                "qwertyuiop",
                "asdfghjkl;",
                "zxcvbnm,./"
            };
            
            StringBuilder originalMessage = new StringBuilder();
            
            for (int i = 0; i < typed.length(); i++) {
                char c = typed.charAt(i);
                
                // Find the character on the keyboard
                for (int r = 0; r < 3; r++) {
                    int col = keyboard[r].indexOf(c);
                    if (col != -1) {
                        // If hands moved Right ('R'), original was to the left (col - 1)
                        // If hands moved Left ('L'), original was to the right (col + 1)
                        int originalCol = (direction == 'R') ? col - 1 : col + 1;
                        originalMessage.append(keyboard[r].charAt(originalCol));
                        break;
                    }
                }
            }
            
            System.out.println(originalMessage.toString());
        }
    }
}