import java.util.*;
public class Pairsumofsorted {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = input.nextInt();


        }
        int target = input.nextInt();
        int i = 0;
        int j = n-1;
        boolean found = false;

        while(i<j){
            int sum = nums[i] + nums[j];

            if(sum==target){
                System.out.println("(" + nums[i] + "," + nums[j] + ")");
                found = true;
                break;
            }else if(sum<target){
                i++;
            }else{
                j--;
            }
        }
        if(!found){
            System.out.println("Not Found");
        }
    }
    
}
