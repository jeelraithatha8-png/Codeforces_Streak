//Problem 275A- Lights Out
import java.util.Scanner;

public class Problem275A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[][] grid = new int[3][3];
            boolean[][] ans = new boolean[3][3];
            
            int[] dRow = {-1, 1, 0, 0};
            int[] dCol = { 0, 0, -1, 1};

            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    grid[i][j] = sc.nextInt();
                    ans[i][j] = true;
                }
            }

            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    if (grid[i][j] % 2 != 0) {
                        ans[i][j] = !ans[i][j];
                        for (int k = 0; k < 4; k++) {
                            int adjRow = i + dRow[k];
                            int adjCol = j + dCol[k];
                
                            if (adjRow >= 0 && adjRow < grid.length && 
                                adjCol >= 0 && adjCol < grid[0].length) {
                                    ans[adjRow][adjCol] = !ans[adjRow][adjCol];
                                }
                        }
                    }
                }
            }

            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    if(ans[i][j]){
                        System.out.print(1);
                    } else{
                        System.out.print(0);
                    }
                }
                System.out.println();
            }
        }
    }

}
