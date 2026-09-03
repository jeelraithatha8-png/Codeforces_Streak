//Problem 379A- New Year Candles
import java.util.Scanner;

public class Problem379A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int totalHours = a;
            int remnants = a; 
            
            while (remnants >= b) {
                int newCandles = remnants / b;
                totalHours += newCandles;     
                remnants = (remnants % b) + newCandles;
            }

            System.out.println(totalHours);
        }
    }
}
