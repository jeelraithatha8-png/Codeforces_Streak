//Problem 116A- Tram
import java.util.Scanner;

public class Problem116A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int currentPassengers = 0;
            int maxCapacity = 0;
            
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt(); 
                int b = sc.nextInt(); 
                
                currentPassengers = currentPassengers - a + b;
                
                if (currentPassengers > maxCapacity) {
                    maxCapacity = currentPassengers;
                }
            }
            
            System.out.println(maxCapacity);
        }
    }
}