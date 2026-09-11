//Problem 426A - Sereja and Mugs
import java.util.Scanner;

public class Problem426A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			if (!sc.hasNextInt()) return;
			
			int n = sc.nextInt();
			int s = sc.nextInt();
			
			int totalSum = 0;
			int maxMug = 0;
			
			for (int i = 0; i < n; i++) {
			    int mug = sc.nextInt();
			    totalSum += mug;
			    if (mug > maxMug) {
			        maxMug = mug;
			    }
			}
			
			int waterPoured = totalSum - maxMug;
			
			if (waterPoured <= s) {
			    System.out.println("YES");
			} else {
			    System.out.println("NO");
			}
		}
    }
}