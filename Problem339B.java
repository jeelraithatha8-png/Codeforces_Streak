//Problem 339B- Xenia and Ringroad
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem339B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null || line.trim().isEmpty()) return;
        
        StringTokenizer st = new StringTokenizer(line);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        long totalTime = 0;
        int currentHouse = 1; // Xenia starts at house 1
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int targetHouse = Integer.parseInt(st.nextToken());
            
            if (targetHouse >= currentHouse) {
                totalTime += (targetHouse - currentHouse);
            } else {
                // Wrap around the ringroad from n to 1
                totalTime += (n - currentHouse + targetHouse);
            }
            
            // Update current position to the completed task's house
            currentHouse = targetHouse;
        }
        
        System.out.println(totalTime);
    }
}