import java.util.Scanner;

public class Busiest_Bus {
    public static void busiestRow(int[][]grid,int n){
        int maxSum = 0;
        int row = 0;
        for(int i = 0;i < n;i++){
            int sum = 0;
            for(int j = 0;j< n;j++){
                sum += grid[i][j];
            }
            if(sum > maxSum){
                maxSum = sum;
                row = i;
            }
        }
       System.out.println(row);


        
    }
    

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the size: ");
    int n =input.nextInt();
    int[][] grid = new int[n][n];
    System.out.println("Enter the elements: ");
    for(int i = 0;i<n;i++){
        for(int j = 0;j<n;j++){
            grid[i][j] = input.nextInt();
        }
    }
    System.out.println("Busiest Row : ");
    busiestRow(grid,n);
    

}
}