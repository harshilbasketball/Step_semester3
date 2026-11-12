
import java.util.Scanner;
public class Warehousebin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m= input.nextInt();
        int n= input.nextInt();

        int[][] grid = new int[n][m];
        
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                grid[i][j] = input.nextInt();

            }
        }
        int total = 0;
        int max = -1;
        int row = 0,col=0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                total += grid[i][j];

                if(grid[i][j] > max){
                    max = grid[i][j];
                    row = i;
                    col = j;

                }
            }
        }
        System.out.println("Total = " + total);
        System.out.println("Max Coordinate = (" + row + "," + col + ")" );
    }
    
}
