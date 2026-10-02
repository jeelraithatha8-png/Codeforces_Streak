//Problem 545A - Toy Cars
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem545A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            
            int n = sc.nextInt();
            
            // Track whether each car is good (1-based indexing)
            boolean[] isGood = new boolean[n + 1];
            Arrays.fill(isGood, true);
            
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    int val = sc.nextInt();
                    
                    switch (val) {
                        case 1:
                            isGood[i] = false; // Car i turned over
                            break;
                        case 2:
                            isGood[j] = false; // Car j turned over
                            break;
                        case 3:
                            isGood[i] = false; // Both turned over
                            isGood[j] = false;
                            break;
                        default:
                            break;
                    }
                }
            }
            
            ArrayList<Integer> goodCars = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (isGood[i]) {
                    goodCars.add(i);
                }
            }
            
            // Output the number of good cars and their indices
            System.out.println(goodCars.size());
            for (int i = 0; i < goodCars.size(); i++) {
                System.out.print(goodCars.get(i) + (i == goodCars.size() - 1 ? "" : " "));
            }
        }
        System.out.println();
    }
}
