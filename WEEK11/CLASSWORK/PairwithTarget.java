import java.util.*;
public class PairwithTarget {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = input.nextInt();
        }
        int target = input.nextInt();
        boolean found = false;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(nums[i] + nums[j] == target){
                    found = true;
                    break;
                }
            }
            if(found){
                break;
            }

        }
            System.out.println(found);

    }
    
}
