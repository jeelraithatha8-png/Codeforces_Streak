//Problem 490A - Team Olympaid
import java.util.Scanner;
import java.util.ArrayList;

public class Problem490A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            
            int n = sc.nextInt();
            
            ArrayList<Integer> prog = new ArrayList<>();   // Type 1: Programming
            ArrayList<Integer> math = new ArrayList<>();   // Type 2: Maths
            ArrayList<Integer> pe = new ArrayList<>();     // Type 3: PE
            
            for (int i = 1; i <= n; i++) {
                int t = sc.nextInt();
                if (t == 1) {
                    prog.add(i);
                } else if (t == 2) {
                    math.add(i);
                } else if (t == 3) {
                    pe.add(i);
                }
            }
            
            // The max number of teams is limited by the smallest group size
            int w = Math.min(prog.size(), Math.min(math.size(), pe.size()));
            
            System.out.println(w);
            
            // Form and print each team
            for (int i = 0; i < w; i++) {
                int pIndex = prog.get(i);
                int mIndex = math.get(i);
                int peIndex = pe.get(i);
                
                System.out.println(pIndex + " " + mIndex + " " + peIndex);
            }
        }
    }
}