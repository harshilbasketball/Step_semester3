import java.util.*;

public class Heightlineup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number of Students: ");
        int n = input.nextInt();
        int[] heights = new int[n];

        System.out.println("Enter heights: ");
        for(int i = 0;i<n;i++){
            heights[i] = input.nextInt();

        }
        lineup(heights);
    }

    static void lineup(int[] heights){
        int n = heights.length;
        int pass = 1;

        for(int i = 0;i<n-1;i++){
            boolean swapped = false;

            for(int j = 0;j<n-1-i;j++){
                if(heights[i] > heights[j+1]){
                    int temp = heights[j];
                    heights[j] = heights[j+1];
                    heights[j+1] = temp;
                    swapped = true;
                }

            }
            System.out.println("Pass " + pass + ": " + Arrays.toString(heights));
            pass++;

            if(!swapped){
                break;
            }
        }
    }
    
}
