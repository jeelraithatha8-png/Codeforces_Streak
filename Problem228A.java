//Problem 228A- Is your horseshoe on the other hoof?
import java.util.Scanner;

public class Problem228A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] colors = new int[4];

            for(int i =0; i<4; i++){
                colors[i] = sc.nextInt();
            }

            int count = 0;
            for(int i = 0; i<4; i++){
                for(int j = i+1; j<4; j++){
                    if(colors[i] == colors[j]){
                        count++;
                        break;
                    }
                }
            }

            System.out.println(count);
        }
    }
}