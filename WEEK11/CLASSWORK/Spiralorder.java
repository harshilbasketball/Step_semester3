import java.util.*;
public class Spiralorder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int[][] grid = new int[m][n];

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                grid[i][j] = input.nextInt();
            }
        }
        int top = 0,bottom = m-1;
        int left = 0,right = n-1;

        ArrayList<Integer> result = new ArrayList<>();
        while(top <= bottom && left <= right){
            for(int j = left;j<=right;j++){
                result.add(grid[top][j]);
            }
            top++;
            for(int i = top;i<=bottom;i++){
                result.add(grid[i][right]);
            }
            right--;
            if(top<= bottom){
                for(int j = right;j>=left;j--){
                    result.add(grid[bottom][j]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i = bottom;i>=top;i--){
                    result.add(grid[i][left]);
                }
                left++;
            }
        }
        System.out.println(result);
    }
    
}
